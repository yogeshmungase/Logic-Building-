package src.Multithreading.ThreadPriorities;

public class TestPriority extends Thread{
    public void run(){
        System.out.println("Child Thread....");
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Main Thread");
        System.out.println(Thread.currentThread().getPriority());

        TestPriority tp = new TestPriority();
        tp.start();
        tp.setPriority(MIN_PRIORITY);
    }
}
