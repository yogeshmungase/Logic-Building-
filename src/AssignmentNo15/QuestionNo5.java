package src.AssignmentNo15;

import java.util.Scanner;

// Input : 5, 5;
// OutPut  1 2 3 4 5 
//         1 2     5 
//         1   3   5
//         1     4 5
//         1 2 3 4 5 
public class QuestionNo5 {
    void pattern(int r, int c){
        for(int i = 1;i<=r;i++){
            for(int j = 1;j<=c; j++){
                if(i==j||i==1||j==1||i==r||j==c){
                    System.out.print(i+" ");
                }else{
                    System.out.print("  ");
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

        QuestionNo5 q1 = new QuestionNo5();
        q1.pattern(r, c);
        sc.close();
    }
}
