package java_8;

/*
The Collector interface provides a way to collect elements from a stream into various types,
like lists, sets, or maps. It is used with the collect() method of the Stream API
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorInterface {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());
        System.out.println(filteredNames);  // Output: [Alice, Charlie]
    }
}
