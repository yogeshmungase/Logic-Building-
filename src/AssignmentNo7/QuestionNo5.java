package src.AssignmentNo7;

import java.util.Scanner;

// Write a program which accept area in square feet and convert it into square 
// meter. (1 square feet = 0.0929 Square meter) 
// Input :  5 
// Output :  0.464515 
// Input :  7 
// Output :  0.650321 
public class QuestionNo5 {
    void areaConvert(int area){
        double sqm = area * 0.0929;
        System.out.println(area+" square feet is equal to : "+sqm+" square meter ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area in square feet : ");
        int a = sc.nextInt();
        QuestionNo5 q5 = new QuestionNo5();
        q5.areaConvert(a);
        sc.close();
    }
}
