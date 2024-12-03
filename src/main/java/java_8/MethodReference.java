package java_8;

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
