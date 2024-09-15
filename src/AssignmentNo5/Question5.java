package src.AssignmentNo5;

import java.util.Scanner;

// Write a program which accept number from user and count frequency of such a digits which are less than 6.
// Input : 2395 
// Output : 3
// Input : 1018
// Output : 3
// Input : 9440
// Output : 3
// Input : 96672
// Output : 1
public class Question5 {
    static void frequency(int num){
          int count=0;
          while(num>0){
            int digit = num%10;
            if(digit <6){
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
        frequency(a);
        sc.close();
    }
}
