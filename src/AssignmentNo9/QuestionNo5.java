package src.AssignmentNo9;

import java.util.Scanner;

// Accept number from user and display below pattern.
// Input : 8
// Output : 2 4 6 8 10 12 14 16
public class QuestionNo5 {
    void pattern(int num){
        for(int i = 1; i<= 2*num; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        QuestionNo5 q5 = new QuestionNo5();
        q5.pattern(num);

        sc.close();
    }
}
