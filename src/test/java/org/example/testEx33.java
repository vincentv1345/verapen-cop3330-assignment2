package org.example;
import ex33.getQuestion;
import org.junit.jupiter.api.Test;
import java.util.Random;
public class testEx33 extends getQuestion{
    @Test
public void getAnswer(){
        Random randomNum = new Random();
        int x = randomNum.nextInt(5);
        String choice[] = {"Yes", "No", "Maybe", "Ask again later"};
        System.out.println(choice[x-1]);
    }
}
