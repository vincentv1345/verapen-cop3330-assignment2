package ex31;
import java.util.Scanner;
public class getData {
    Scanner a = new Scanner(System.in);
    public int getAge(){
        System.out.print("What is your age?: ");
        return a.nextInt();
    }
    public int getRestHeartRate(){
        System.out.print("What is your resting heart rate? ");
        return a.nextInt();
    }
}
