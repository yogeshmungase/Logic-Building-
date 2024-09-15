package src.AssignmentNo6;

import java.util.Scanner;

// Write a program which accept number from user and return multiplication of all digits.
// Input :  2395  
// Output :  270 
public class QuestionNo4 {
    static void multiplication(int num ){
        int mult = 1;
        while (num>0) {
            int digit = num % 10;
            mult = mult * digit;
            num= num/10; 
        }
        System.out.println(" multiplication of all digits : " +mult);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        QuestionNo4.multiplication(n);
        sc.close();
    }
}
