package company;

public class VonageTest5 {
    public static void main(String[] args) {

        String input = "ABBCDDDEFF";
//        String input = value + "_";
        char current = input.charAt(0);
        int count = 1;
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < input.length(); i ++) {
            if (current == input.charAt(i)) {
                count ++;
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
        if (count > 1) {
            result.append(count).append(current);
        } else {
            result.append(current);
        }
        System.out.println(input + " -> " + result);
    }
}
