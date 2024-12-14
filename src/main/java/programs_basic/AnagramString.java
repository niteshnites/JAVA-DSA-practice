package programs_basic;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {

        String string1 = "listen";
        String string2 = "silent";

        char [] charArray1 = string1.toCharArray();
        Arrays.sort(charArray1);

        char [] charArray2 = string2.toCharArray();
        Arrays.sort(charArray2);

        boolean isAnagram = Arrays.equals(charArray1, charArray2);

        if (isAnagram){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}
