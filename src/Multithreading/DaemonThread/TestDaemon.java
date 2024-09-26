package src.Multithreading.DaemonThread;


public class TestDaemon extends Thread {
    public void run() {
        System.out.println("Daemon thread .....");
        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        //System.out.println("Main Thread .......");
        TestDaemon td = new TestDaemon();
        td.setDaemon(true);
        td.start();
        td.isDaemon();
    }

}