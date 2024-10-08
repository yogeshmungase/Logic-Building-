package src.Java8Features.MethodRefernces;

public class Methodrefernce {
    public static void main(String[] args) {
        
        // lambda expressions 
        ConvertToUpperCase upperCase = (values) ->{
            System.out.println("In lambad Expression ");
            return values.toUpperCase();
        };
        System.out.println(upperCase.convertToUpperCase("Java Method Refernces"));



        // Method refernces 

        ConvertToUpperCase UpperCaseTwo = String :: toUpperCase;
        System.out.println(UpperCaseTwo.convertToUpperCase("Java Method refernces"));
    }
}
