package src.AssignementNo17;
// Accept N numbers from user check whether that numbers contains 11 in it or not. 

import java.util.Scanner;

// Input :  N :   6 
// Elements : 85 66 11 80 93 88  
// Output : 11 is present 

// Input :  N :   6 
// Elements : 85 66 3 80 93 88  
// Output : 11 is absent
public class QuestionNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enteer the no of elements (N) : ");
        int N = sc.nextInt();
        int[] numbers = new int[N];

        System.out.print("Enter the "+N+" elements :");
        for(int i = 1 ;i<N;i++){
            numbers[i] = sc.nextInt();
        }

        boolean flag = false;
        for(int num : numbers){
            if(num==11){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("11 is present");
        } else {
            System.out.println("11 is not present");
        }
        sc.close();
    }
}
