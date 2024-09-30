package src.Java8Features.DefaultMethodsInInterfaces;

public class ClassThree  implements InterfaceOne,InterfaceTwo{

    @Override
    public void printName() {
        System.out.println("Yogesh..........");
    }

    @Override
    public String getName() {
        System.out.println("Mungase........");
        return null;
    }
    @Override
    public void abc(){
        InterfaceOne.super.abc();
        InterfaceTwo.super.abc();
    }
    
}
