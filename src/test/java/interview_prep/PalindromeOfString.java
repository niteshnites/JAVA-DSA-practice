package interview_prep;

public class PalindromeOfString {
    public static void main (String [] args){

        // 1.
        String strPalindrome = "MADAM";
        StringBuffer result = new StringBuffer(strPalindrome);
        result = result.reverse();
        System.out.println(result);
        if(strPalindrome.equals(result.toString())) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }

        // 2.
        String strPalindrome2 = "DAD";
        boolean isPalindrome = true;
        for(int i = 0; i < strPalindrome2.length()/2; i++){
            if(strPalindrome2.charAt(i) != strPalindrome2.charAt(strPalindrome2.length()- 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }

    }
}
