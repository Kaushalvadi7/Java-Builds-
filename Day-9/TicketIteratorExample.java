import java.util.*;

public class TicketIteratorExample {
    public static void main(String[] args) {
        List<String> tickets = new ArrayList<>();
        tickets.add("Ticket 101");
        tickets.add("Ticket 102");
        tickets.add("Ticket 103");

        Iterator<String> iterator = tickets.iterator();
        
        while (iterator.hasNext()) {
            System.out.println("Processing " + iterator.next());
        }
    }
}
