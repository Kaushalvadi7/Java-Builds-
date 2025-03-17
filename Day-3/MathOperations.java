public class MathOperations {
    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));      // Calls first method
        System.out.println(add(5, 10, 15));  // Calls second method
    }
}
