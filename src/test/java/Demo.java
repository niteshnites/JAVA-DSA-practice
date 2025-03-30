import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {

        int number = 113;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}
class DemoTest1 {
    public static void main(String[] args) {
        Optional<List<Integer>> id = Optional.of(List.of(1, 2, 3)); // Example data
        String value;

        value = id.map(integers -> integers.contains(3) ? "fail" : "pass").orElse("trust");

        System.out.println(value); // Output: "fail"
    }
}
