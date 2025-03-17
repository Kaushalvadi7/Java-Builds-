import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Original String:");
        String OriginalString = sc.nextLine();
        sc.close(); // Always close Scanner to prevent resource leak

        String Reversedstr = "";

        // Reverse string manually
        for (int i = OriginalString.length() - 1; i >= 0; i--) {
            Reversedstr = Reversedstr + OriginalString.charAt(i);
        }
        System.out.println("Reversed String: " + Reversedstr);

        // Compare using .equals()
        if (Reversedstr.equals(OriginalString)) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is Not a Palindrome");
        }

        // Using StringBuffer (More efficient)
        System.out.println("\nReversed String using StringBuffer:");
        StringBuffer sb = new StringBuffer(OriginalString);
        StringBuffer revString = sb.reverse();
        
        System.out.println("Original String: " + OriginalString);
        System.out.println("Reversed String: " + revString);

        // Convert StringBuffer to String before comparison
        if (revString.toString().equals(OriginalString)) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is Not a Palindrome");
        }
    }
}
