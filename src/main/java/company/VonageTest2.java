package company;

import org.testng.annotations.Test;

import java.util.HashMap;

public class VonageTest2 {

    @Test
    public void mainMethod() {
        // create a java program to get the
        // input is 123 or 1234
        // and do operation like 1^3 2^3 and 3^3 and do the sum after ^3 for and compare with actual input

        String input = "123";
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            int result = doMultiply(digit, input.length());
            hashMap.put(digit, result);
        }

        System.out.println(hashMap);
    }

    public int doMultiply(int digit, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * digit;
        }
        return result;
    }

}
