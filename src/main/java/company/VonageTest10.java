package company;

public class VonageTest10 {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        // Step 1: Remove all special characters and spaces, convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Step 2: Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Step 3: Compare
        boolean isPalindrome = cleaned.equals(reversed);

        // Output
        System.out.println("Original String: " + input);
        System.out.println("Cleaned String: " + cleaned);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Is Palindrome? " + isPalindrome);
    }

}
