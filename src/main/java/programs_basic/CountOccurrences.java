package programs_basic;

public class CountOccurrences {
    public static void main(String[] args) {

        String str = "programming";
        char character = 'g';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == character){
                count ++;
            }
        }
        System.out.println(character + " count is: " + count);
    }
}
