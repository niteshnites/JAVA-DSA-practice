package interview_prep;

public class ReverseOfInteger {
    public static void main(String[] args) {

        int number = 123;
        int reversed = 0;
        while(number != 0) {
            int digit = number % 10; // 3 -> 2 -> 1
            reversed = reversed * 10 + digit; // 0*10+3=3 -> 3*10+2=32 -> 32*10+1 = 321
            number = number / 10; // 2 -> 1 -> 0
        }
        System.out.println(reversed);



        int number2 = 123456;
        String strReverse = "";
        while(number2 != 0) {
            int digit = number2 % 10;
            strReverse = strReverse + digit;
            number2 = number2 / 10;
        }
        System.out.println(Integer.parseInt(strReverse));

    }
}
