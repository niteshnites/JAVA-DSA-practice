package demo;

import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args){

        // Reverse of a String
        String str = "India is my Country";
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

        // Other Way
        String str2 = "This is a new Home";
        String reverse = "";
        for (int i = str2.length()-1; i >= 0 ; i--) {
            reverse += str2.charAt(i);
        }
        System.out.println(reverse);

        // Reverse Words
        String str3 = "I can speak in two or three languages";
        String [] words = str3.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            System.out.print(sb.reverse());
            System.out.print(" ");
        }

        System.out.println();

        // Reverse Words Other Way
        String str4 = "I can speak in two or three languages";
        String [] words2 = str4.split(" ");
        for (int i = 0; i < words2.length; i++) {
            String word = words2[i];
            String rev = "";
            for (int j = word.length()-1; j >= 0 ; j--) {
                rev += word.charAt(j);
            }
            System.out.print(rev + " ");
        }
    }
}
