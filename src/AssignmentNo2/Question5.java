package src.AssignmentNo2;

import java.util.Scanner;

//Accept number from user and check whether number is even or odd. 
public class Question5 {
    static void dispaly(int a){
        if(a%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = sc .nextInt();

        dispaly(value);
        sc.close();
    }
}
