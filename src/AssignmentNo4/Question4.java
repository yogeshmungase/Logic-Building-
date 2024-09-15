package src.AssignmentNo4;

import java.util.Scanner;

//Write a program which accept number from user and return summation of all its non factors.
public class Question4 {
    static void  MultFact(int num){
        int sum =0;
        for(int i =1;i<num;i++){
            if(num%i!=0){
                sum += i;
                System.out.print( i+" ");
            }
        }
        System.out.println();
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        MultFact(a);
        sc.close();
    }
}
