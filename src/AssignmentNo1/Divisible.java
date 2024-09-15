package src.AssignmentNo1;

import java.util.Scanner;

//Accept one number and check whether is is divisible by 5 or not. 
public class Divisible {
    
    int check(){
        System.out.println(new Divisible());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        if(num%5==0){
            System.out.println("Number is divisible by 5");
        }else{
            System.out.println("Number is not divisible by 5");
        }
        sc.close();
        return 5;
        
    }

    public static void main(String[] args) {
        int a = new Divisible().check();
        System.out.println(a);
        //check();
        
    }
}
