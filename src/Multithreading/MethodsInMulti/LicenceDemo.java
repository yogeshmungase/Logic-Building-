package src.Multithreading.MethodsInMulti;
class Medical extends Thread{
    public void run(){
        try{
        System.out.println("Medical Started.....");
        Thread.sleep(3000);
        System.out.println("Medical Completed.....");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class TestDrive extends Thread{
    public void run(){
        try{
        System.out.println("TestDrive Started.....");
        Thread.sleep(3000);
        System.out.println("TestDrive Completed.....");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class OfficerSign extends Thread{
    public void run(){
        try{
        System.out.println("Officer take the file.....");
        Thread.sleep(3000);
        System.out.println("Officer Work Completed.....");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class LicenceDemo{

    public static void main(String[] args) throws InterruptedException {
        Medical m = new Medical();
        m.start();
        m.join();
        TestDrive td = new TestDrive();
        td.start();
        td.join();
        OfficerSign os = new OfficerSign();
        os.start();
    }

}