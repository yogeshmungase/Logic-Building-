package src.AssignmentNo5;

import java.util.Scanner;

//Write a program which accept number from user and count frequency of 2 in it
public class Question3 {
    static void countTwo(int num){
        int count =0;
       while(num>0){
        int digit =num%10; 
        if(digit==2){
            count++;
        }
        num = num/10;
       }
       System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        countTwo(a);
        sc.close();
    }
}
