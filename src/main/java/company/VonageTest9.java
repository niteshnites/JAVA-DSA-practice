package company;

import java.util.HashMap;
import java.util.Map;

public class VonageTest9 {
    public static void main(String[] args) {

        // abcabcbb -> abc
//        String inputString = "abcabcbb";
        String inputString = "testting";

        Map<Character, Integer> hashMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int left = 0;

        for (int right = 0; right < inputString.length(); right++ ) {
            char ch = inputString.charAt(right);
            if(hashMap.containsKey(ch)) {
                left = Math.max(hashMap.get(ch) + 1, left);
            }
            hashMap.put(ch, right);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }

        }
        String longestSubString = inputString.substring(start, start + maxLength);
        System.out.println("Longest Sub String :: " + longestSubString);
        System.out.println("Max Length :: " + maxLength);

    }
}
