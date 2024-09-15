package src.AssignmentNo9;

import java.util.Scanner;

// Accept number from user and display below pattern.
// Input : 5 
// Output : 5 # 4 # 3 # 2 # 1 #  
public class QuestionNo2 {
    void pattern(int num){
        for(int i = num; i>=1; i--){
            System.out.print(i+" # ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        QuestionNo2 q2 = new QuestionNo2();
        q2.pattern(num);

        sc.close();
    }
    
}
