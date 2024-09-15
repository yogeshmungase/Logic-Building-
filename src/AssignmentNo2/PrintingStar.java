package src.AssignmentNo2;

import java.util.Scanner;

//Accept one number from user and print that number of * on screen.
public class PrintingStar {
    
    static void star(int a){
        for(int i=0;i<=a;i++){
            System.out.print("* ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = sc .nextInt();

        star(value);
        sc.close();
    }
}
