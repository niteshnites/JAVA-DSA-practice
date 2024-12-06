package programs_top_10;

public class PrintPattern {
    public static void main(String[] args) {
        int n = 5;  // Number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  // Spaces
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");  // Stars
            }
            System.out.println();
        }
    }
}
// output
//    *
//   ***
//  *****
// *******
//*********