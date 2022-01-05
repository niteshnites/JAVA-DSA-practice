package recursion;

public class Factorial {
    public static void main(String [] args){
        // 5! = 5*4*3*2*1 = 120
        System.out.println(new Factorial().doFactorial(5));

        // 6! = 6*5*4*3*2*1 = 720
        System.out.println(new Factorial().factorialOfNumber(6));
    }

    /**
     * Method 1 to do factorial of given number
     * @param number need to be set
     * @return factorial as a result
     */
    int doFactorial(int number) {
        int result = 1;
        if(number > 0) {
            result = number * doFactorial(number - 1);
        }
        return result;
    }

    /**
     * Method 2 to do factorial of given number
     * @param number need to be set
     * @return factorial result
     */
    int factorialOfNumber(int number){
        if(number == 0) {
            return 1;
        }else{
            return (number * factorialOfNumber(number-1));
        }
    }
}