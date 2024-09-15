package src.AssignmentNo2;

import java.util.Scanner;

//Accept on number from user if number is less than 10 then print 
//“Hello” otherwise print “Demo”
public class Question3 {
    static void dispaly(int a){
         if(a<10){
            System.out.println("Hello");
         }else{
            System.out.println("Demo");
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = sc .nextInt();

        dispaly(value);
        sc.close();
    }
}
