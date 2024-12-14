package programs_basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayRemoveDuplicate {
    public static void main(String[] args) {

        // Removed Duplicate From Array
        int [] array = {2,3,4,5,6,7,5,3,2,4,67};

        Set <Integer> uniqueSet = new HashSet<>();
        for(int arr: array){
            uniqueSet.add(arr);
        }
        System.out.println("Unique Element In SET: ");
        System.out.println(uniqueSet);

        // Add Set Elements To Array
        int [] updatedArray = new int [uniqueSet.size()];
        int index = 0;
        for (int ele : uniqueSet){
            updatedArray[index++] = ele;
        }
        System.out.println("Unique Element In ARRAY: ");
        Arrays.sort(updatedArray);
        System.out.println(Arrays.toString(updatedArray));
    }
}
