package ex33;
import java.util.Arrays;
import java.util.Random;

public class giveAnswer extends getQuestion{
    public void getAnswer(){
        Random randomNum = new Random();
        int x = randomNum.nextInt(4);
        String choice[] = {"Yes", "No", "Maybe", "Ask again later"};
        System.out.println(choice[x]);
    }
}
