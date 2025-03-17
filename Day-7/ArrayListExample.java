import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();
        // add
        books.add("The Alchemist");
        books.add("Atomic Habits");
        books.add("Clean Code");

        // Read
        System.out.println("Books: " + books);

        // Update 
        books.set(1, "Rich Dad Poor Dad");
        System.out.println("Updated Books: " + books);
        
        // Remove by index
        books.remove(1);
        System.out.println("After Deletion by index: " + books);

        // Remove
        books.remove("Clean Code");
        System.out.println("After deletion: " + books);


        // 🔹 Search element
        if (books.contains("The Alchemist")) {
            System.out.println("Book Found!");
        } else {
            System.out.println("Book Not Found.");
        }

        // 🔹 Iterate elements
        System.out.println("\nBook List:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}
