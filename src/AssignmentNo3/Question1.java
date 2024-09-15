package src.AssignmentNo3;

import java.util.Scanner;

//Write a program which accept one number from user and print that number of even numbers on screen. 
public class Question1 {
   static void dispaly(int a){
         
            for(int i=1;i<=a;i++){
                int b=2*i;
                System.out.print(b+" ");
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
