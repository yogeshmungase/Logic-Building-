package src.AssignmentNo5;

import java.util.Scanner;

//Write a program which accept number from user and check whether it contains 0 in it or not
// Input : 2395 
// Output : There is no Zero

// Input : 1018
// Output : It Contains Zero

// Input : 9000
// Output : It Contains Zero
public class Question2 {
    static void check(int number){
        String numberStr = Integer.toString(number);
        if (numberStr.contains("0")) {
            System.out.println("It Contains Zero");
        } else {
            System.out.println("There is no Zero");
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        check(a);
        sc.close();
    }
}
