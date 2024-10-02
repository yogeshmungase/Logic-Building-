package src.AssignmentNo19;

import java.util.Scanner;

// Accept N numbers from user and return the difference between largest and smallest number. 
// Input : N :6 
// Elements : 85 66 3 66 93 88  
// Output : 90 (93 -3) 
public class QuestionNo3 {
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

        int largest = 0;
        int smallest = arr[0];

        for(int x : arr){
            if(largest < x){
                largest = x;
            }
            if(smallest > x){
                smallest = x;
            }
        }
        int difference = largest - smallest;
        System.out.println("Difference between largest and smallest number :");
        System.out.println(difference+" ("+largest+" - "+smallest+")");
        sc.close();
    }
}
