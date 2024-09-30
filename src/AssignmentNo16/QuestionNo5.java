package src.AssignmentNo16;

import java.util.Scanner;

// Accept N numbers from user and display all such elements which are multiples of 11. 
// Input :  N :   6 
// Elements : 85 66 3 55 93 88  
// Output : 66 55 88
public class QuestionNo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of elemtens N :");
        int N = sc.nextInt();

        System.out.print("Enter the "+N+" elments :");
        for(int i = 1; i<=N;i++){
            int elements = sc.nextInt();
            if(elements%11==0){
                System.out.print(elements+" ");
            }
        }
        sc.close();
    }
}
