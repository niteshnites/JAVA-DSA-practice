package core_java;

// Multithreading and Concurrency Example
public class MultithreadingConcurrency {

    // Shared resource
    static class SharedCounter {
        private int count = 0;

        // Synchronized method to ensure thread safety
        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    // Task implemented using Runnable
    static class IncrementTask implements Runnable {
        private final SharedCounter counter;

        public IncrementTask(SharedCounter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            System.out.println(Thread.currentThread().getName() + " finished execution.");
        }
    }

    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        // Create threads using the Thread class
        Thread thread1 = new Thread(new IncrementTask(counter), "Thread-1");
        Thread thread2 = new Thread(new IncrementTask(counter), "Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Use a thread pool for concurrent tasks
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(3);

        // Submit tasks to the executor
        executorService.submit(new IncrementTask(counter));
        executorService.submit(new IncrementTask(counter));
        executorService.submit(new IncrementTask(counter));

        // Shutdown the executor
        executorService.shutdown();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for all tasks in the executor to finish
        while (!executorService.isTerminated()) {
            // Wait for termination
        }

        // Print final count
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}

