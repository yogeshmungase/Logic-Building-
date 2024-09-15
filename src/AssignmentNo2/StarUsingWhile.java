package src.AssignmentNo2;

import java.util.Scanner;

// Accept one number from user and print that number of * on screen. using while loop
public class StarUsingWhile {
    static void star(int a){
        while(a>0){
            System.out.print("* ");
            a--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int value = sc.nextInt();

        star(value);
        sc.close();
    }
}
