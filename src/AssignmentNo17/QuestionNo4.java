package src.AssignmentNo17;
//Accept N numbers from user and return frequency of 11 form it. 
// Input :  N :   6 
// Elements : 85 66 3 15 93 88  
// Output : 0 

import java.util.Scanner;

// Input :  N :   6 
// Elements : 85 11 3 15 11 111  
// Output : 2 
public class QuestionNo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of element (N) :");
        int N = sc.nextInt();

        int count=0;

        System.out.println("Enter the elements :");
        for(int i= 1;i<=N;i++){
            int element = sc.nextInt();
            if(element==11){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
