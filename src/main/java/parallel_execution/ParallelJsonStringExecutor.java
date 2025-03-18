package prallel_execution;

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

        // Step 1: Read JSON file as a raw string
        String jsonString = readJsonAsString("data.json");

        // Step 2: Parse JSON into Map<String, Map<String, String>>
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Map<String, String>> serviceMap = mapper.readValue(
                jsonString, new TypeReference<Map<String, Map<String, String>>>() {});

        // Step 3: Outer Executor for service types
        ExecutorService outerExecutor = Executors.newFixedThreadPool(serviceMap.size());

        for (Map.Entry<String, Map<String, String>> serviceEntry : serviceMap.entrySet()) {
            outerExecutor.submit(() -> {
                String serviceType = serviceEntry.getKey();
                Map<String, String> innerMap = serviceEntry.getValue();

                System.out.println("🚀 Running: " + serviceType + " | Thread: " + Thread.currentThread().getName());

                // Inner executor for each mosaic_id -> itsm_id pair
                ExecutorService innerExecutor = Executors.newFixedThreadPool(innerMap.size());

                innerMap.forEach((mosaicId, itsmId) -> {
                    innerExecutor.submit(() -> {
                        Resource resource = threadLocalResource.get();
                        resource.process(serviceType, mosaicId, itsmId);
                        threadLocalResource.remove();
                    });
                });

                innerExecutor.shutdown();
                while (!innerExecutor.isTerminated()) {}
            });
        }

        outerExecutor.shutdown();
    }

    // Utility to read JSON file as String
    private static String readJsonAsString(String fileName) throws IOException {
        ClassLoader classLoader = ParallelJsonStringExecutor.class.getClassLoader();
        // This will work when services.json is in the same package or in /resources/prallel_execution/
        var resource = classLoader.getResource("prallel_execution/" + fileName);

        if (resource == null) {
            throw new IllegalArgumentException("File not found! " + fileName);
        }

        return new String(Files.readAllBytes(Paths.get(resource.getPath())));
    }


    static class Resource {
        void process(String serviceType, String mosaicId, String itsmId) {
            System.out.println("🧩 [" + serviceType + "] Thread: " + Thread.currentThread().getName()
                    + " | Processing: " + mosaicId + " -> " + itsmId);
        }
    }
}
