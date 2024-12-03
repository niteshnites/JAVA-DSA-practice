package java_8;

/*
Parallel Streams, which allow you to process collections concurrently,
making use of multi-core processors for better performance.
 */

import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.parallelStream()
                .forEach(n -> System.out.println(n + " processed by " + Thread.currentThread().getName()));
    }
}
