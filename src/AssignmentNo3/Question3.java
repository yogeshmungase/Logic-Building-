package src.AssignmentNo3;
import java.util.Scanner;
public class Question3 {
    static void dispalyFactors(int a){
         if(a<=0){
            a = -a;
         }
         for(int i = 1; i <= a; i++){
            if(a%i==0 && i%2==0){
                System.out.print(i+" ");
            }
         }
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = sc .nextInt();
        dispalyFactors(value);
        sc.close();
    }
}
