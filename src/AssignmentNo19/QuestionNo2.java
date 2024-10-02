package src.AssignmentNo19;

import java.util.Scanner;

// Accept N numbers from user and return the smallest number. 
// Input :  N :   6 
// Elements : 85 66 3 66 93 88  
// Output : 3
public class QuestionNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements :");
        int N = sc.nextInt();

        int arr[] = new int[N];
        System.out.println("Enter the elements :");
        for(int i =0;i<N;i++){
            System.out.print("Enter the "+i+" element :");
             arr[i]= sc.nextInt();
        }

        int smallest = arr[0];
        for(int x : arr){
            if(smallest > x){
                smallest = x;
            }
        }
        System.out.print("The smallest number is : "+ smallest);
        sc.close();

    }
}
