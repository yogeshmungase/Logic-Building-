package src.AssignmentNo16;

import java.util.Scanner;

// Accept N numbers from user and display all such elements which are divisible by 5. 
// Input :  N :   6 
// Elements : 85 66 3 80 93 88  
// Output : 85 80 
public class QuestionNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements (N) :");
        int N = sc.nextInt();

        System.out.print("Enter "+N+" elements :");
        for(int i = 1; i<=N;i++){
            int elements = sc.nextInt();
            if(elements%5==0){
                System.out.print(elements+" ");
            }
        }
        sc.close();
    }
}
