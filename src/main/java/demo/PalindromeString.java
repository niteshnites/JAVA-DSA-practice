package demo;

public class PalindromeString {
    public static void main(String[] args) {

        // Anagram String
        String str = "madam";
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }

        String str2 = "maaddaam";
        boolean isPalindrome = true;
        for (int i = 0; i < str2.length()/2; i++) {
            if(str2.charAt(i) == str2.charAt(str2.length()-1-i)) {

            } else {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "PALINDROME" : "NOT PALINDROME");

        System.out.println(str.equals(rev));

    }
}
