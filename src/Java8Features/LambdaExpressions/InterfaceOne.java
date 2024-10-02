package src.Java8Features.LambdaExpressions;

@FunctionalInterface
public interface InterfaceOne extends InterfaceTwo {

    void number(int a, int b);

    default void name(){
        System.out.println("This is default method name");
    }

    static void getName(){
        System.out.println("This is static method name");
    }
}