class Car {
    private static String brand = "Toyota";

    // Static Nested Class
    static class Engine {
        void start() {
            System.out.println(brand + " engine started!");
        }
    }
}

public class StaticNested {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine();
        engine.start(); 
    }
}
