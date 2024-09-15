package src.CustomException;

public class TestCustomException {
     static void validate(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age is not valid to vote");
        }else{
            System.out.println("Welcome to vote !....");
        }
    }
    public static void main(String[] args) {
        try{
            validate(15);
        }catch(InvalidAgeException e){
            System.out.println("Caught the exception");
            System.out.println("Exception occur "+ e);
        }
        System.out.println("rest of the code executed !.....");
    }
}
