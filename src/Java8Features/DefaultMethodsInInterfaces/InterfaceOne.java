package src.Java8Features.DefaultMethodsInInterfaces;

public interface InterfaceOne {

    //abstract methods 
    void printName();
    String getName();

    // default method in interface 
    default void defaultMethodOne(){
        for(int i = 1; i<=5;i++){
            System.out.println("*");
        }
        System.out.println("defaultMethodOne :");
    }
    default String defaultMethodTwo(){
        System.out.println("defaultMethodTwo...............");
        for(int i = 1; i<=5;i++){
            System.out.println(i);
        }
        return "defaultMethodTwo";
    }
    default void abc(){
        System.out.println("abc Method: From InterfaceOne...");
    }

}
