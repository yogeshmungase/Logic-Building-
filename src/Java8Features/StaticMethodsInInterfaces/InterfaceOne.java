package src.Java8Features.StaticMethodsInInterfaces;

public interface InterfaceOne {
    void printName();

    static void staticMethods(){
        System.out.println("staticMethods from interface one.......");
    }
    
}
