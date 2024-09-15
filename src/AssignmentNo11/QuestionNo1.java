package src.AssignmentNo11;

import java.util.Scanner;

// Accept number of rows and number of columns from user and display below pattern. 
// Input : 4 4 
// Output : A B C D 
//          A B C D 
//          A B C D 
//          A B C D 
public class QuestionNo1 {
    void pattern(int r , int c){
        for(int i = 0; i<=r; i++){
            for(int j = 0 ; j<=c; j++){
                System.out.print((char)('A' + j) + " ");
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

            QuestionNo1 q1= new QuestionNo1();
            q1.pattern(r, c);
            sc.close();
    }
}
