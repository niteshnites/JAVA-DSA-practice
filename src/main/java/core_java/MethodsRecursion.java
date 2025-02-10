package core_java;

// Class for methods recursion programs
public class MethodsRecursion {

    public static void main(String[] args) {
        // 1. Calling a simple method
        greet();

        // 2. Calling method with parameters
        printMessage("Welcome to Java Methods and Recursion!");

        // 3. Calling method with return value
        int sumResult = addNumbers(10, 20);
        System.out.println("Sum of 10 and 20: " + sumResult);

        // 4. Method Overloading Example
        System.out.println("Sum of 3 numbers: " + addNumbers(5, 10, 15));

        // 5. Recursive method (Factorial)
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));

        // 6. Recursive method (Fibonacci)
        int n = 6;
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // 1. Simple method
    public static void greet() {
        System.out.println("Hello! This is a simple method.");
    }

    // 2. Method with parameters
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // 3. Method with return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 4. Method Overloading (same method name with different parameters)
    public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    // 5. Recursive method (Factorial)
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive call
    }

    // 6. Recursive method (Fibonacci)
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case
        } else if (n == 1) {
            return 1; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }
}
