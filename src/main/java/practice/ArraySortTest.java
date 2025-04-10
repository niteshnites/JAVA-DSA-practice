package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySortTest {
    public static void main(String[] args) {

        int [] numbers1 = {1,4,5,7,57,84,545,42,0};
        Arrays.sort(numbers1);
        for(int number : numbers1){
            System.out.print(number + " ");
        }
        System.out.println();


        int [] numbers = {1,4,5,7,57,8,84,545,42,0};

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for(int num: numbers){
            System.out.print(num + " ");
        }

        System.out.println();
        int remove = 8;
        ArrayList <Integer> newList = new ArrayList<>();
        for (int i = 0; i<numbers.length; i++){
            if(numbers[i] != remove){
                newList.add(numbers[i]);
            }
        }
        System.out.println(newList);
    }
}