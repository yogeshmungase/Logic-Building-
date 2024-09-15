package src.AssignmentNo1;

 // Program to divide two numbers --------------------------------
public class DivideTwoNo {
    static int divideNo(int a, int b){
           int result = a/b;
        //    System.out.println(result);
           return result;
    }
    public static void main(String[] args) {
      int c =  divideNo(10, 5);
      System.out.println(c);
    }
}