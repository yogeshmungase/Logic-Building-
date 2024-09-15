package src.AssignmentNo8;
// Write a program which accept accept range from user and display all numbers in 

import java.util.Scanner;

// between that range in reverse order. 

// Input :  10 10 
// Output :  10  

// Input :  23 35  
// Output :  35 34 33 32 31 30 29 28 27 26 25 24 23   

// Input :  90 18 
// Output :  Invalid range 
public class QuestionNo5 {
    void reverse(int n, int m) {
        if (n <= m) {
            for (int i = m; i >= n; i--) {
                System.out.print(i+" ");
            }
        }else{
            System.out.println("Invalid range ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int a = sc.nextInt();
        System.out.println("Enter the value of m :");
        int b = sc .nextInt();
        QuestionNo5 q5 = new QuestionNo5();
        q5.reverse(a, b);
        sc.close();
    }
}
