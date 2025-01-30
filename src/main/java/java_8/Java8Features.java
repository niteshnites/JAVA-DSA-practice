package java_8;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.time.*;
import java.time.format.*;

// Functional Interface Example
@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

public class Java8Features {
    public static void main(String[] args) {
        // 1. Lambda Expressions
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Lambda: " + name));

        // 2. Functional Interface Usage
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Addition: " + add.operation(5, 3));
        System.out.println("Multiplication: " + multiply.operation(5, 3));

        // 3. Method References
        names.forEach(System.out::println);

        // 4. Streams API
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);

        // 5. Default Methods in Interfaces
        Vehicle car = new Car();
        car.printBrand();

        // 6. Optional Class
        Optional<String> optionalName = Optional.ofNullable(null);
        System.out.println("Optional is present? " + optionalName.isPresent());

        // 7. New Date and Time API
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Today's Date: " + today);
        System.out.println("Current Time: " + time);
    }
}

// Default Methods in Interfaces Example
interface Vehicle {
    default void printBrand() {
        System.out.println("Default Vehicle Brand: Toyota");
    }
}

class Car implements Vehicle {
    // No need to override default method
}

