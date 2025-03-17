// Parent class
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

// Child class
class Car extends Vehicle {
    void speed() {
        System.out.println("Car is moving at 80 km/h");
    }
}

// Main class
public class SingleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.move(); // Inherited method
        car.speed();
    }
}
