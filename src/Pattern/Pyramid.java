package src.Pattern;

import java.util.Scanner;

public class Pyramid {
     void displayPyramid(int totalBlock){
        int level ;
        int remainingBlock = totalBlock;
        int blockUsed = 0;
        int blockInCurrentLevel = 0;
 

        for(level = 0;;level++){

            blockInCurrentLevel = level;
            if(remainingBlock >= blockInCurrentLevel){
                blockUsed += blockInCurrentLevel;
                remainingBlock -= blockInCurrentLevel;
            }else{
                break;
            }
        }
        
        System.out.println("level :" + (level-1));
        System.out.println("blckUsed :" + blockUsed);
        System.out.println("remainingBlock :" + remainingBlock);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of blocks :");
        int b = sc.nextInt();
        Pyramid p = new Pyramid();
        p.displayPyramid(b);
        sc.close();
    }
}
