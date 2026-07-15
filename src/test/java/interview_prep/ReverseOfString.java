package interview_prep;

public class ReverseOfString {
    public static void main(String[] args) {
        String strName = "Nitesh";
        String reverse = "";
        for(int i = strName.length()-1; i >= 0 ; i--) {
            reverse = reverse + strName.charAt(i);
        }
        System.out.println(reverse);
    }
}
