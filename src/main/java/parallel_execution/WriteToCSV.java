package parallel_execution;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

public class WriteToCSV {

    // ThreadLocal to hold data per thread
    private static ThreadLocal<Map<String, Object>> threadLocalData = new ThreadLocal<>();

    // A synchronized list to collect results from all threads
    private static List<Map<String, Object>> allResults = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException, IOException {
        int THREAD_COUNT = 4;
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        System.out.println("🟢 Program Start Time: " + sdf.format(new Date()));

        List<String> mockServiceTypes = Arrays.asList("Service-A", "Service-B", "Service-C", "Service-D");

        // Submit tasks
        for (String svcType : mockServiceTypes) {
            executor.submit(() -> {
                Map<String, Object> localMap = new HashMap<>();
                localMap.put("serviceType", svcType);
                localMap.put("data", generateDummyData(svcType));
                threadLocalData.set(localMap);

                processData();

                threadLocalData.remove();
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        // After all threads are complete, write CSV
        writeResultsToCSV("output.csv");

        System.out.println("🔴 Program End Time: " + sdf.format(new Date()));
    }

    // Simulate heavy processing logic
    public static void processData() {
        Map<String, Object> threadData = threadLocalData.get();
        System.out.println("Thread " + Thread.currentThread().getName() + " processing " + threadData.get("serviceType"));

        try {
            Thread.sleep(1000); // Simulating heavy task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        allResults.add(threadData);
    }

    // Dummy data for demonstration
    public static Map<String, String> generateDummyData(String svcType) {
        Map<String, String> data = new HashMap<>();
        data.put("key1", svcType + "-value1");
        data.put("key2", svcType + "-value2");
        data.put("key3", svcType + "-value3");
        return data;
    }

    // CSV Writer
    public static void writeResultsToCSV(String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("ServiceType,Key,Value\n");
            for (Map<String, Object> result : allResults) {
                String svcType = (String) result.get("serviceType");
                Map<String, String> data = (Map<String, String>) result.get("data");
                for (Map.Entry<String, String> entry : data.entrySet()) {
                    writer.append(svcType).append(",")
                            .append(entry.getKey()).append(",")
                            .append(entry.getValue()).append("\n");
                }
            }
        }
        System.out.println("✅ CSV written to " + filePath);
    }
}
