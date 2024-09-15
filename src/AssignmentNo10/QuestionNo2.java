package src.AssignmentNo10;

import java.util.Scanner;

// Accept number of rows and number of columns from user and display below pattern. 
// Input : 4 3
// Output : 1  2  3
//          1  2  3
//          1  2  3
//          1  2  3
public class QuestionNo2 {
    void pattern(int r, int c){
        for(int i = 1;i<=r;i++){
            for(int j = 1;j<=c;j++){
                System.out.print(j+"  ");
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

        QuestionNo2 q2= new QuestionNo2();
        q2.pattern(r, c);
        sc.close();
    }
}
