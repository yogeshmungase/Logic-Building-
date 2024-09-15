package src.AssignmentNo8;

import java.util.Scanner;

// Write a program which accept range from user and return addition of all numbers 
// in between that range. (Range should contains positive numbers only) 
// Input :  23 30  
// Output :  212    
// Input :  10 18 
// Output :  126 
// Input :  -10 2                                                     
// Output :  Invalid range 
// Input :  90 18 
// Output :  Invalid range 
public class QuestionNo3 {
    void evenFinder(int n, int m) {
        int sum = 0;
        if (n <= m && n>=0 && m>=0) {
            for (int i = n; i <= m; i++) {
                System.out.print(i + " ");
                sum = sum +i;
            }
            System.out.println();
            System.out.println(" addition of all numbers in between that range :"+sum);
        } else {
            System.out.print("Invalid range ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int a = sc.nextInt();
        System.out.println("Enter the value of m :");
        int b = sc .nextInt();
        QuestionNo3 q3 = new QuestionNo3();
        q3.evenFinder(a, b);
        sc.close();
    }
}
