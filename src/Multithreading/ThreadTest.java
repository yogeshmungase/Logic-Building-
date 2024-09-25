package src.Multithreading;

public class ThreadTest extends Thread {
    public void run(){
        System.out.println("Thread Start !......");
    }
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start();
    }
}
