package src.AssignmentNo8;
// .Write a program which accept range from user and display all numbers in between that range. 

import java.util.Scanner;

// Input :  23 35  
// Output :  23 24 25 26 27 28 29 30 31 32 33 34 35  

// Input :  10 18 
// Output :  10 11 12 13 14 15 16 17 18 

// Input :  10 10 
// Output :  10  

// Input :  -10 2 
// Output :  -10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 

// Input :  90 18 
// Output :  Invalid range
public class QuestionNo1 {
    void range(int n, int m) {
        if (n <= m) {
            for (int i = n; i <= m; i++) {
                System.out.print(" " + i);
            }
        }else{
            System.out.print("Invalid range ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int a = sc.nextInt();
        System.out.println("Enter the value of m :");
        int b = sc .nextInt();
        QuestionNo1 q1 = new QuestionNo1();
        q1.range(a, b);
        sc.close();
    }
}
