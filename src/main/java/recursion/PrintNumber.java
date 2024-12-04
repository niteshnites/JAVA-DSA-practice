package recursion;

public class PrintNumber {

    static int num = 1;
    public static void main(String [] args){
        // Print 1, 2, 3, 4, 5
        new PrintNumber().printNumber(5);
    }

    /**
     * Method to print number
     * @param number need to be set
     */
    void printNumber(int number){
        if(num <= number){
            System.out.println(num);
            num++;
            printNumber(number);
        }
    }
}