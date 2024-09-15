package src.AssignmentNo9;

import java.util.Scanner;

// Accept number from user and display below pattern. 
// Input :  4
// Output : # 1 * # 2 * # 3 * # 4 *  
public class QuestionNo4 {
    void pattern(int num){
        for(int i =1 ; i<=num; i++){
            System.out.print(" # "+i+" * ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        QuestionNo4 q4 = new QuestionNo4();
        q4.pattern(num);

        sc.close();
    }
}
