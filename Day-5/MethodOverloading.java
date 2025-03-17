class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));         // Calls int add()
        System.out.println(calc.add(5.5, 10.2));     // Calls double add()
        System.out.println(calc.add(1, 2, 3));       // Calls three-int add()
    }
}
