package ex37;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class PasswordGenerator {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        getPasswordInstructions p = new getPasswordInstructions();
        System.out.println("What is the minimum length? ");
        int length = scanner.nextInt();
        System.out.println("How many special characters? ");
        int specialCharacters = scanner.nextInt();
        System.out.println("How many numbers? ");
        int numbers = scanner.nextInt();
        p.setLength(length);
        p.setCharacters(specialCharacters);
        p.setNumbers(numbers);
    }
}
