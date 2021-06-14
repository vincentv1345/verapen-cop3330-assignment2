package ex28;
import java.util.Scanner;
public class inputAdd {
    Scanner input = new Scanner(System.in);
    public void addInput(){
        int number = 0;
        int newNumber = 0;
        for(int i = 0; i<5; i++){
            System.out.print(" Please enter a number: ");
            newNumber = input.nextInt();
            number += newNumber;
        }
        System.out.println("The total is: " + number);
    }
}
