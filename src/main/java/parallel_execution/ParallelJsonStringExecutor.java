package parallel_execution;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ParallelJsonStringExecutor {

    private static ThreadLocal<Resource> threadLocalResource = ThreadLocal.withInitial(Resource::new);

    public static void main(String[] args) throws Exception {

        // 💡 Define outer thread pool size manually
        int outerThreadCount = 2; // Only one thread pool now

        // Step 1: Read JSON file as a raw string
        String jsonString = readJsonAsString("data.json");

        // Step 2: Parse JSON into Map<String, Map<String, String>>
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Map<String, String>> serviceMap = mapper.readValue(
                jsonString, new TypeReference<Map<String, Map<String, String>>>() {});

        // Step 3: Single Executor for service types (no inner executor)
        ExecutorService outerExecutor = Executors.newFixedThreadPool(outerThreadCount);

        for (Map.Entry<String, Map<String, String>> serviceEntry : serviceMap.entrySet()) {
            outerExecutor.submit(() -> {
                String serviceType = serviceEntry.getKey();
                Map<String, String> keyValuePairs = serviceEntry.getValue();

                System.out.println("🚀 Running ServiceType: " + serviceType + " | Thread: " + Thread.currentThread().getName());

                // Process all sub-nodes inside this thread
                keyValuePairs.forEach((mosaicKey, itsmValue) -> {
                    Resource resource = threadLocalResource.get();
                    resource.process(serviceType, mosaicKey, itsmValue);
                    // Optional: threadLocalResource.remove(); // only if you want to remove after serviceType block
                });

            });
        }

        outerExecutor.shutdown();
    }

    // Utility to read JSON file as String from the same package
    private static String readJsonAsString(String fileName) throws IOException {
        ClassLoader classLoader = ParallelJsonStringExecutor.class.getClassLoader();
        var resource = classLoader.getResource("parallel_execution/" + fileName);

        if (resource == null) {
            throw new IllegalArgumentException("File not found! " + fileName);
        }

        return new String(Files.readAllBytes(Paths.get(resource.getPath())));
    }

    // Processor stays the same
    static class Resource {
        void process(String serviceType, String mosaicKey, String itsmValue) {
            System.out.println("🧩 [" + serviceType + "] Thread: " + Thread.currentThread().getName()
                    + " | Processing: " + mosaicKey + " -> " + itsmValue);
        }
    }
}
