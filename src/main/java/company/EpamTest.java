package company;

import java.util.*;

public class EpamTest {
    public static void main(String[] args) {

        int[] array = {1, 2, 234, 54, 546, 57, 54, 3, 4, 342, 1, 1, 234, 57, 3, 54};

        Map<Integer, Integer> frequencyMap = new TreeMap<>();

        // Calculate frequencies in a single loop
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        System.out.println("Element : Frequency");
        frequencyMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
