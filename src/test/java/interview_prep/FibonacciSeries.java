package interview_prep;

public class FibonacciSeries {
    public static void main(String[] args) {

        //0,1,1,2,3,5,8,13

        // 1.
        int number = 7;

        int first = 0;
        int second = 1;

        for(int i = 0; i < number; i++) {
            System.out.print(first + " ");
            int result = first + second;
            first = second;
            second = result;
        }

    }
}
