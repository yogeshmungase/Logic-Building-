package src.Java8Features.LambdaExpressions;

public class TestClass {
    public static void main(String[] args) {
            InterfaceOne one = (p, q) ->{
                int result = p+q;
                System.out.println(result);
            };

            one.number(20, 30);
            one.name();
            InterfaceOne.getName();
            one.printNumber();
    }
}
