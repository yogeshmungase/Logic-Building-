package src.AssignmentNo9;

import java.util.Scanner;

// Accept number from user and display below pattern.
//  Input : 5 
//  Output : 1 * 2 * 3 * 4 * 5 *
public class QuestionNo3 {
    void pattern(int num ){
        for (int i = 1; i<=5; i++){
            System.out.print(i+" * ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        QuestionNo3 q3 = new QuestionNo3();
        q3.pattern(num);

        sc.close();
    }
}
