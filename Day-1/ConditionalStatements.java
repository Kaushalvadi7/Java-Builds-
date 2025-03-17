import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // 1. If-Else Condition
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        // 2. If-Else-If Ladder (Checking number type)
        if (num > 0) {
            System.out.println(num + " is Positive.");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        // 3. Nested If Statement (Checking divisibility)
        if (num > 0) {
            if (num % 5 == 0) {
                System.out.println(num + " is divisible by 5.");
            } else {
                System.out.println(num + " is not divisible by 5.");
            }
        }

        // 4. Switch Case (Check weekday)
        System.out.print("Enter a number (1-7) for weekday: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number! Please enter between 1-7.");
        }
    }
}
