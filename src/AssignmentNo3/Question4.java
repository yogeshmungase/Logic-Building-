package src.AssignmentNo3;

import java.util.Scanner;

// Accept one character from user and convert case of that character. 
public class Question4 {
    public static void DisplayConvert(char CValue) {
        if (CValue >= 'a' && CValue <= 'z') {
            // Convert lowercase to uppercase by subtracting 32
            System.out.println((char) (CValue - 32));
        } else if (CValue >= 'A' && CValue <= 'Z') {
            // Convert uppercase to lowercase by adding 32
            System.out.println((char) (CValue + 32));
        } else {
            System.out.println("Invalid character");
        }
    }

    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Variable to hold the input value
        char cValue;

        // Prompt the user to enter a character
        System.out.println("Enter character:");
        cValue = scanner.next().charAt(0);

        // Call the DisplayConvert method with the entered character
        DisplayConvert(cValue);

        // Close the scanner object to avoid resource leaks
        scanner.close();
    }
}
