public class FactorialNumberTest {
    public static void main(String[] args) {

        // factorial of a number
        // input is 5 than output should be 120
        // which means 1*2*3*4*5

        // step 1 initialize the input and result
        int number = 5;
        int result = 1;

        // step 2 write a loop to calculate 1 to provided number for result
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        // step 3 print the result as an output
        System.out.println("Output: " + result);
    }
}
