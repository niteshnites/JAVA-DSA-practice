package company;

import java.util.*;

public class PublicesSapientTest {
    public static void main(String[] args) {
        // $45,$67,$495,$564,$350,$76
        // Store in arrays
        String input = "$45,$67,$495,$564,$350,$76";

        // split by comma
        String[] words = input.split(",");

        // remove '$' and store in integer array
        int[] numbersArray = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replace("$", "");
            numbersArray[i] = Integer.parseInt(words[i]);
        }

        // convert array into ArrayList
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbersArray) {
            numberList.add(num);
        }

        // find the maximum number
        int maxNumber = Collections.max(numberList);

        // find and print the second maximum number
        int secondMax = numberList.stream()
                .filter(num -> num < maxNumber)
                .max(Integer::compareTo)
                .orElseThrow(() -> new NoSuchElementException("No second max found"));

        System.out.println("Second Maximum Number: " + secondMax);
    }
}
