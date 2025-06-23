package company;

public class VonageTest1 {
    public static void main(String[] args) {

        //create a java program to get the
        //input is 123 or 1234
        //and do operation like 1^3 2^3 and 3^3 and do the sum after ^3 for and compare with actual input

        int number = 153;
        int input = number;
        int digits = String.valueOf(number).length();
        System.out.println(digits);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        System.out.println("Sum of digits with power : " + digits + " : " + sum);

        if (sum == input) {
            System.out.println("SUCCESS...");
        } else {
            System.out.println("FAILED...");
        }

    }
}
