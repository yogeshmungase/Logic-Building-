package src.AssignementNo17;

import java.util.Scanner;

// Accept N numbers from user and return difference between frequency of even number and odd numbers. 
// Input :  N :   7 
// Elements : 85 66 3 80 93 88 90 
// Output : 1 (4 -3) 
public class QuestionNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements N :");
        int N = sc.nextInt();
        int evencount=0;
        int oddcount=0;

        System.out.print("Enter the "+N+" elements :");
        for(int i=1;i<=N;i++){
            int elements = sc.nextInt();
            if(elements%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        int difference = evencount - oddcount;
        System.out.println(difference +"("+evencount+" - "+oddcount+")");
        sc.close();
    }
}
