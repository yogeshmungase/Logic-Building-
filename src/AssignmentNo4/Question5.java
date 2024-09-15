package src.AssignmentNo4;

import java.util.Scanner;

//Write a program which accept number from user and return difference between summation of all its factors and non factors.
public class Question5 {
    static void MultFact(int num) {
        int nonsum = 0;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i != 0) {
                nonsum += i;
                System.out.print(i + " ");
            }
            if (num % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("sum of factors :" + sum);

        System.out.println("sum of non factors :" + nonsum);
        int result = sum - nonsum;
        System.out.println("difference between summation of all its factors and non factors :" + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        MultFact(a);
        sc.close();
    }
}
