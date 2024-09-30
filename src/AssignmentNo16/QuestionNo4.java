package src.AssignmentNo16;

import java.util.Scanner;

// Accept N numbers from user and display all such elements which are divisible by 3 and 5. 
// Input :  N :   6 
// Elements : 85 66 3 15 93 88  
// Output : 15 
public class QuestionNo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of elemtens N :");
        int N = sc.nextInt();

        System.out.println("Enter the "+N+" elments :");
        for(int i = 1; i<=N;i++){
            int elements = sc.nextInt();
            if(elements%3==0&&elements%5==0){
                System.out.println(elements+" ");
            }
        }
        sc.close();
    }
}
