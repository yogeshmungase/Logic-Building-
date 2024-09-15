package src.AssignmentNo13;

import java.util.Scanner;

// Input 5 , 5
// Output : @ * * * *
//          * @ * * * 
//          * * @ * * 
//          * * * @ * 
//          * * * * @ 
public class QuestionNo3 {
    void pattern(int r, int c){
        for(int i = 1; i<=r;i++){
            for(int j = 1; j<= c; j++){
                if(i==j){
                    System.out.print(" @ ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no of rows :");
        int r = sc.nextInt();
        System.out.println(" Enter the no of colums :");
        int c = sc.nextInt();

        QuestionNo3 q3 = new QuestionNo3();
        q3.pattern(r, c);
        sc.close();

    }
}
