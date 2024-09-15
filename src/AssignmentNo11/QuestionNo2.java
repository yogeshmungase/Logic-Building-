package src.AssignmentNo11;

import java.util.Scanner;

// Accept number of rows and number of columns from user and display below pattern. 
// Input : 4 4 
// Output : A B C D 
//          a b c d
//          A B C D 
//          a b c d
public class QuestionNo2 {
    void pattern(int r, int c){
        for(int i = 0; i<=r; i++){
            for(int j= 0; j<=c;j++){
                if(i%2==0){
                    System.out.print((char)('A'+j)+" ");
                }else{
                    System.out.print((char)('a'+j)+" "); 
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

        QuestionNo2 q2= new QuestionNo2();
        q2.pattern(r, c);
        sc.close();
    }
}
