package interview_prep;

public class PrimeNumberProgram {
    public static void main(String[] args) {
        // Prime check
        int input = 11;
        int count = 0;
        for (int i = 1; i < input/2; i++) {
            if(input % i == 0){
                count++;
            }
        }
        if(count > 1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
