package ex25;
import java.util.Scanner;
public class Password {
    Scanner p = new Scanner(System.in);
    public String getPassword(){
        System.out.print("Please enter a password: ");
        return p.next();
    }
}
