package src.AssignmentNo6;
// Write a program which accept number from user and return the count of even 
// digits. 
// Input :  2395  
// Output :  1 

// Input :  1018 
// Output :  2 

// Input :  -1018 
// Output :  2 

// Input :  8462 
// Output :  4 
public class QuestionNo1 {

    static void evenCheck(int num){
        int count=0;
          while(num>0){
            int digit = num%10;
            if(digit%2==0){
                count++;
            }
            num = num/10;
          }
          System.out.println(count);
    }

    public static void main(String[] args) {
        QuestionNo1.evenCheck(1018);
    }
}
