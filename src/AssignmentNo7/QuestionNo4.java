package src.AssignmentNo7;
import java.util.Scanner;

public class QuestionNo4 {
    void temperature(double fahrenheit) {
        double celsius = (fahrenheit - 32) * (5.0 / 9.0);
        System.out.printf("%.4f Fahrenheit is equal to %.4f Celsius", fahrenheit, celsius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        QuestionNo4 q4 = new QuestionNo4();
        q4.temperature(f);
        sc.close();
    }
}