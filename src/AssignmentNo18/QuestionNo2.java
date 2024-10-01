package src.AssignmentNo18;
// Accept N numbers from user and accept one another number as NO , 
// return index of first occurrence of that NO.

import java.util.Scanner;

// Input :  N :   6
// NO:   66 
// Elements : 85 66 3 66 93 88  
// Output : 1 

// Input :  N :  6 
// NO:  12 
// Elements : 85 11 3 15 11 111  
// Output : -1 
public class QuestionNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element (N) :");
        int N = sc.nextInt();
        System.out.print("Enter the NO :");
        int No = sc.nextInt();

        int number[] = new int[N];
        int num=-1  ;
        //System.out.print("Enter the "+N+" elements :");
        for(int i = 0 ;i<N;i++){
            System.out.print("Enter the "+i+" element :");
            number[i] = sc.nextInt();

            if(number[i] == No){
               num = i; 
               break;
            }
        }
        System.out.print(num);
        sc.close();
    }
}
