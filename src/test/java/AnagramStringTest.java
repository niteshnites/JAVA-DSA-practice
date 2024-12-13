import java.util.Arrays;

public class AnagramStringTest {

    public static void main(String[] args) {

        String str1 = "mam";
        String str2 = "amm";
        char [] charArr1 = str1.toCharArray();
        Arrays.sort(charArr1);
        char [] charArr2 = str2.toCharArray();
        Arrays.sort(charArr2);

        boolean isAnagramString = Arrays.equals(charArr1, charArr2);

        if(isAnagramString){
            System.out.println("Anagram String");
        }else {
            System.out.println("Not Anagram");
        }

    }

}
