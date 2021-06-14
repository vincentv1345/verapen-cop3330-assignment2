package org.example;
import ex25.Password;
import org.junit.jupiter.api.Test;
public class testEx25 extends Password {
    @Test
    public boolean checkNumbers(String password) {
        password = "123456";
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)) == true && password.length() < 8) {
                return true;
            }
        }
        return false;
    }
    @Test
    public boolean checkLetters(String password)
    {
        password = "baby";
        for(int i = 0; i < password.length(); i++){
            if(Character.isLetter(password.charAt(i)) == true && password.length()<8){
                return true;
            }
        }
        return false;
    }
    @Test
    public boolean checkStrongPassword(String password) {
        password = "asdf1235";
        String SpecialCharacters = "!@#$%^&*()'+,-./:;<=>?[]^_`{|}";
        for (int i = 0; i < password.length(); i++) {
            if (SpecialCharacters.contains(Character.toString(password.charAt(i))) == true) {
                return false;
            }
            else if(Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i)) == true && password.length() >= 8) {
                return true;
            }
        }
        return false;
    }
@Test
    public boolean checkStrongerPassword(String password){
        password = "asf123%^&*";
        String SpecialCharacters = "!@#$%^&*()'+,-./:;<=>?[]^_`{|}";
        for(int i = 0; i<password.length(); i++){
            if(SpecialCharacters.contains(Character.toString(password.charAt(i))) || Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i)) == true && password.length()>=8){
                return true;
            }
        }
        return false;
    }
}