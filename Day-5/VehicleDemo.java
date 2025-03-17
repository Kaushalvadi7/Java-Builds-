class Vehicle {
    String brand;
    void fuelCapacity(int liters) {
        System.out.println(brand + " vehicle fuel capacity: " + liters + " liters.");
    }
    void fuelCapacity(double gallons) {
        System.out.println(brand + " vehicle fuel capacity: " + gallons + " gallons.");
    }
    void start() {
        System.out.println(brand + " Vehicle is starting...");
    }
}
class Car extends Vehicle {
    @Override
    void start() { // Method Overriding
        System.out.println(brand + " Car is starting with an ignition key.");
    }
}
class Bike extends Vehicle {
    @Override
    void start() { // Method Overriding
        System.out.println(brand + " Bike is starting with a kick or self-start.");
    }
}
// Main class
public class VehicleDemo {
    public static void main(String[] args) {
        // Parent class reference
        Vehicle myVehicle = new Vehicle();
        myVehicle.brand = "Generic";
        myVehicle.start();

        Vehicle myCar = new Car();
        myCar.brand = "Toyota";
        myCar.start();  // Calls Car's start()

        Vehicle myBike = new Bike();
        myBike.brand = "Honda";
        myBike.start();  // Calls Bike's start()

        myCar.fuelCapacity(50);      
        myBike.fuelCapacity(13.2);   
    }
}
