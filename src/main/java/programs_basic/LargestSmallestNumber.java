package programs_basic;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 3, 23, 34, 99, 22};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int number : numbers){
            if(largest < number){
                largest = number;
            }
            else if(smallest > number){
                smallest = number;
            }
        }
        System.out.println("largest number: " + largest);
        System.out.println("smallest number: " + smallest);
    }
}
