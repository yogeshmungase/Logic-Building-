package src.Multithreading.MethodsInMulti;

public class TestSleep extends Thread {
    public void run(){
        for(int i = 1; i<= 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Main THread......");
        TestSleep ts = new TestSleep();
        ts.start();
    }
}
