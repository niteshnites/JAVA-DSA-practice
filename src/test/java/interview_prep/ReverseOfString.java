package interview_prep;

public class ReverseOfString {
    public static void main(String[] args) {

        // 1.
        String strName = "Nitesh";
        String reverse = "";
        for(int i = strName.length()-1; i >= 0 ; i--) {
            reverse = reverse + strName.charAt(i);
        }
        System.out.println(reverse);
        
        // 2.
        String strName2 = "Aarju";
        StringBuffer reverse2 = new StringBuffer(strName2);
        System.out.println(reverse2.reverse());

    }
}
