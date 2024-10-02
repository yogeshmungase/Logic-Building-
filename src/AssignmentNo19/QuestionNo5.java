package src.AssignmentNo19;

import java.util.Scanner;

// Accept N numbers from user and display summation of digits of each number. 
// Input :  N :   6 
// Elements : 8225  665 3 76 953 858  
// Output : 17 17 3 13 17 21
public class QuestionNo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element (N) :");
        int N = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter the element :");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the " + i + " element :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Summation of digits of each number:");

        for (int num : arr) {
            System.out.print(sumOfDigits(num) + " ");
        }
        sc.close();
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10; 
        }
        return sum;
    }
    
}
