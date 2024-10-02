package src.Java8Features.LambdaExpressions;

public interface InterfaceTwo {

    // void printName();

    default void printNumber(){
        System.out.println("This is printNumber method ....");
    }
}
