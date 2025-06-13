package demo;

import java.util.HashMap;
import java.util.Map;

public class ArrayCountTest {
    public static void main(String[] args) {

        int[] arrays = {32, 35, 32, 4545, 65, 76, 87, 98, 98, 9, 654, 35, 2, 345};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int key: arrays) {
            frequencyMap.put(key, frequencyMap.getOrDefault(key, 0) + 1);
        }

        frequencyMap.forEach((k, v) -> System.out.println(k + " -> " + v));

    }
}
