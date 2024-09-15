package src.AssignmentNo11;
// Accept number of rows and number of columns from user and display below pattern. 

// Input : 3, 4
// Output : 1  2  3  4 
//          5  6  7  8
//          9 10  11 12 

import java.util.Scanner;

public class QuestionNo5 {
    void pattern(int r, int c) {
        int num = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int r = sc.nextInt();
        System.out.print("Enter the number of col :");
        int c = sc.nextInt();

        QuestionNo5 q5 = new QuestionNo5();
        q5.pattern(r, c);
        sc.close();
    }
}
