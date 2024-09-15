package src.AssignmentNo6;

import java.util.Scanner;

// Write a program which accept number from user and return difference between 
// summation of even digits and summation of odd digits. 
// Input :  2395  
// Output :  -15 (2 - 17)
public class QuestionNo5 {
     void summation(int num){
        int evensum = 0, oddsum = 0;
        while(num>0){
            
            int digit = num%10;
            if(digit%2==0){
                 evensum = evensum + digit;
            }
            else{
                oddsum = oddsum + digit;
            }
             num = num/10;
        }
        System.out.println("EvenSum : "+ evensum +" And OddSum : "+ oddsum);
        System.out.println("difference between summation of even digits and summation of odd digits is " + (evensum-oddsum));
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        QuestionNo5 q5 = new QuestionNo5();
        q5.summation(n);
        sc.close();
    }   
}
