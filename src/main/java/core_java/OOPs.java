package core_java;

// Java program demonstrating OOP concepts

// Abstract Class (Abstraction)
abstract class Animal {
    private String name; // Private field (Encapsulation)

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter (Encapsulation)
    public String getName() {
        return name;
    }

    // Abstract method (Abstraction)
    public abstract void makeSound();
}

// Inheritance
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Implementation of abstract method (Polymorphism - method overriding)
    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Implementation of abstract method (Polymorphism - method overriding)
    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow Meow!");
    }
}

// Polymorphism (Method Overloading)
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Main Class
public class OOPs {
    public static void main(String[] args) {
        // Encapsulation Example
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Kitty");

        // Polymorphism Example (Method Overriding)
        dog.makeSound();
        cat.makeSound();

        // Polymorphism Example (Method Overloading)
        Calculator calc = new Calculator();
        System.out.println("Addition of integers: " + calc.add(5, 10));
        System.out.println("Addition of doubles: " + calc.add(5.5, 10.5));

        // Abstraction Example
        Animal animal = new Dog("Max"); // Reference of abstract class
        animal.makeSound();
    }
}

