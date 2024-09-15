package src.AssignmentNo9;
// Accept number from user and display below pattern.
// Input :  5
// Output : A B C D E

import java.util.Scanner;

public class QuestionNo1 {
    void displayPattern(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((char) ('A' + i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        QuestionNo1 pattern = new QuestionNo1();
        pattern.displayPattern(num);
    
        sc.close();
    }
}
