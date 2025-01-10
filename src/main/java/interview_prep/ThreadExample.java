package interview_prep;

public class ThreadExample {
    public static void main(String[] args) {

        System.out.println(" from " + Thread.currentThread().getName());

        MyThread thread = new MyThread();
        thread.start(); // Start the thread
        System.out.println();

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
        System.out.println(" from " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
        System.out.println(" from " + Thread.currentThread().getName());
    }
}
