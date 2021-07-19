package ex36;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class getNumbers {
    public ArrayList<Integer> getNum(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numArray = new ArrayList<Integer>();
        System.out.print("Please enter a number: ");
        while(scanner.hasNextInt()) {
            System.out.print("Please enter a number: ");
            numArray.add(scanner.nextInt());
        }
        return numArray;
    }
    public void printNumbers(ArrayList<Integer> numArray){
        System.out.print("Numbers: ");
        for(int i = 0; i<numArray.size(); i++){
            System.out.print(numArray.get(i) + " ");
            System.out.println();
        }
    }
    public double average(ArrayList<Integer> numArray){
        //gets number array
        int num = 0;
        for(Integer array: numArray){
            num += array;
        }
        //calculates the num array avg
        double average = num/numArray.size();
        return average;
    }
    //prints average
    public void printAverage(ArrayList<Integer> numArray){
        double mean = average(numArray);
        System.out.println("The average is: " + mean);
    }
    //gets min with collections
    public void min(ArrayList<Integer> numArray){
        int n = Collections.min(numArray);
        System.out.println("The min is " + n);
    }
    //gets max with collections
    public void max(ArrayList<Integer> numArray){
        int n = Collections.max(numArray);
        System.out.println("The max is " + n);
    }
    //gets std using num array and mean function
    public void std(ArrayList<Integer> numArray){
        int std = 0;
        double sum = 0;
        double mean = average(numArray);
        for (double num: numArray){
            std += Math.pow(num - mean, 2);
        }
        double n = Math.sqrt((double)std/(double)numArray.size());
        System.out.println("The std is " + n);
    }
}
