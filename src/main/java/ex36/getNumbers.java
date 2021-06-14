package ex36;
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
                System.out.println("Please enter number: ");
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
}
