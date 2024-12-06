package programs_basic;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {

        String str = "I need to now the character frequency";
        Map <Character, Integer> frequencyMap = new HashMap<>();

        for (char character: str.toCharArray()){
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0)+1);
        }

        for (Map.Entry<Character, Integer> entry: frequencyMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
