package src.Multithreading.MethodsInMulti;

public class TestYield extends Thread{
    public void run(){
        Thread.currentThread().setPriority(10);
        // Thread.yield();
        // try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        for(int i = 1; i<= 5; i++){
            System.out.println(Thread.currentThread().getName()+"-->"+ i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        TestYield ty = new TestYield();
        ty.start();
        Thread.currentThread().join(3000);
        // Thread.yield();
        // Thread.sleep(3000);
        System.out.println(Thread.currentThread().getPriority());
        for(int i = 1; i<= 5; i++){
            System.out.println(Thread.currentThread().getName()+"-->"+ i);
        }
    }
}
