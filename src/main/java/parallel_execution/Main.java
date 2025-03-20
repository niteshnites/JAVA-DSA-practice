package parallel_execution;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    static HashMap<String, Map<String, String>> mappings;
    private static ThreadLocal<HashMap<String, Object>> threadLocalServiceType = new ThreadLocal<>();

    public static void main(String[] args) throws Exception {

        int THREAD_COUNT = 4; // Try changing this value!

        long startTime = System.currentTimeMillis();

        String inputMapping = readJsonAsString("data.json");

        ObjectMapper mapper = new ObjectMapper();
        mappings = mapper.readValue(inputMapping, new TypeReference<>() {});

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        if (mappings != null && !mappings.isEmpty()) {
            for (String mosaicSvcType : mappings.keySet()) {
                final String serviceType = mosaicSvcType;
                executor.submit(() -> {
                    try {
                        HashMap<String, Object> localMap = new HashMap<>();
                        localMap.put("serviceType", serviceType);
                        localMap.put("subMap", mappings.get(serviceType));

                        threadLocalServiceType.set(localMap);

                        new Main().runMethod();

                        threadLocalServiceType.remove();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
            }
        }
        executor.shutdown();

        while (!executor.isTerminated()) {
            Thread.sleep(100);
        }

        long endTime = System.currentTimeMillis();
        double totalSeconds = (endTime - startTime) / 1000.0;

        System.out.println("⏱️ Total Execution Time: " + totalSeconds + " seconds");
    }

    public void runMethod() {
        HashMap<String, Object> dataMap = threadLocalServiceType.get();
        String svcType = (String) dataMap.get("serviceType");
        Map<String, String> subMap = (Map<String, String>) dataMap.get("subMap");

        System.out.println(Thread.currentThread().getId() + " :: " + Thread.currentThread().getName() +
                " :: Processing ServiceType: " + svcType);

        try {
            Thread.sleep(1000); // Simulating some heavy task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (subMap != null) {
            subMap.forEach((k, v) -> {
                System.out.println("    -> " + k + " = " + v);
            });
        }
    }

    private static String readJsonAsString(String fileName) throws IOException {
        ClassLoader classLoader = Main.class.getClassLoader();
        var resource = classLoader.getResource("parallel_execution/" + fileName);

        if (resource == null) {
            throw new IllegalArgumentException("File not found! " + fileName);
        }

        return new String(Files.readAllBytes(Paths.get(resource.getPath())));
    }
}
