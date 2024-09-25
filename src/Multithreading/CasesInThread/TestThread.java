package src.Multithreading.CasesInThread;

public class TestThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread1 t2 = new MyThread1();
        t2.start();

    }
}
