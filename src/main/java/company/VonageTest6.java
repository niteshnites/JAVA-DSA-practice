package company;

public class VonageTest6 {
    public static void main(String[] args) {
        String inputStr = "1A2B3C1D4E3F"; // input
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < inputStr.length()) {
            // Step 1: Build the number part as a string
            String numStr = "";
            while (i < inputStr.length() && Character.isDigit(inputStr.charAt(i))) {
                numStr += inputStr.charAt(i);
                i++;
            }

            // Step 2: Convert number string to integer
            int count = Integer.parseInt(numStr);

            // Step 3: Get the character after number and repeat it
            if (i < inputStr.length()) {
                char ch = inputStr.charAt(i);
                int j = 0;
                while (j < count) {
                    result.append(ch);
                    j++;
                }
                i++; // Move past the character
            }
        }

        System.out.println("INPUT  -> " + inputStr);
        System.out.println("OUTPUT -> " + result);
    }
}
