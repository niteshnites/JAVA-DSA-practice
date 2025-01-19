package utility;

public class Utility {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to reverse a string
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to calculate factorial of a number
    public int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Main method to test all functionalities
    public static void main(String[] args) {
        Utility utility = new Utility();

        // Test addition
        System.out.println("Addition of 5 and 3: " + utility.add(5, 3));

        // Test prime check
        int testNumber = 29;
        System.out.println(testNumber + " is prime: " + utility.isPrime(testNumber));

        // Test string reversal
        String testString = "Automation";
        System.out.println("Reversed string: " + utility.reverseString(testString));

        // Test factorial calculation
        int factorialNumber = 5;
        System.out.println("Factorial of " + factorialNumber + ": " + utility.factorial(factorialNumber));
    }
}
