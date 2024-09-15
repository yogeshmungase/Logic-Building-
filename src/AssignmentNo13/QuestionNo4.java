package src.AssignmentNo13;

import java.util.Scanner;

// Input : 6 , 5
// Output : * * * * * 
//          * @ @ @ * 
//          * @ @ @ * 
//          * @ @ @ * 
//          * @ @ @ * 
//          * * * * * 
public class QuestionNo4 {
    void pattern(int r, int c){
        for(int i = 1; i<= r; i++){
            for(int j = 1; j<=c; j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print(" * ");
                }else{
                    System.out.print(" @ ");
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

        QuestionNo4 q2 = new QuestionNo4();
        q2.pattern(r, c);
        sc.close();
    }
}
