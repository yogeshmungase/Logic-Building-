package src.AssignmentNo16;

import java.util.Scanner;

// Accept N numbers from user and return difference between summation of even elements and summation of odd elements. 
    // Input :  N :   6 
    // Elements : 85 66 3 80 93 88  
    // Output : 53 (234 - 181) 
public class QuestionNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements (N) : ");
        int N = sc.nextInt();

        int evenSum =0;
        int oddSum = 0;

        System.out.println("Enter "+ N + " Elements :");
        for(int i = 1; i<= N; i++){
            int elements = sc.nextInt();
            if(elements%2==0){
                evenSum +=elements;
            }else{
                oddSum += elements;
            }
        }

        int difference = evenSum - oddSum;
        System.out.println(difference+"("+evenSum+" - "+oddSum+")");
        sc.close();
    }

}
