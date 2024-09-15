package src.AssignmentNo1;

import java.util.Scanner;

// Accept one number from user and print that number of * on screen
public class NoOfStar {
    
    public static void main(String[] args) {
        NoOfStar n = new NoOfStar();
        n.print();
    }
    void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();

        for(int i=1;i<=a;i++){
            System.out.print("*"+i+" " );
        }
        sc.close();
    }
}
