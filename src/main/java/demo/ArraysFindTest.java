package demo;

import java.util.Arrays;

public class ArraysFindTest {

    public static void main(String[] args) {

        // Find Element
        int [] array1 = {1,2,34,5,6,78,3,4,5,5,6,7,5,4,3};
        int find = 783;
        boolean isFound = false;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == find) {
                System.out.println(array1[i] + " found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("NOT FOUND");
        }

        // Find the largest element in array
        int[] array2 = {1, 2, 34, 5, 6, 78, 3, 4, 5, 5, 6, 7, 5, 4, 3, 0};

        int max = Arrays.stream(array2).max().getAsInt();

        int secondMax = Arrays.stream(array2)
                .filter(n -> n < max)
                .max()
                .orElseThrow(() -> new RuntimeException("No second max found"));

        System.out.println("Second Highest: " + secondMax);

        // other way
        int[] array3 = {1, 2, 34, 5, 6, 78, 3, 4, 5, 5, 6, 7, 5, 4, 3, 0};
        int maxNum = array3[1];
        int maxSecNum = -999999999;

        for (int num : array3) {
            if(maxNum < num) {
                maxNum = num;
            }
        }
        System.out.println("MAX: " + maxNum);

        // second max number is greater than num and number less than max number
        for (int num : array3) {
            if(maxSecNum < num && num < maxNum) {
                maxSecNum = num;
            }
        }
        System.out.println("SECOND MAX: " + maxSecNum);

    }

}
