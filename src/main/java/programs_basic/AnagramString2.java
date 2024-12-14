package programs_basic;

import java.util.Arrays;

public class AnagramString2 {
    public static void main(String[] args) {

        String string1 = "listen";
        String string2 = "silent";

        char [] charArray1 = string1.toCharArray();
        char [] charArray2 = string2.toCharArray();

        char [] sortedArray1 = bubbleSort(charArray1);
        for (char c : sortedArray1) {
            System.out.print(c + " ");
        }
        System.out.println();
        char [] sortedArray2 = bubbleSort(charArray2);
        for (char c : charArray2) {
            System.out.print(c + " ");
        }

        System.out.println();
        if(Arrays.equals(sortedArray1, sortedArray2)){
            System.out.println("Anagram String");
        }else {
            System.out.println("Not Anagram");
        }

    }
    public static char [] bubbleSort(char [] charArray){
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length-1-i; j++) {
                if(charArray[j] > charArray[j+1]){
                    char temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                }
            }
        }
        return charArray;
    }
}
