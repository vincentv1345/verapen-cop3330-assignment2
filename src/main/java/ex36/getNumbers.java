package ex36;
import java.util.Arrays;
import java.util.Scanner;
public class getNumbers {
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
    public String average(int numArray[]){
        int num = 0;
        for(Integer array: numArray){
            num += array;
        }
        double average = num/numArray.length;
        return "The average is " + average;
    }
    public void min(int numArray[]){
        Arrays.sort(numArray);
        System.out.println("The min is " + numArray[0]);
    }
    public void max(int numArray[]){
        Arrays.sort(numArray);
        System.out.println("The max is " + numArray[numArray.length-1]);
    }
    public void std(int numArray[]){
        int std = 0;
        System.out.println("The std is " + std);
    }
}
