package programs_top_10;

public class PrimeNumbers {
    public static void main(String[] args) {

        // Prime number check program
        // conditions (A prime number cannot be divided evenly by any number other than 1 and itself)
        // 1. number should be greater than 1
        // 2. Only be divisible by 1 and itself
        // example 2, 3, 5, 7, 11, 13, 17, 19 are prime numbers

        // Program to check number is prime or not
        int number = 17;
        int count = 0;

        if(number <= 1){
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <= number/2; i++) {
                if(number % i == 0){
                    count = count + 1;
                }
            }
            if (count == 0){
                System.out.println("Prime");
            }else {
                System.out.println("Not Prime");
            }
        }


        // Other way
        int num = 10;
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
