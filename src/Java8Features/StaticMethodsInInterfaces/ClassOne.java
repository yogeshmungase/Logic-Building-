package src.Java8Features.StaticMethodsInInterfaces;

public class ClassOne implements InterfaceOne, InterfaceTwo {

    @Override
    public void printName() {
        System.out.println("printName ");
    }

    @Override
    public void setName() {
        System.out.println("setName ");
    }
    
    
}
