package company;

public class VonageTest3 {

    public static void main(String[] args) {

        // VVVVV -> 5V
        String input = "ABBCCCDEEEEA";

//        int size = input.length();
//        System.out.println(size + String.valueOf(input.charAt(0)));

        StringBuilder result = new StringBuilder();
        int count = 1;
        char current = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == current) {
                count++;
            } else {
                if (count > 1) {
                    result.append(count).append(current);
                } else {
                    result.append(current);
                }
                current = input.charAt(i);
                count = 1;
            }
        }

        if (count > 1){
            result.append(count).append(current);
        } else {
            result.append(current);
        }

        System.out.println("FINAL RESULT FOR " + input + "STRING is : " + result);

    }

}
