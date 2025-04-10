package practice;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyTest {
    public static void main(String[] args) {

        String string = "Java is a programming language";
        Map <Character, Integer> frequencyMap = new HashMap<>();

        for (char character: string.toCharArray()){
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0)+1);
        }
        for (Map.Entry<Character, Integer> entry: frequencyMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
