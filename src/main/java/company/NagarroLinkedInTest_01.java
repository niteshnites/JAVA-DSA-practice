package company;

import java.util.ArrayList;

public class NagarroLinkedInTest_01 {
    public static void main(String[] args) {

        //  Shift all even numbers to left side of array and odd number to right side
        int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 28,45 };

        ArrayList <Integer> evenList = new ArrayList<>();
        ArrayList <Integer> oddList = new ArrayList<>();
        ArrayList <Integer> outputList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                evenList.add(array[i]);
            }else{
                oddList.add(array[i]);
            }
        }

        outputList.addAll(evenList);
        outputList.addAll(oddList);

        System.out.println(outputList);
    }
}
