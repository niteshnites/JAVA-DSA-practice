package interview_prep;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating {
    public static void main(String [] args) {

        // input swiss // output: w

        String string =  "swiss";

        Map<Character, Integer> frequency = new LinkedHashMap<>();
        for(char ch : string.toCharArray()){
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        System.out.println(frequency);

        for(Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
