package programs_basic;

public class PalindromeCheck {
    public static void main(String[] args) {

        // Palindrome Number String check
        // input Naman, NITIN, madam, non -> output true
        // input nick, nitish, man -> output false

        String name = "madam";
        boolean result = false;
        name = name.toLowerCase();
        for (int i = 0; i < name.length()/2; i++){
            result = name.charAt(i) == name.charAt((name.length()-1) - i);
            if(!result){
                break;
            }
        }
        if(result) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

        // Other way
        String string = "Nitesh";
        String reversedString = new StringBuilder(string).reverse().toString();
        if(string.equalsIgnoreCase(reversedString)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
