package company;

import java.util.HashMap;
import java.util.Map;

public class TelusDigital {
    public static void main(String[] args) {

        String name = "Nitesh Bhardwaj";

        HashMap <Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            frequency.put(name.charAt(i), frequency.getOrDefault(name.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: frequency.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
