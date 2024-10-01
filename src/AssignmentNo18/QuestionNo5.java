package src.AssignmentNo18;

import java.util.Scanner;

// Accept N numbers from user and return product of all odd elements.  
// Input :N :6
// Elements : 15 66 3 70 10 88  
// Output : 45 
// Input : N :   6 
// Elements : 44 66 72 70 10 88  
// Output : 0 
public class QuestionNo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element (N) :");
        int N = sc.nextInt();
        int arr[] = new int[N];
        int multi = 1;
        boolean hasOdd = false;
        for(int i=0;i<N;i++){
            System.out.print("Enter the "+i+" element :");
            arr[i] = sc.nextInt(); 
            if(arr[i]%2!=0){
                multi = multi *arr[i];
                hasOdd = true;
            }
        }

        if(!hasOdd){
            multi = 0;
        }
        System.out.print("product of all odd elements is :"+multi);
        sc.close();
    }
}
