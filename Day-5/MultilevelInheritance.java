// Grandparent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Parent class
class Mammal extends Animal {
    void sound() {
        System.out.println("Mammals make sound");
    }
}

// Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Inherited from Animal
        dog.sound(); // Inherited from Mammal
        dog.bark();  // Own method
    }
}
