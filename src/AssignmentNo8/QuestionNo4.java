package src.AssignmentNo8;

import java.util.Scanner;

// Write a program which accept range from user and return addition of all even 
// numbers in between that range. (Range should contains positive numbers only) 
// Input :  10 18 
// Output :  70 
// Input :  -10 2 
// Output :  Invalid range 
// Input :  90 18 
// Output :  Invalid range 
public class QuestionNo4 {
    void evenAddition(int n , int m){
        int sum =0;
        if(n <= m && n>=0 && m>=0){
            for(int i = n; i<= m ; i++){
                if(i%2==0){
                    sum = sum +i;
                }
            }
            System.out.println(sum);
        }
        else{
            System.out.println("Invalid range ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int a = sc.nextInt();
        System.out.println("Enter the value of m :");
        int b = sc .nextInt();
        QuestionNo4 q4 = new QuestionNo4();
        q4.evenAddition(a, b);
        sc.close();
    }
}
