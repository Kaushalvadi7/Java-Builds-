import java.util.Scanner;

public class Factorial {

    //n!=n×(n−1)×(n−2)×...×1
    
    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 1 || n == 0)  // Base case
            return 1;
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("Factorial of " + num  + " is:" + factorial(num));
    }
}
