package core_java;

// Java program demonstrating different Exception Handling techniques
class ExceptionHandling {

    // Method demonstrating try-catch
    public static void divideByZero() {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Division by zero is not allowed.");
        }
    }

    // Method demonstrating multiple catch blocks
    public static void multipleCatch() {
        try {
            int arr[] = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: Array index out of bound.");
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e);
        }
    }

    // Method demonstrating finally block
    public static void finallyBlockExample() {
        try {
            System.out.println("Inside try block");
            int num = 10 / 2;
            System.out.println("Result: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes.");
        }
    }

    // Method demonstrating throw keyword
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Access granted.");
    }

    // Method demonstrating throws keyword
    public static void checkedExceptionExample() throws InterruptedException {
        System.out.println("Sleeping for 2 seconds...");
        Thread.sleep(2000); // This throws InterruptedException
        System.out.println("Woke up!");
    }

    // Custom Exception Class
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    // Method demonstrating custom exception
    public static void customExceptionMethod(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Negative values are not allowed!");
        }
        System.out.println("Valid value: " + value);
    }

    public static void main(String[] args) {
        // Try different exception handling techniques
        divideByZero();
        multipleCatch();
        finallyBlockExample();

        // Using throw keyword
        try {
            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        // Using throws keyword
        try {
            checkedExceptionExample();
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception caught: " + e);
        }

        // Custom exception handling
        try {
            customExceptionMethod(-5);
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}

