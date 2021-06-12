package ex25;

public class checkPassword extends Password {
    public boolean checkNumbers(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)) == true && password.length() < 8) {
                return true;
            }
        }
        return false;
    }
    public boolean checkLetters(String password)
    {
        for(int i = 0; i < password.length(); i++){
            if(Character.isLetter(password.charAt(i)) == true && password.length()<8){
                return true;
            }
        }
        return false;
    }
    public boolean checkStrongPassword(String password) {
        String SpecialCharacters = "!@#$%^&*()'+,-./:;<=>?[]^_`{|}";
        for (int i = 0; i < password.length(); i++) {
            if (!SpecialCharacters.contains(Character.toString(password.charAt(i))) && Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i)) == true && password.length() >= 8) {
                return true;
            }
        }
        return false;
    }
    public boolean checkStrongerPassword(String password){
        String SpecialCharacters = "!@#$%^&*()'+,-./:;<=>?[]^_`{|}";
        for(int i = 0; i<password.length(); i++){
            if(SpecialCharacters.contains(Character.toString(password.charAt(i))) || Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i)) == true && password.length()>=8){
                return true;
            }
        }
        return false;
    }
}