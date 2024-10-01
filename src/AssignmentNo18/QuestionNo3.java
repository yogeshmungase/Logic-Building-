package src.AssignmentNo18;
// Accept N numbers from user and accept one another number as NO , 
// return index of last occurrence of that NO.

import java.util.Scanner;

// Input :  N :   6
// NO:  66 
// Elements : 85 66 3 66 93 88  
// Output : 3 

// Input :  N :   6
// NO:  93
// Elements : 85 66 3 66 93 88  
// Output : 4 

// Input :   N :  6 
// NO:  12 
// Elements : 85 11 3 15 11 111  
// Output : -1 
public class QuestionNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element (N) :");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter the "+i+" element :");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number (NO) to find the last occurrence of: ");
        int NO = sc.nextInt();

        int lastIndex = -1;
        for(int i= 0;i<N;i++){
            if(arr[i]==NO){
                lastIndex =i;
            }
        }

        System.out.println("Last occurrence of " + NO + " is at index: " + lastIndex);
        sc.close();
    }
}
