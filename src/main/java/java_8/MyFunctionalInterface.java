package java_8;

/*
A functional interface is an interface with just one abstract method
It can have multiple default or static methods, but only one abstract method
They are used as the target types for lambda expressions.
The @FunctionalInterface annotation is optional but highly recommended
(Though it can have multiple default or static methods).
 */

@FunctionalInterface
public interface MyFunctionalInterface {
    void myMethod();  // Single abstract method
}

