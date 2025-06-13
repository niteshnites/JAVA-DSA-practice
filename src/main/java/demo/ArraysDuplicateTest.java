package demo;

import java.util.HashMap;
import java.util.Map;

public class ArraysDuplicateTest {
    public static void main(String[] args) {

        int[] arrays = {32, 35, 32, 4545, 65, 76, 87, 98, 98, 9, 654, 35, 2, 345};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arrays) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println("Duplicate " + entry.getKey() + " -> " + entry.getValue());
            }
        }

    }
}
