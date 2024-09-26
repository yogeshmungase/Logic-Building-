package src.Multithreading.MethodsInMulti;

public class TestThread1 extends Thread{
    public void run(){
        System.out.println("Hi");
        System.out.println("Thread Name "+Thread.currentThread().getName());
        Thread.currentThread().setName("Yogesh");
        System.out.println("Thread Name "+Thread.currentThread().getName());
        System.out.println(" "+Thread.currentThread().isAlive());

    }

    public static void main(String[] args) {
        TestThread1 t1 = new TestThread1();
        t1.start();
        System.out.println("Thread Name "+Thread.currentThread().getName());
        Thread.currentThread().setName("Prasad");
        System.out.println("Thread Name "+Thread.currentThread().getName());
        System.out.println(" "+Thread.currentThread().isAlive());
    }
}
