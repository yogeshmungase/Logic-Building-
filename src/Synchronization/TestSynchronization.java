package src.Synchronization;
public class TestSynchronization {
    private int totalSeat = 10; // Shared resource
    synchronized void bookTicket(int n) {
        if (totalSeat >= n) {
            System.out.println(n + " Tickets booked successfully");
            totalSeat -= n;
            System.out.println("Seats left: " + totalSeat);
        } else {
            System.out.println("Not enough seats available to book " + n + " tickets.");
            System.out.println("Seats left: " + totalSeat);
        }
    }
}
