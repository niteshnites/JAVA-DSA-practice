package company;

public class VonageTest4 {
    public static void main(String[] args) {

//        String str = "ABCD";
        String str = "ABBCCCDEEEEFFF";

        // output  A4B5C5DE5N
        StringBuilder result = new StringBuilder();
        char current = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (current == str.charAt(i)) {
                count++;
            } else {
                if (count >= 1) {
                    result.append(count).append(current);
                } else {
                    result.append(current);
                }
                current = str.charAt(i);
                count = 1;
            }
        }

        if (count >= 1) {
            System.out.println(count + " -> " + current);
            result.append(count).append(current);
        } else {
            System.out.println(count + " -> " + current);
            result.append(current);
        }

        System.out.println("Input :: " + str + "   ->   OUTPUT :: " + result);
    }
}
