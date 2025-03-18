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

class ParallelJsonStringExecutor {

    private static ThreadLocal<Resource> threadLocalResource = ThreadLocal.withInitial(Resource::new);

    public static void main(String[] args) throws Exception {

        // 💡 Define outer thread pool size manually
        int THREAD_COUNT = 2;

        // Step 1: Read JSON file as a raw string
        String inputMapping = readJsonAsString("data.json");

        // Step 2: Parse JSON into Map<String, Map<String, String>>
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> mappings = mapper.readValue(inputMapping, new TypeReference<HashMap>(){});

        // Step 3: Single Executor for service types (no inner executor)
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        if(mappings!=null && !(mappings.isEmpty())){

            for (String mosaicSvcType : mappings.keySet()) {
                executor.submit(() -> {
                    System.out.println("🚀 Running ServiceType: " + mosaicSvcType + " | Thread: " + Thread.currentThread().getName());
                });
            }
        }
        executor.shutdown();
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
