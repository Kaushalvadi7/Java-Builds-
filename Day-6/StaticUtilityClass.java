class MathUtils {
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class StaticUtilityClass {
    public static void main(String[] args) {
        System.out.println("Addition: " + MathUtils.add(10, 5));     
        System.out.println("Subtraction: " + MathUtils.subtract(10, 5)); 
        System.out.println("Multiplication: " + MathUtils.multiply(10, 5)); 
    }
}
