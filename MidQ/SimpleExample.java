package MidQ;
// Abstract class Animal
abstract class Animal {
    protected String name;

    // Constructor for the abstract class
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for " + name);
    }

    // Abstract method (no implementation here)
    public abstract void sound();
}

// Concrete class Dog extends Animal
class Dog extends Animal {

    // Constructor for Dog (calls the abstract class constructor)
    public Dog(String name) {
        super(name); // Call the constructor of Animal
    }

    // Implement the abstract method sound()
    @Override
    public void sound() {
        System.out.println(name + " says Woof!");
    }
}

// Concrete class Cat extends Animal
class Cat extends Animal {

    // Constructor for Cat (calls the abstract class constructor)
    public Cat(String name) {
        super(name); // Call the constructor of Animal
    }

    // Implement the abstract method sound()
    @Override
    public void sound() {
        System.out.println(name + " says Meow!");
    }
}

// Main class to test the functionality
public class SimpleExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound();

        Cat cat = new Cat("Whiskers");
        cat.sound();
    }
}
