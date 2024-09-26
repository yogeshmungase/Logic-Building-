package src.Multithreading.InterruptedMethods;

public class Test extends Thread {
    public void run() {
        // System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e + " Thread Interrupted ");
        }
        // System.out.println(Thread.interrupted());
        // System.out.println(Thread.currentThread().isInterrupted());

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        t.interrupt();
    }
}
