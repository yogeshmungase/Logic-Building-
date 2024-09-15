package src.AssignmentNo3;

import java.util.Scanner;

//Write a program which accept number from user and print even factors of that number.
public class Question2 {
    static void dispalyFactors(int a){
         if(a<=0){
            a = -a;
         }
         for(int i =1;i<=a/2;i++){
            if(a%i==0){
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
