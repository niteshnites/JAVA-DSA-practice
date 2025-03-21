package parallel_execution;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

public class WriteToCSV {

    private static ThreadLocal<List<String[]>> threadLocalData = new ThreadLocal<>();
    private static final List<String[]> allResults = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException, IOException {
        int THREAD_COUNT = 4;
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        System.out.println("🟢 Program Start Time: " + sdf.format(new Date()));

        List<String> mockServiceTypes = Arrays.asList("Service-C", "Service-A", "Service-B", "Service-D");

        // Submit tasks
        for (String svcType : mockServiceTypes) {
            executor.submit(() -> {
                List<String[]> localList = new ArrayList<>();
                Map<String, String> data = generateDummyData(svcType);
                for (Map.Entry<String, String> entry : data.entrySet()) {
                    localList.add(new String[]{svcType, entry.getKey(), entry.getValue()});
                }
                threadLocalData.set(localList);

                processData();
                threadLocalData.remove();
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        // Sort rows based on the first column (ServiceType)
        sortResults();

        // Write sorted data to CSV
        writeResultsToCSV("output.csv");

        System.out.println("🔴 Program End Time: " + sdf.format(new Date()));
    }

    public static void processData() {
        List<String[]> threadData = threadLocalData.get();
        System.out.println("Thread " + Thread.currentThread().getName() + " processed " + threadData.get(0)[0]);
        allResults.addAll(threadData);
    }

    public static Map<String, String> generateDummyData(String svcType) {
        Map<String, String> data = new HashMap<>();
        data.put("key1", svcType + "-value1");
        data.put("key2", svcType + "-value2");
        data.put("key3", svcType + "-value3");
        return data;
    }

    public static void sortResults() {
        allResults.sort(Comparator.comparing(row -> row[0])); // sort by first column
    }

    public static void writeResultsToCSV(String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("ServiceType,Key,Value\n");
            for (String[] row : allResults) {
                writer.append(String.join(",", row)).append("\n");
            }
        }
        System.out.println("✅ Sorted CSV written to " + filePath);
    }
}
