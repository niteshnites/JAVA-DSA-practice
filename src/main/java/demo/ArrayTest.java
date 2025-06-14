package demo;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        // Find max and second max
        int [] numbers = {12,3,454,55,6,567,675,6,45,34,323,2232,32,23};

        int maxNumber = Arrays.stream(numbers).max().getAsInt();
        System.out.println("maxNumber : " + maxNumber);

        int secondMaxNumber = Arrays.stream(numbers).filter(number -> number < maxNumber).max().getAsInt();
        System.out.println("secondMaxNumber : " + secondMaxNumber);

        int thirdMaxNumber = Arrays.stream(numbers).filter(number -> number < secondMaxNumber).max().getAsInt();
        System.out.println("thirdMaxNumber : " + thirdMaxNumber);

    }
}
