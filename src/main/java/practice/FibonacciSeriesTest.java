package practice;

class FibonacciSeriesTest {
    public static void main(String[] args) {

        int number = 10;
        int first = 0;
        int second = 1;

        for (int i = 0; i < number; i++) {
            System.out.print(first  + " ");
            int sum = first + second;
            first = second;
            second = sum;
        }

    }
}
