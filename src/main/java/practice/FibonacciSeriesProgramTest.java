package practice;

public class FibonacciSeriesProgramTest {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;
        }
    }
}
