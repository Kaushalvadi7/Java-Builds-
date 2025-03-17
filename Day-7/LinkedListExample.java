import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        // Add 
        tasks.add("Complete Assignment");
        tasks.add("Prepare Presentation");
        tasks.add("Attend Meeting");

        // Read 
        System.out.println("Tasks: " + tasks);

        // Update 
        tasks.set(1, "Submit Report");
        System.out.println("Updated Tasks: " + tasks);

        // Delete 
        tasks.remove("Attend Meeting");
        System.out.println("After Deletion: " + tasks);

        // Iterate
        System.out.println("\nTask List:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
