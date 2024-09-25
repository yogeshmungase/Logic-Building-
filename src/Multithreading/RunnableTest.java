package src.Multithreading;

public class RunnableTest implements Runnable{
    public void run(){
        System.out.println("Thread Started !......");
    }
    public static void main(String[] args) {
        RunnableTest tr = new RunnableTest();
        Thread t = new Thread(tr);
        t.start();
    }
}
