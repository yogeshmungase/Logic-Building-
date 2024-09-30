package src.Java8Features.StaticMethodsInInterfaces;

public class TestStaticMethod {
    public static void main(String[] args) {
        ClassOne one = new ClassOne();
        one.printName();
        InterfaceOne.staticMethods();
        InterfaceTwo.staticMethodsTwo();
    }
}
