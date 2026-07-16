package interview_prep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {

        String str = "I love programming I love programming";
        char [] chars = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }

        System.out.println(map);

        String [] words = str.split(" ");
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(frequencyMap);

    }
}
