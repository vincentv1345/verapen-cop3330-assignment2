package ex25;

public class testIndicators extends checkPassword{
    checkPassword n = new checkPassword();
    public void indicator(String password){
        boolean numbers = n.checkNumbers(password);
        boolean letters = n.checkLetters(password);
        boolean strongPassword = n.checkStrongPassword(password);
        boolean strongerPassword = n.checkStrongerPassword(password);
        if(numbers == true) {
            System.out.println("The password '" + password + "' is a very weak password.");
        }
        else if(letters == true) {
                System.out.println("The password '" + password + "' is a weak password.");
        }
        else if(strongPassword == true){
                System.out.println("The password '" + password + "' is a strong password.");
            }
        else if(strongerPassword == true){
            System.out.println("The password '" + password + "' is a very strong password.");
        }
    }
}
