package src.AssignmentNo12;
//  Accept number of rows and number of columns from user and display below pattern. 

// Input :  4 , 4
// Output :  * # # #
//           * * # #
//           * * * #
//           * * * *

import java.util.Scanner;

public class QuestionNo1 {
    void pattern(int r, int c) {
        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" * ");
            }
            for(int k = i+1; k<= c; k++){
                System.out.print(" # ");
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

        QuestionNo1 q1 = new QuestionNo1();
        q1.pattern(r, c);
        sc.close();
    }
}
