package java_8;

/*
The Optional class is used to represent values that might be present or absent (null).
It helps to avoid NullPointerException
 */

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        Optional <String> name = Optional.of("Nitesh");
        name.ifPresent(n -> System.out.println(n.length()));

        Optional <String> emptyName = Optional.empty();
        System.out.println(emptyName.orElse("Not Fount"));

    }
}
