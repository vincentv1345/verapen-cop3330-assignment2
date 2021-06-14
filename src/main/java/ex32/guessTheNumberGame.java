package ex32;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class guessTheNumberGame {
    static difficultyLevels n = new difficultyLevels();
    public static void main(String []args){
        System.out.println("Lets play guess the number!");
        int diff = n.getDifficulty();
        int randomNum = n.checkDifficulty(diff);
        int getNum = n.getNumber();
        int g = 0;
        n.compNumbers(getNum, randomNum);
        checkIfPlayAgain();
    }
    public static void checkIfPlayAgain(){
        System.out.print("Would you you like to play again? ");
        String answer = n.getAnswer();
        if(answer.equalsIgnoreCase("Y")){
            int diff = n.getDifficulty();
            int randomNum = n.checkDifficulty(diff);
            int getNum = n.getNumber();
            n.compNumbers(getNum, randomNum);
            checkIfPlayAgain();
        }
        else if(answer.equals('N')){
            System.exit(0);
        }
    }
}
