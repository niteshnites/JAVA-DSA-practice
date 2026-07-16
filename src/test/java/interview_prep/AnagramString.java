package interview_prep;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        char [] chars1 = word1.toCharArray();
        char [] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if(Arrays.equals(chars1, chars2)) {
            System.out.println("Anagram String");
        } else {
            System.out.println("Not Anagram String");
        }
    }
}
