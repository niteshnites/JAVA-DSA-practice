public class StringProgramTest {
    public static void main(String[] args) {

        String input = "INC12c4D5";

        if (input.length() < 3) {
            System.out.println("Input is too short to contain the required code.");
            return;
        }

        String code = input.substring(0, 3);
        if (!code.equals("INC")) {
            System.out.println("Invalid code prefix! Expected 'INC' but found: " + code);
            return;
        }

        StringBuilder digits = new StringBuilder();
        boolean hasInvalidChar = false;

        for (int i = 3; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                System.out.println("Invalid character detected at position " + i + ": " + ch);
                hasInvalidChar = true;
            }
        }

        System.out.println("\nCode: " + code);
        System.out.println("Digits: " + digits);

        if (hasInvalidChar) {
            System.out.println("\nWarning: Input contains invalid characters.");
        } else {
            System.out.println("\nInput is valid.");
        }
    }
}
