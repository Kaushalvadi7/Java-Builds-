import java.util.Scanner;

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter Your Age: ");
            int age = s.nextInt();

            if (age < 18) {
                throw new YoungerAgeException("You are not eligible for voting");
            } else {
                System.out.println("You can vote successfully");
            }
        } catch (YoungerAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid age.");
        } finally {
            System.out.println("Thank you for using the voting system.");
            s.close(); // Closing scanner to prevent resource leak
        }
    }
}
