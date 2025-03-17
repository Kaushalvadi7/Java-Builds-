abstract class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        super.sound();  // Calls the method from Animal (abstract class)
        System.out.println("Dog barks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Calls both methods
    }
}
