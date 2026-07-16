package interview_prep;

public class SmallestNumber {
    public static void main(String[] args) {

        int [] numbers = {10, 5, 20, 8, 15, 12};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < numbers.length; i++) {

            if(numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            }

            else if(numbers[i] > smallest && numbers[i] < secondSmallest) {
                secondSmallest = numbers[i];
            }

        }

        System.out.println("Smallest Number is: " + smallest);
        System.out.println("Second Smallest Number is: " + secondSmallest);

    }
}
