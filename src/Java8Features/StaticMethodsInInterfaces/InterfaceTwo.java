package src.Java8Features.StaticMethodsInInterfaces;

public interface InterfaceTwo {
    void setName();

    static void staticMethodsTwo(){
        System.out.println("staticMethodsTwo from interfaceTwo...");
    }
}
