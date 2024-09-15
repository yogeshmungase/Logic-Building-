package src.AssignmentNo12;

import java.util.Scanner;

// Input : 4 ,4
// Output : 1 2 3 4 
//          1 @ @ 4
//          1 @ @ 4 
//          1 2 3 4
public class QuestionNo5 {
    void pattern(int r, int c){
        for(int i= 1; i<=r;i++){
            for(int j = 1; j<= c; j++){
                if(i==1 || j == 1 || j==c||i==r){
                    System.out.print(" "+j);
                }else{
                    System.out.print(" @");
                }
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

        QuestionNo5 q2 = new QuestionNo5();
        q2.pattern(r, c);
        sc.close();
    }
}
