package src.AssignmentNo10;

import java.util.Scanner;

// Accept number of rows and number of columns from user and display below pattern. 
// Input : 3 5
// Output : 5 4 3 2 1
//          5 4 3 2 1
//          5 4 3 2 1
public class QuestionNo3 {
    void pattern(int r, int c){
        for(int i = 1 ; i<=r; i++){
            for(int j = c;j>=1; j--){
                System.out.print(j+" ");
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

        QuestionNo3 q3= new QuestionNo3();
        q3.pattern(r, c);
        sc.close();
    }
}
