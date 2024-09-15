package src.AssignmentNo8;
// Write a program which accept range from user and display all even numbers in between that range. 

import java.util.Scanner;

// Input :  23 35  
// Output :  24 26 28 30 32 34   

// Input :  10 18 
// Output :  10 12 14 16 18 

// Input :  10 10 
// Output :  10  

// Input :  -10 2 
// Output :  -10 -8 -6 -4 -2 0 2 

// Input :  90 18 
// Output :  Invalid range 
public class QuestionNo2 {
    void evenFinder(int n, int m) {
        if (n <= m) {
            for (int i = n; i <= m; i++) {
                if (i % 2 == 0) {
                    System.out.print(i+" ");
                }
            }
        }
        else{
            System.out.print("Invalid range ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int a = sc.nextInt();
        System.out.println("Enter the value of m :");
        int b = sc .nextInt();
        QuestionNo2 q2 = new QuestionNo2();
        q2.evenFinder(a, b);
        sc.close();
    }
}
