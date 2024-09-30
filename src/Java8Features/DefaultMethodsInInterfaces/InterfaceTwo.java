package src.Java8Features.DefaultMethodsInInterfaces;

public interface InterfaceTwo {
    default void abc(){
        System.out.println("abc Method: From InterfaceTwo...");
    }
}
