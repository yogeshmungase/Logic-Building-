package src.Java8Features.DefaultMethodsInInterfaces;

public class ClassOne implements InterfaceOne {

    // providing implementation for abstract methods
    @Override
    public void printName() {
       System.out.println("printName");
       
    }

    @Override
    public String getName() {
        System.out.println("getName");
        return "getName....";
    }


    
}
