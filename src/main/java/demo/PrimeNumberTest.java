package demo;

public class PrimeNumberTest {
    public static void main(String[] args) {

        // Prime Number
        // 2, 3, 5, 7, 11, 13, 17

        int number = 17;
        boolean isPrime = true;

        if(number <= 1) {
            System.out.println("Not PRIME");
        } else {
            for (int i = 2; i < number / 2; i++) {
                System.out.println(i);
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("PRIME");
            } else {
                System.out.println("Not PRIME");
            }
        }

    }
}
