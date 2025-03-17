import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add(enqueue)
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue); 

        System.out.println("Removed: " + queue.poll()); 

        System.out.println("Front element: " + queue.peek()); 

        System.out.println("Queue after removal: " + queue); 
    }
}
