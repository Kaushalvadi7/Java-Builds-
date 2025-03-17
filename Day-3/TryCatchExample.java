public class TryCatchExample {
    public static void main(String[] args) {
        int a = 5, b = 0;
        
        try {
            int result = a / b;  // Risky code
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Execution finished.");
        }
    }
}
