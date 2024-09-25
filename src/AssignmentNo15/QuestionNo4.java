package src.AssignmentNo15;

import java.util.Scanner;

public class QuestionNo4 {
    // Input : 6, 6
    // OutPut : * * * * * *
    // * # # # * *
    // * # # * @ *
    // * # * @ @ *
    // * * @ @ @ *
    // * * * * * *

    void pattern(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c || i + j == c + 1) {
                    System.out.print(" * ");
                } else if (i + j == c || i + j == c - 1 || i + j == c - 2) {
                    System.out.print(" # ");
                }else if (i + j == c+2 || i + j == c + 3 || i + j == c + 4) {
                    System.out.print(" @ ");
                }else{
                    System.out.print("   ");
                }
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

        QuestionNo4 q1 = new QuestionNo4();
        q1.pattern(r, c);
        sc.close();
    }
}
