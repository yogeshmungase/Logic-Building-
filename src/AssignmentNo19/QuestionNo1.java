package src.AssignmentNo19;

import java.util.Scanner;

// Accept N numbers from user and return the largest number. 
// Input :  N :   6 
// Elements : 85 66 3 66 93 88  
// Output : 93 
public class QuestionNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element (N) :");
        int N = sc.nextInt();
        int arr[] = new int[N];

        System.out.println("Enter the elements");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the " + i + " element :");
            arr[i] = sc.nextInt();
        }

        int largest = 0;
        for(int x :arr){
              if(largest < x){
                largest = x;
              }
        }
        System.out.print("The largest number is : " + largest);
        sc.close();
    }
}
