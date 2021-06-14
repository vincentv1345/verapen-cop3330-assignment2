package org.example;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Scanner;
public class testEx36 {
    public int[] getNum(){
        int numArray[] = {};
        System.out.print("Please enter numbers: ");
        while(true){
            Scanner n = new Scanner(System.in);
            String input = n.next();
            if(input.equalsIgnoreCase("done")){
                break;
            }
            else {
                System.out.print("Please enter number: ");
                int in = Integer.parseInt(input);
                while (input != "done") {
                    for(int i = 0; i<0; i++) {
                        numArray[i] = in;
                    }
                }
            }
        }
        return numArray;
    }
    public void printNumbers(int numArray[]){
        System.out.print("Numbers: ");
        for(int i = 0; i<numArray.length; i++){
            System.out.println(numArray[i]);
        }
    }
    @Test
    public String average(int numArray[]){
        numArray = new int[]{1,2,3,4,5};
        int num = 0;
        for(Integer array: numArray){
            num += array;
        }
        double average = num/numArray.length;
        return "The average is " + average;
    }
    @Test
    public void min(int numArray[]){
        Arrays.sort(numArray);
        System.out.println("The min is " + numArray[0]);
    }
    @Test
    public void max(int numArray[]){
        numArray = new int[]{1,2,3,4,5,6};
        Arrays.sort(numArray);
        System.out.println("The max is " + numArray[numArray.length-1]);
    }
}
