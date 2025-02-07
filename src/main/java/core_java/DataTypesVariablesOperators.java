package core_java;

public class DataTypesVariablesOperators {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVar = 100;
        short shortVar = 10000;
        int intVar = 1000000;
        long longVar = 10000000000L;
        float floatVar = 10.5f;
        double doubleVar = 100.99;
        char charVar = 'A';
        boolean boolVar = true;

        // Reference Data Type (String)
        String strVar = "Hello, Java!";

        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 2: " + (a << 2));
        System.out.println("a >> 2: " + (a >> 2));

        // Assignment Operators
        int num = 10;
        num += 5;
        System.out.println("num += 5: " + num);
        num -= 3;
        System.out.println("num -= 3: " + num);
        num *= 2;
        System.out.println("num *= 2: " + num);
        num /= 4;
        System.out.println("num /= 4: " + num);
        num %= 3;
        System.out.println("num %= 3: " + num);

        // Unary Operators
        int value = 10;
        System.out.println("++value: " + (++value));
        System.out.println("--value: " + (--value));
    }
}
