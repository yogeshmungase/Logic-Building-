package src.AssignmentNo5;

import java.util.Scanner;
// Write a program which accept number from user and count frequency of 4 in it.
// Input : 2395 
// Output : 0
// Input : 1018
// Output : 0
// Input : 9440
// Output : 2
// Input : 922432
// Output : 1
public class Question4 {
    
    static void checkFreq(int num){
        int count=0;
      while (num>0) {
        int digit = num%10;
        if(digit==4){
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
        checkFreq(a);
        sc.close();
    }
}
