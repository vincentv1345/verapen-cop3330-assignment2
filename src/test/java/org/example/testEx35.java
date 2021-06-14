package org.example;
import org.junit.jupiter.api.Test;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class testEx35 {
    Scanner n = new Scanner(System.in);
    public int getTotalNames(){
        System.out.print("How many names should be entered: ");
        int arrayLength = n.nextInt();
        return arrayLength;
    }
    public void getNames(int arrayLength){
        int randomNum = getRandomNumbers(arrayLength);
        String names[] = new String[arrayLength];
        for(int i = 0; i<arrayLength; i++){
            System.out.print("Enter a name: ");
            names[i] = n.next();
        }
        printWinner(names, randomNum);
    }
    public int getRandomNumbers(int x){
        Random randomNum = new Random();
        int random = randomNum.nextInt(x+1);
        return random;
    }
    @Test
    public void printWinner(String []contestants, int randomNum){
        contestants = new String[]{"Moe", "Joe", "Dan", "Kate"};
        randomNum = 4;
        String winner = "The winner is " + contestants[randomNum];
        System.out.println(winner);
    }
}
