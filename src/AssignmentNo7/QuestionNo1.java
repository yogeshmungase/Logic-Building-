package src.AssignmentNo7;

import java.util.Scanner;

// .Write a program which accept radius of circle from user and calculate its area. 
// Consider value of PI as 3.14. (Area = PI * Radius * Radius) 
// Input :  5.3  
// Output :  88.2026   
// Input :  10.4  
// Output :  339.6224 
public class QuestionNo1 {
    void areaOfCircle(float radius) {
        float area = (float) (3.14 * (radius * radius));
        System.out.println("Area of circle is : " + area);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the radius of the circle : ");
       float r = sc.nextFloat();
       QuestionNo1 q1 = new QuestionNo1();
       q1.areaOfCircle(r);
       sc.close();
    }
}
