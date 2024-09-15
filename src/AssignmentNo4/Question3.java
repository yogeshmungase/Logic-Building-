package src.AssignmentNo4;

import java.util.Scanner;
//Write a program which accept number from user and display all its non factors.
public class Question3 {
    static void  MultFact(int num){
        
        for(int i =1;i<num;i++){
            if(num%i!=0){
               
                // multiplication *= i;
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
