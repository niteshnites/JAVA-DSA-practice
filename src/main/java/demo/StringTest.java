package demo;

public class StringTest {
    public static void main(String[] args) {

        String name = "India";
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());

        char [] namesArray = name.toCharArray();
        String reverse = "";

        for (int i = namesArray.length-1; i>=0; i--) {
            reverse += namesArray[i];
        }
        System.out.println(reverse);



    }
}
