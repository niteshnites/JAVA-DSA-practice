package programs_top_10;

public class SecondLargest {
    public static void main(String[] args) {

        int [] numbers = {12, 45, 23, 67, 34, 89, 22};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers){
            if(number > largest){
                secondLargest = largest;
                largest = number;

            }else if(number > secondLargest && number != largest){
                secondLargest = number;
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);

    }
}
