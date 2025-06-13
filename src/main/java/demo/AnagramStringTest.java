package demo;

import java.util.Arrays;

public class AnagramStringTest {
    public static void main(String[] args) {

    // silent - listen
    String str1 = "silent";
    String str2 = "listen";

    char [] str1_char = str1.toCharArray();
    char [] str2_char = str2.toCharArray();

    Arrays.sort(str1_char);
    Arrays.sort(str2_char);

    if(Arrays.equals(str1_char, str2_char))
        System.out.println("ANAGRAM ...");
    else
        System.out.println("Not Anagram ...");

    }
}
