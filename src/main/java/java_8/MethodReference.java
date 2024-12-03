package java_8;

/*
Method references are a shorthand for lambda expressions where you directly
refer to a method using the class or object.
like: ClassName::methodName or System.out::println
 */

import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {

        // Using method reference
        Consumer <String> consumer = Printer::printMethod;
        consumer.accept("Method Reference!");

        // Using Lambda expression
        Consumer <String> consumer2 = (message) -> Printer.printMethod(message);
        consumer2.accept("Lambda expression!");
    }
}

class Printer {
    // A static method
    public static void printMethod(String name){
        System.out.println("Hi from printMethod() to: " + name);
    }
}
