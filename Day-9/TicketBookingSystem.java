import java.util.LinkedList;
import java.util.Queue;

class Ticket {
    int id;
    String customerName;

    public Ticket(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Customer: " + customerName;
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Queue<Ticket> ticketQueue = new LinkedList<>();

        // Adding bookings
        ticketQueue.add(new Ticket(101, "Ajay"));
        ticketQueue.add(new Ticket(102, "Bharat"));
        ticketQueue.add(new Ticket(103, "Chetan"));
        ticketQueue.add(new Ticket(104, "Chetana"));
        ticketQueue.add(new Ticket(105, "Chitan"));

        // Processing bookings
        System.out.println("Processing Bookings:");
        while (!ticketQueue.isEmpty()) {

            Ticket ticket = ticketQueue.poll();

            if("Bharat".equals(ticket.customerName)){
                continue;
            }
            System.out.println(ticket);
        }
    }
}
