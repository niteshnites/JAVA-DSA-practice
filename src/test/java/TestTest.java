public class TestTest {
    public static void main(String[] args) {
        String str1 = "India";
        String str2 = "India";
        String str3 = new String("India");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
