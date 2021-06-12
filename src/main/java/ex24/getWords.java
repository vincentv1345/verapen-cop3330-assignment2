package ex24;
import java.util.Scanner;
public class getWords {
    Scanner n = new Scanner(System.in);
    public String getWordOne(){
        System.out.print("Please enter your first word: ");
        return n.next();
    }
    public String getWordTwo(){
        System.out.print("Please enter the second word: ");
        return n.next();
    }
}
