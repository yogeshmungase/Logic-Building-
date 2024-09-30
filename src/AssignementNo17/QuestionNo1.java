package src.AssignementNo17;

import java.util.Scanner;

//  Accept N numbers from user and return frequency of even numbers. 
// Input :  N :   6 
// Elements : 85 66 3 80 93 88  
// Output : 3 
public class QuestionNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element N :");
        int N = sc.nextInt();
        int count = 0;
        System.out.print("Enter the "+N+"elements :");
        for(int i = 1; i<=N; i++){
           int elements = sc.nextInt();
            if(elements % 2==0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
