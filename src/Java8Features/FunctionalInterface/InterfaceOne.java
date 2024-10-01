package src.Java8Features.FunctionalInterface;

@FunctionalInterface
public interface InterfaceOne {
    // Functional interface contain only one abstract method not more then one or zero
    // it can contain any number of default and static methods
    void methodOne();

    // any default methods 
    default void methodTwo(){
        System.out.println("Default method one");
    }
    default void methodThree(){
        System.out.println("Default method Three");
    }

    // any number of static methods 
    static void methodFour(){
        System.out.println("Static methodFour");
    }
    static void methodFive(){
        System.out.println("static methodFive");
    }


}