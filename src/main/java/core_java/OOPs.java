package core_java;

import java.util.ArrayList;
import java.util.List;

// Abstract Class (Abstraction)
abstract class Animal {
    private String name; // Private field (Encapsulation)
    private int age;     // Private field (Encapsulation)

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method (Abstraction)
    public abstract void makeSound();

    // Concrete method
    public void displayInfo() {
        System.out.println("Animal Name: " + name + ", Age: " + age);
    }
}

// Inheritance and Polymorphism
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof Woof!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow Meow!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
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

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Interfaces (Abstraction)
interface Trainable {
    void performTrick();
}

class TrainedDog extends Dog implements Trainable {
    public TrainedDog(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void performTrick() {
        System.out.println(getName() + " performs a backflip!");
    }
}

// Composition Example
class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAllAnimals() {
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println("----");
        }
    }
}

public class OOPs {
    public static void main(String[] args) {
        // Encapsulation Example
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        Cat cat = new Cat("Kitty", 3, "White");

        // Polymorphism Example (Method Overriding)
        dog.makeSound();
        cat.makeSound();

        // Polymorphism Example (Method Overloading)
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers: " + calc.add(5, 10));
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.5));
        System.out.println("Addition of three integers: " + calc.add(1, 2, 3));

        // Abstraction Example
        Animal animal = new Dog("Max", 4, "Beagle"); // Reference of abstract class
        animal.makeSound();

        // Interface Example
        TrainedDog trainedDog = new TrainedDog("Rocky", 6, "German Shepherd");
        trainedDog.performTrick();

        // Composition Example
        Zoo zoo = new Zoo();
        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        zoo.addAnimal(trainedDog);

        System.out.println("\nZoo Animals:");
        zoo.showAllAnimals();
    }
}
