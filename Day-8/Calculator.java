import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        result = switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    yield num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    yield 0; // Provide a default value for division by zero
                }
            }
            default -> {
                System.out.println("Invalid operator!");
                yield 0; // Provide a default value for invalid operator
            }
        };
        System.out.println("Result: " + (operator == '/' && num2 != 0 ? String.format("%.2f", result) : result));
    }
}
