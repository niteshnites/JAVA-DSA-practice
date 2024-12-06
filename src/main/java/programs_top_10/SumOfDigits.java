package programs_top_10;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 123456789;
        int sum = 0;

        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Sum of Digits are: " + sum);

    }
}
