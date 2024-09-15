package src.AssignmentNo14;

import java.util.Scanner;

// Accept number of rows and number of columns from user and display below pattern. 
// Input : 5 , 5
// Output : $ * * * * 
//          # $ * * * 
//          # # $ * *
//          # # # $ *
//          # # # # $
public class QuestionNo3 {
    void pattern(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print(" $ ");
                } else {
                    System.out.print(" # ");
                }
            }
            for (int k = c - 1; k >= i; k--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of rows ;");
        int r = sc.nextInt();
        System.out.print("Enter the no of colums ;");
        int c = sc.nextInt();

        QuestionNo3 q1 = new QuestionNo3();
        q1.pattern(r, c);
        sc.close();
    }
}
