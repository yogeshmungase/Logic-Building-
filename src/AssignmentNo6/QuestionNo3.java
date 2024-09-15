package src.AssignmentNo6;

// Write a program which accept number from user and return the count of digits in between 3 and 7. 
// Input :  2395  
// Output :  1

public class QuestionNo3 {
    static void checkNumber(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > 3 && digit < 7) {
                count++;
            }
            num = num/10;
        }
        System.out.println("digits in between 3 and 7 number is : " + count);
    }
    public static void main(String[] args) {
        QuestionNo3.checkNumber(2395);
    }
}
