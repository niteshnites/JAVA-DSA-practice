package programs_top_10;

public class ReverseString {
    public static void main(String[] args) {

        // Reverse of a String
        // input :- My name is Nitesh
        // output :- hsetiN si eman yM

        // Steps
        // Get the String and convert into character
        // Start a loop and concat string into new empty string
        String string = "My name is Nitesh";
        String reverseString = "";

        for (int i = string.length()-1; i >= 0 ; i--) {
            reverseString += string.charAt(i);
        }
        System.out.println(reverseString);

        // Reverse each word
        String string2 = "My name is Nitesh";
        String [] words = string2.split(" ");

        StringBuilder reverseString2 = new StringBuilder();

        for( String word : words ){
            String reverseWord = new StringBuilder(word).reverse().toString();
            reverseString2.append(reverseWord).append(" ");
        }

        System.out.println(reverseString2);
    }
}
