package interview_prep;

public class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            // Create the instance only if it doesn't exist
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getClass().getName());
    }
}
