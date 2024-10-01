package src.AssignmentNo18;
// Accept N numbers from user and accept one another number as NO , check whether NO is present or not. 
// Input :  N : 6
// NO:   66 
// Elements : 85 66 3 66 93 88  
// Output : TRUE 

import java.util.Scanner;

// Input :  N :  6 
// NO:  12 
// Elements : 85 11 3 15 11 111  
// Output : FALSE 
public class QuestionNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element (N) :");
        int N = sc.nextInt();
        System.out.print("Enter the NO :");
        int NO =sc.nextInt();

        boolean flag = false;

        for(int i=1;i<=N;i++){
            System.out.print("Enter the "+i+" element :");
            int element = sc.nextInt();

            if(element==NO){
                flag = true;
            }
        }
        System.out.print(flag);
        sc.close();
    }
}
