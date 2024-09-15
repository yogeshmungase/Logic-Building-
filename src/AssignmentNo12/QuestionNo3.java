package src.AssignmentNo12;

import java.util.Scanner;

// Input 5 , 5
// Output : @ * * * *
//          * @ * * * 
//          * * @ * * 
//          * * * @ * 
//          * * * * @ 
public class QuestionNo3 {
    void pattern(int r , int c){
        for(int i = 1; i<=r; i++){
            for(int j = 1; j<= c; j++){
                if(j==i){
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
        System.out.print("Enter the number of rows :");
        int r = sc.nextInt();
        System.out.print("Enter the number of col :");
        int c = sc.nextInt();

        QuestionNo3 q2 = new QuestionNo3();
        q2.pattern(r, c);
        sc.close();
    }
}
