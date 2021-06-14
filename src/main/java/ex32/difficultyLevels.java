package ex32;
import java.util.Random;
public class difficultyLevels extends getData{
    Random randomNum = new Random();
    public int checkDifficulty(int level){
        int randNum = 0;
        if(level == 1)
        {
            randNum = firstDifficulty();
        }
        else if(level == 2)
        {
            randNum = secondDifficulty();
        }
        else if(level == 3){
            randNum = thirdDifficulty();
        }
        return randNum;
    }
    public int firstDifficulty(){
        int x = 11;
        int rand = randomNum.nextInt(x);
        return rand;
    }
    public int secondDifficulty(){
        int x = 101;
        int rand = randomNum.nextInt(x);
        return rand;
    }
    public int thirdDifficulty(){
        int x = 1001;
        int rand = randomNum.nextInt(x);
        return rand;
    }
    public void compNumbers(int num, int randomNum){
        int g = 0;
        if(num == randomNum){
            System.out.println("You got it in " + g + " tries!");
        }
        else if(num != randomNum) {
                if (num < randomNum) {
                    System.out.println("Too low try higher");
                    int n = getGuess();
                compNumbers(n, randomNum);
            }
                else if (num > randomNum) {
                System.out.println("Too high try lower");
                int n = getGuess();
                compNumbers(n, randomNum);
            }
        }
    }
}

