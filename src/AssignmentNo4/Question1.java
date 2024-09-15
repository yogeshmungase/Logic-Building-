package src.AssignmentNo4;
// Write a program which accept number from user and display its multiplication of factors.
// Input : 12
// Output : 144 (1 * 2 * 3 * 4 * 6)
// Input : 13
// Output : 1 (1)
// Input : 10
// Output : 10 (1 * 2 * 5)

import java.util.Scanner;

public class Question1 {

    static void  MultFact(int num){
        int multiplication = 1;
        for(int i =1;i<num;i++){
            if(num%i==0){
                multiplication = multiplication*i;
                // multiplication *= i;
                System.out.print( i+" ");
            }
        }
        System.out.println("\nMultiplication of factors: " + multiplication);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        MultFact(a);

        sc.close();
    }
}