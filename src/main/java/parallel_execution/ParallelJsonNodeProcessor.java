package parallel_execution;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.concurrent.*;
import java.util.*;

public class ParallelJsonNodeProcessor {

    public static void main(String[] args) throws Exception {
        // Assuming jsonArrayNode is already initialized and is a JsonNode representing an array
        JsonNode jsonArrayNode = getJsonArrayNode(); // Your existing JsonNode

        ExecutorService executor = Executors.newFixedThreadPool(4); // Tune thread count as needed
        List<Future<?>> futures = new ArrayList<>();

        for (JsonNode node : jsonArrayNode) {
            futures.add(executor.submit(() -> {
                try {
                    processNode(node);
                } catch (Exception e) {
                    System.err.println("Error processing node: " + node + " - " + e.getMessage());
                }
            }));
        }

        // Wait for all tasks to complete
        for (Future<?> future : futures) {
            future.get();
        }

        executor.shutdown();
        System.out.println("All tasks completed.");
    }

    // Dummy method - replace with your actual JsonNode source
    public static JsonNode getJsonArrayNode() {
        // This would be where you fetch or receive your JsonNode response from elsewhere
        // Placeholder for illustration only
        return null;
    }

    public static void processNode(JsonNode node) {
        // Your logic here
        System.out.println("Thread: " + Thread.currentThread().getName() +
                " processing ID: " + node.get("id").asInt());

        // Simulate time-consuming work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
