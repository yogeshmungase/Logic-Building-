package src.AssignmentNo14;

import java.util.Scanner;

// Accept number of rows and number of columns from user and display below pattern.
// Input : 4, 4
// OutPut : 1 2 3 4 
//            2 3 4 
//              3 4 
//                4 
public class QuestionNo5 {
    void pattern(int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i + 1; j <= c; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of rows :");
        int r = sc.nextInt();
        System.out.print("Enter the no of colums :");
        int c = sc.nextInt();

        QuestionNo5 q1 = new QuestionNo5();
        q1.pattern(r, c);
        sc.close();
    }
}
