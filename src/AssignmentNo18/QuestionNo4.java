package src.AssignmentNo18;
// Accept N numbers from user and accept Range, Display all elements from that range 

import java.util.Scanner;

// Input :  N :  6 
// Start: 60
// End : 90 
// Elements : 85 66 3 76 93 88 
// Output : 66 76 85 88

// Input :  N : 6
// Start: 30
// End : 50 
// Elements : 85 66 3 76 93 88  
// Output :
public class QuestionNo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element (N) :");
        int N = sc.nextInt();
        System.out.print("Enter the Start element : ");
        int start = sc.nextInt();
        System.out.print("Enter the End Element : ");
        int end = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the " + i + " element :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements within the range " + start + " and " + end + ": ");
        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (arr[i] >= start && arr[i] <= end) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No elements found in the given range.");
        }

        sc.close();
    }
}
