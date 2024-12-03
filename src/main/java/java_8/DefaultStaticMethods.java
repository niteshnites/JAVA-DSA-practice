package java_8;

/*
Java 8 allows interfaces to have methods with default implementations.
This feature helps in adding new methods to interfaces without affecting the implementing classes.

Interfaces can have static methods, which can be called without an instance of the interface.
 */

public interface DefaultStaticMethods {

    default void show(){
        System.out.println("Default Method in Interface");
    }

    default void showAgain() {
        System.out.println("As many we want default method in interface");
    }

    static void staticMethod() {
        System.out.println("Static method in Interface");
    }
}
