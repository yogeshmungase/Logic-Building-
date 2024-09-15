package src.AssignmentNo7;

import java.util.Scanner;

// Write a program which accept distance in kilometre and convert it into meter. (1 kilometre = 1000 Meter) 
// Input :  5 
// Output :  5000 
public class QuestionNo3 {
    void convert(float kilometre){
        float meter = kilometre * 1000;
        System.out.println(kilometre+ " kilometre is  : "+meter +" metre ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the kilometre : ");
       float km = sc.nextFloat();
       QuestionNo3 q3 = new QuestionNo3();
       q3.convert(km);
       sc.close();
    }
}
