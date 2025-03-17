import java.util.Scanner;

public class Fibonacci {
    // Recursive method to find Fibonacci number
    static int fibonacci(int n) {
        if (n == 0) return 0; // Base case
        if (n == 1) return 1; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position till you want the series: ");
        int num = scanner.nextInt();

        System.out.println("Fibonacci Series up to position " + num + ":");

        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " "); // Print all numbers till num
        }
        scanner.close();
    }
}
