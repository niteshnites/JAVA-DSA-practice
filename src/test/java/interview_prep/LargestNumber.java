package interview_prep;

public class LargestNumber {
    public static void main(String[] args) {

        int [] numbers = {10, 5, 20, 8, 15, 12};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : numbers) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if(num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }



        System.out.println("Largest number is: " + largest);
        System.out.println("Second Largest number is: " + secondLargest);
    }
}
