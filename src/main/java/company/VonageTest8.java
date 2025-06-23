package company;

public class VonageTest8 {
    public static void main(String[] args) {

        String input = "A2BC3DE2F";
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < input.length()) {

            if (Character.isDigit(input.charAt(i))) {
                StringBuilder strNum = new StringBuilder();
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    strNum.append(input.charAt(i));
                    i++;
                }
                int count = Integer.parseInt(strNum.toString());
                if (i < input.length()) {
                    char ch = input.charAt(i);
                    for (int j = 0; j < count; j++) {
                        result.append(ch);
                    }
                }
                i++;
            } else {
                result.append(input.charAt(i));
                i++;
            }
        }
        System.out.println("result -> "+ result);

    }
}
