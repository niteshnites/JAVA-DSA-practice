package interview_prep;

public class FactorialOfNumber {
    public static void main(String[] args) {

        // 1.
        int number = 6;
        int result = 1;
        for(int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);

        // 2.
        System.out.println(factorialRecursive(5));
    }

   public static long factorialRecursive(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n -1);
   }
}
