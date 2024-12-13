public class StringProgramTest {
    public static void main(String[] args) {

        String string = "INC12c4D5";

        // check if first three char are INC and next must be digit

        String code = "";
        String digits = "";

        for (int i = 0; i < string.length(); i++) {
            if(i < 3){
                code += string.charAt(i);
            } else {
                if(Character.isDigit(string.charAt(i))){
                    digits += string.charAt(i);
                }else {
                    System.out.println("We Have Wrong Value In Code That Is: " + string.charAt(i));
                }
            }
        }
        System.out.println("Code: " + code + "\nDigits: "+ digits);
    }
}
