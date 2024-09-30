package src.Java8Features.DefaultMethodsInInterfaces;

public class ClassTwo implements InterfaceOne{

    @Override
    public void printName() {
        System.out.println("Yogesh.....");
        
    }

    @Override
    public String getName() {
        defaultMethodTwo();
        System.out.println("Mungase.......");
        return " getName";
    }
    @Override
    public void defaultMethodOne(){
       System.out.println("Default Name : Yogi");
    }
    
}
