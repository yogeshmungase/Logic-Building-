package src.AssignmentNo6;
// Write a program which accept number from user and return the count of odd digits. 
// Input :  2395 

public class QuestionNo2 {
    static void oddCheck(int num){
        int count=0;
        while(num>0){
            int digit = num % 10;
            if(digit%2!=0){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        QuestionNo2.oddCheck(2395);
    }
}
