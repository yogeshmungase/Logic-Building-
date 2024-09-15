package src.AssignmentNo3;

import java.util.Scanner;

// Accept on character from user and check whether that character is vowel (a,e,i,o,u) or not
public class Question5 {
  static void checkVowel(char CValue){
    
    if (CValue == 'a' || CValue == 'e' || CValue == 'i' || CValue == 'o' || CValue == 'u' ||
    CValue == 'A' || CValue == 'E' || CValue == 'I' || CValue == 'O' || CValue == 'U') {
       System.out.println("It is Vowel");
    }else{
        System.out.println("It is not Vowel");
    }
  }  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character :");
    char a = sc.next().charAt(0);

    checkVowel(a);
    sc.close();
  }
}
