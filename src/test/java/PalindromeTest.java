public class PalindromeTest {
    public static void main(String[] args) {

        String str = "naananaan";
        boolean result = false;

        for (int i = 0; i < str.length()/2; i++){
            result = str.charAt(i) == str.charAt(str.length()-1-i);
            if(!result){
                break;
            }
        }
        if(result){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

        // Other way
        String string = "noN";
        string = string.toLowerCase();
        String reverseStr = new StringBuilder(string).reverse().toString();
        if(string.equals(reverseStr)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
