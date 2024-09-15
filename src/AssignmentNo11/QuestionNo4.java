package src.AssignmentNo11;

import java.util.Scanner;

// Accept number of rows and number of columns from user and display below pattern. 
// Input : 4 5
// Output : 4 4 4 4 4
//          3 3 3 3 3 
//          2 2 2 2 2 
//          1 1 1 1 1 
public class QuestionNo4 {
    void pattern(int r, int c){
        for(int i = r; i>=1; i--){
            for(int j = 1; j<=c;j++){
                System.out.print(i+" ");
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

        QuestionNo4 q4= new QuestionNo4();
        q4.pattern(r, c);
        sc.close();
    }
}
