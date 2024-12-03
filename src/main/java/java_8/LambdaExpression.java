package java_8;

/*
Lambda expressions allow you to pass behavior (as an argument) to a method,
enabling more concise and flexible code. They are primarily used to define
the behavior of the FunctionalInterface implementation in a cleaner way
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nitesh", "Ramesh", "Kritesh", "Dinesh");
        names.forEach(name -> System.out.println(name));
    }
}


// Old way
class AnonymousClass {
    public static void main(String[] args) {
        // List of names
        List<String> names = Arrays.asList("This", "is", "the", "old", "way");

        // Using an anonymous class to implement the Consumer interface
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                // Printing each name
                System.out.println(name);
            }
        });
    }
}

