package ex32;
import java.util.Scanner;
public class getData {
    Scanner i = new Scanner(System.in);
    public int getDifficulty(){
        int x = 0;
        System.out.print("Enter a difficulty level (1,2 or 3): ");
        try {
            String y = i.next();
            x = Integer.parseInt(y);
        }
        catch (NumberFormatException e){
            System.out.println("This isn't a number try again. ");
            getDifficulty();
        }
        return x;
    }
    public int getCounter(){
        int counter = 0;
        counter++;
        return counter;
    }
    public int getNumber(){
        int x = 0;
        System.out.println("I have my number whats your guess? ");
        try {
            String y = i.next();
            x = Integer.parseInt(y);
        }
        catch (NumberFormatException e){
            System.out.println("This isn't a number try again. ");
            getNumber();
            int count = getCounter();
        }
        return x;
    }
    public int getGuess(){
        return i.nextInt();
    }
    public String getAnswer(){
        return i.next();
    }
}
