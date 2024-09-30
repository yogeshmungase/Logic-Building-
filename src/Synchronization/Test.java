package src.Synchronization;

public class Test extends Thread {
    static TestSynchronization t;
    int seat;
    
    public void run() {
        t.bookTicket(seat);
    }
    
    public static void main(String[] args) {
        t = new TestSynchronization();
        
        Test t1 = new Test();
        t1.seat = 6;
        t1.start();
        
        Test t2 = new Test();
        t2.seat = 7;
        t2.start();
    }
}