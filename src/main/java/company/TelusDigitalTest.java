package company;

import java.util.ArrayList;

public class TelusDigitalTest {
    public static void main(String[] args) {

        int input = 100;

        ArrayList<Integer> evenArray = new ArrayList<>();
        ArrayList<Integer> oddArray = new ArrayList<>();
        ArrayList<Integer> primeArray = new ArrayList<>();

        for (int i = 1; i <= input; i++) {
            // Check even or odd
            if (i % 2 == 0) {
                evenArray.add(i);
            } else {
                oddArray.add(i);
            }

            // Check for prime
            if (i > 1) { // Only numbers > 1 can be prime
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeArray.add(i);
                }
            }
        }

        System.out.println("Even Numbers: " + evenArray);
        System.out.println("Odd Numbers: " + oddArray);
        System.out.println("Prime Numbers: " + primeArray);
    }
}
