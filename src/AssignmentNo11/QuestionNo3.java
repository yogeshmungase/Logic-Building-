package src.AssignmentNo11;

import java.util.Scanner;

// Accept number of rows and number of columns from user and display below pattern. 
// Input : 3 5
// output: A A A A A 
//         B B B B B 
//         C C C C C 
public class QuestionNo3 {
    void pattern(int r, int c){
        for(int i = 0;i<=r;i++){
            for(int j =0; j<=c;j++){
                System.out.print((char)('A'+ i)+ " ");
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
