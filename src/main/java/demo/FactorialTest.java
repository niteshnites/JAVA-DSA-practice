package demo;

public class FactorialTest {
    public static void main(String[] args) {

        // Factorial of a number
        int number = 5;
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result *= i;
        }
        System.out.println("Factorial of a number: " + result);

    }
}
