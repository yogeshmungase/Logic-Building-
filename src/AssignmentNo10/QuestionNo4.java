package src.AssignmentNo10;
// Accept number of rows and number of columns from user and display below pattern. 
// Input :  iRow = 3  iCol = 4 
// Output : * # * #  
//          * # * # 
//          * # * # 

import java.util.Scanner;

public class QuestionNo4 {
    void pattern(int r , int c){
        for(int i = 1; i<=r; i++){
            for(int j=1;j<=c;j++){
               if(j%2==0){
                System.out.print(" # ");
               }
               else{
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

        QuestionNo4 q4= new QuestionNo4();
        q4.pattern(r, c);
        sc.close();
    }
}
