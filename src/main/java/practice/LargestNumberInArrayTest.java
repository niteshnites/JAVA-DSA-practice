package practice;

public class LargestNumberInArrayTest {
    public static void main(String[] args) {

        int [] numbers = {1,45,78,54,8,48,45,458,45,100};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if(number > largest){
                secondLargest = largest;
                largest = number;
            } else if (secondLargest < largest && secondLargest < number) {
                secondLargest = number;
            }
        }
        System.out.println("largest: " + largest);
        System.out.println("second largest: " + secondLargest);
    }
}
