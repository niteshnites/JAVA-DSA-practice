package java_8;

/*
Java 8 allows interfaces to have methods with default implementations.
This feature helps in adding new methods to interfaces without affecting the implementing classes.
 */

public interface DefaultMethods {

    default void show(){
        System.out.println("Default Method in Interface");
    }

    default void showAgain() {
        System.out.println("As many we want default method in interface");
    }
}
