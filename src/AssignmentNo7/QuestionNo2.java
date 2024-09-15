package src.AssignmentNo7;

import java.util.Scanner;

// Write a program which accept width & height of rectangle from user and calculate its area. 
//(Area = Width * Height) 
// Input :  5.3  9.78 
// Output :  51.834 
public class QuestionNo2 {
     void areOfRectangle(float width , float height){
        float area = width * height ;
        System.out.print("Area of Rectangle : "+ area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Width :");
        float w =  sc.nextFloat();
        System.out.println("Enter the Height :");
        float h =  sc.nextFloat();

        QuestionNo2 q2 = new QuestionNo2();
        q2.areOfRectangle(w, h);
        sc.close();
    }
}
