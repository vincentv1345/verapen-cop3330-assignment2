package org.example;
import ex32.getData;
import org.junit.jupiter.api.Test;
import java.util.Random;
public class testEx32 extends getData {
    Random randomNum = new Random();
    @Test
    public int checkDifficulty(int level){
        level = 4;
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
    @Test
    public void compNumbers(int num, int randomNum){
        int g = 0;
        num = 1;
        randomNum = 30;
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

