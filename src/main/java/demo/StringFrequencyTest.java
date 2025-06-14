package demo;

import java.util.HashMap;
import java.util.Map;

public class StringFrequencyTest {
    public static void main(String[] args) {

        String str = "India is my country";
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            charFrequency.put(key, charFrequency.getOrDefault(key, 0) + 1);
        }
        System.out.println(charFrequency);
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }
}
