package src.Pattern;

class Pyramid3D{
    static void printPyramid(int noOfBlock){
        int level ;
        int blockUsed = 0;
        int blockRemaning = noOfBlock;

        for(level = 1;;level++){
            int blockInCurrentLevel = level * level;
            if(blockRemaning < blockInCurrentLevel){
                break;
            }
                blockUsed += blockInCurrentLevel;
                blockRemaning -= blockInCurrentLevel;
        }
        System.out.println("Level :"+(level-1));
        System.out.println("BlockUsed :"+blockUsed);
        System.out.println("remaining Block :"+blockRemaning);
    }

    static void displayPyramid(int totalBlock){
        int level = 0;
        int blockUsed =0;
        int remainingBlock = totalBlock;
        int blockInCurrentLevel =0;

        while(true){
            level++;
            blockInCurrentLevel = level * level;
            if(remainingBlock >= blockInCurrentLevel){
                blockUsed += blockInCurrentLevel;
                remainingBlock -=  blockInCurrentLevel;
            }else{
                break;
            }
        }
        System.out.println("Level :"+ level);
        System.out.println("BlockUsed :"+blockUsed);
        System.out.println("remaining Block :"+remainingBlock);
    }
    public static void main(String[] args) {
        Pyramid3D.printPyramid(55);
        Pyramid3D.displayPyramid(55);
    }
}