package programs_top_10;

public class FibonacciSeries {
    public static void main(String[] args) {

        // Program to print Fibonacci Series till provided number
        // series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ..

        int number = 10;

        int first = 0;
        int second = 1;

        System.out.print("0 1 ");
        for (int i = 1; i <= number-2; i++){
            int sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }

        System.out.println();

        int n = 10;  // Number of terms
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;
        }
    }
}
