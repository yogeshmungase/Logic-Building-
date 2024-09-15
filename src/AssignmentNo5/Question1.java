package src.AssignmentNo5;

import java.util.Scanner;

//Write a program which accept number from user and display its digits in reverse order.
// Input : 2395 
// Output : 5932

// Input : 1018
// Output : 8101

// Input : -1018
// Output : 8101
public class Question1 {
    static int rem = 0;

    static void reverseNum(int num) {
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            System.out.print(rem);
        }
        // System.out.println();
        // if (num == rem){
        //     System.out.println("Palendrom number");
        // } else {
        //     System.out.println("Not Palendrom number");
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        reverseNum(a);
        sc.close();
    }
}
