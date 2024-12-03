package java_8;

/*
Java 8 allows annotations to be applied multiple times to the same element,
which was not possible in earlier versions

Also introduced type annotations, allowing annotations to be applied to types
in variable declarations, method parameters, and return types.
*/

import jakarta.annotation.Nonnull;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;

@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotations {
    MyAnnotation[] value();
}

@MyAnnotation(value = "First")
@MyAnnotation(value = "Second")
public class RepeatableAndTypeAnnotations {
    @Nonnull
    String name = "Nitesh";

    public static void main(String[] args) {
        MyAnnotation[] annotations = RepeatableAndTypeAnnotations.class.getAnnotationsByType(MyAnnotation.class);
        for (MyAnnotation annotation : annotations) {
            System.out.println(annotation.value());
        }
    }
}
