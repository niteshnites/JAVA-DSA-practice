package programs_top_10;

public class FactorialNumber {

    public static void main(String[] args) {
        // 6 factorial is 720 which is 6*5*4*3*2*1
        // 5 factorial is 120 which is 5*4*3*2*1

        // Using For loop
        int num = 6;
        int rs = 1;
        for (int i = 1; i <= num; i++) {
            rs *= i;
        }
        System.out.println(rs);

        // Using While loop
        int number = 5;
        int result = 1;
        while(number > 1){
            result *= number;
            number -= 1;
        }
        System.out.println(result);
    }
}