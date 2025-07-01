package company;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class VonageTest11 {

    @Test
    public void mainMethod() {
        // create a java program to get the
        // input is 123 or 1234
        // and do operation like 1^3 2^3 and 3^3 and do the sum after ^3 for and compare with actual input

        String input = "153";
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            int result = doMultiply(digit, input.length());
            hashMap.put(digit, result);
        }

        System.out.println(hashMap);

        int finalSum = 0;

        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            finalSum = finalSum + entry.getValue();
        }

        if(finalSum == Integer.parseInt(input)) {
            System.out.println("SUCCESS...");
        } else {
            System.out.println("FAILED...");
        }

    }

    public int doMultiply(int digit, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * digit;
        }
        return result;
    }

}
