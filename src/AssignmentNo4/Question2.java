package src.AssignmentNo4;

import java.util.Scanner;

//Write a program which accept number from user and display its factors in decreasing order
public class Question2 {
    static void  MultFact(int num){
       // int multiplication = 1;
        for(int i = num;i>0;i--){
            if(num%i==0){   
                System.out.print( i+" ");
            }
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        MultFact(a);

        sc.close();
    }
}
