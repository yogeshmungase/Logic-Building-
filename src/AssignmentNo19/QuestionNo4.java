package src.AssignmentNo19;

import java.util.Scanner;

// Accept N numbers from user and display all such numbers which contains  3 digits in it. 
// Input :  N :   6 
// Elements : 8225  665 3 76 953 858
// Output : 665 953 858
public class QuestionNo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element (N) :");
        int N = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter the element :");
        for(int i=0;i<N;i++){
            System.out.print("Enter the "+i+" element :");
             arr[i]= sc.nextInt();
        }

        for(int x : arr){
            if (x >= 100 && x<1000){
                System.out.print(x + " ");
            }
        }
        sc.close();
    }
}
