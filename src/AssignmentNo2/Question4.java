package src.AssignmentNo2;

import java.util.Scanner;

//Accept two numbers from user and display first number in second number of times
public class Question4 {
    void dispaly(int a, int f){
        for(int i=1;i<=f;i++){
           System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        Question4 q = new Question4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int d = sc .nextInt();
        System.out.println("Enter the number: ");
        int b = sc .nextInt();
        q.dispaly(d, b);
         sc.close();
    }
}
