package interview_prep;

// FactoryPatternExample.java - Factory Pattern in One File

// 1. Product Interface
interface Shape {
    void draw();
}

// 2. Concrete Product Classes
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// 3. Factory Interface (Creator)
interface ShapeFactory {
    Shape createShape();
}

// 4. Concrete Factory Classes
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();  // Return a new Circle object
    }
}

class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();  // Return a new Rectangle object
    }
}

// 5. Client Code (Main Method)
public class FactoryPatternExample {
    public static void main(String[] args) {
        // Create factories for Circle and Rectangle
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();

        // Create and use the products
        Shape circle = circleFactory.createShape();
        Shape rectangle = rectangleFactory.createShape();

        // Call the draw method on both products
        circle.draw();    // Output: Drawing a Circle
        rectangle.draw(); // Output: Drawing a Rectangle
    }
}
