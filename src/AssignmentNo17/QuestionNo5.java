package src.AssignmentNo17;
// Accept N numbers from user and accept one another number as NO , return frequency of NO form it. 

// Input :  N :   6 
// NO:  66 
// Elements : 85 66 3 66 93 88  
// Output : 2 

import java.util.Scanner;

// Input :  N :   6
// NO:   12 
// Elements : 85 11 3 15 11 111  
// Output : 0 
public class QuestionNo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of Element (N) :");
        int N = sc.nextInt();
        System.out.print("Enter the NO :");
        int NO = sc.nextInt();

        int count = 0;

        // System.out.print("Enter the Elements :");
        for (int i = 1; i <= N; i++) {
            System.out.print("Enter the "+i+" element :");
            int element = sc.nextInt();
            if (element == NO) {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}
