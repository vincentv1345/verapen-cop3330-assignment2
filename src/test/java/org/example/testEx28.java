package org.example;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
public class testEx28 {
    Scanner input = new Scanner(System.in);
    @Test
    public void addInput(){
        int number = 0;
        int newNumber = 0;
        for(int i = 0; i<5; i++){
            newNumber = 5;
            number += newNumber;
        }
        System.out.println("The total is: " + number);
    }
}
