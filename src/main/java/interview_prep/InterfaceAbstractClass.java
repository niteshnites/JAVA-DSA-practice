package interview_prep;

// Since the abstract class is incomplete, Java doesn't allow creating an object from it

public class InterfaceAbstractClass {
    public static void main(String[] args) {
        Fly plane = new Plane();
        plane.canFly();

        Animal animal = new Animal(20) {
            @Override
            public void canFly() {
                System.out.println("Some Animals can fly");
            }
        };
        animal.canFly();

        Animal bird = new Bird();
        bird.canFly();

        Animal bird1 = new Bird(10);
        bird1.eat();
    }
}

// The interface defines a contract
interface Fly {
    void canFly();
}

// The interface defines a contract
abstract class Animal{
    int day = 1;

    public Animal (){

    }

    public Animal(int id){
        this.day = id;
    }
    public abstract void canFly();

    public void eat(){
        System.out.println("Animal need to eat in every " + day + " days");
    }
}

// Class provides the concrete implementation
class Plane implements Fly{
    @Override
    public void canFly() {
        System.out.println("Plane can fly");
    }
}

class Bird extends Animal{

    public Bird(){

    }

    public Bird(int id) {
        super(id);
    }

    @Override
    public void canFly() {
        System.out.println("Bird can fly");
    }
}