package programs_basic;

import java.util.Arrays;

public class ArrayRemoveDuplicate2 {
    public static void main(String[] args) {

        // Without Using Set
        int[] arr = {12, 1, 3, 43, 435, 45, 3, 435, 767, 68, 1};
        Arrays.sort(arr);

        int [] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                result[index++] = arr[i];
            }
        }
        result[index++] = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
