package company;

public class VonageTest7 {
    public static void main(String[] args) {

        String inputStr = "A2B3C1D4E3F"; // output = ABBCCCDEEEEFFF
        StringBuilder results = new StringBuilder();

        int i = 0;
        while (i < inputStr.length()) {
            // Is digit
            String numStr = "";
            while (i < inputStr.length() && Character.isDigit(inputStr.charAt(i))) {
                numStr += inputStr.charAt(i);
                i++;
            }
            // convert numStr into number
            int number = Integer.parseInt(numStr);

            if (i < inputStr.length()) {
                char ch = inputStr.charAt(i);
                int j = 0;
                while (j < number) {
                    results.append(ch);
                    j++;
                }
                i++;
            }
        }
        System.out.println("output -> " + results);


    }
}
