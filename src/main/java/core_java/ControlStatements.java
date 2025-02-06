package core_java;

public class ControlStatements {
    public static void main(String[] args) {
        // Decision Making Statements
        int num = 10;
        if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is not positive");
        }

        // Switch case
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }

        // Looping Statements
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("While loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        System.out.println("Do-While loop:");
        int num2 = 1;
        do {
            System.out.println(num2);
            num2++;
        } while (num2 <= 5);

        // Jump Statements
        System.out.println("Break Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Terminates the loop when i is 3
            }
            System.out.println(i);
        }

        System.out.println("Continue Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skips iteration when i is 3
            }
            System.out.println(i);
        }

        // Return Statement
        System.out.println("Return Statement Example:");
        printMessage();
    }

    public static void printMessage() {
        System.out.println("This is a return statement example.");
        return; // Optional, method ends here
    }
}
