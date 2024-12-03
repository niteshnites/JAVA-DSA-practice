package java_8;

/*
Streams provide a functional approach to working with collections,
allowing operations such as filtering, mapping, and reducing to be
applied in a concise and declarative manner
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List <Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println(evenNumbers);

        /*
        Creating Streams (Streams can be created from various sources)
         */
        // From Collections
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers1.stream();
        System.out.println(stream.collect(Collectors.toList()));

        // From Arrays
        int[] array1 = {11, 22, 33, 44};
        IntStream stream1 = Arrays.stream(array1);
        stream1.forEach(System.out::print);
        // Print elements separated by commas
        IntStream stream2 = Arrays.stream(array1);
        String result = stream2
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(result);

        // Using Stream.of()
        Stream<String> stream3 = Stream.of("a", "b", "c");
        System.out.println(stream3.collect(Collectors.toList()));

    }
}