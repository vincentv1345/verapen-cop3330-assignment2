package ex29;
import java.util.InputMismatchException;
import java.util.Scanner;
public class getNumber {
    Scanner rate = new Scanner(System.in);
    public double getRate() {
        String r = "";
        double x = 0.0;
        double y = 0;
        boolean f = true;
        System.out.print("What is the rate of return: ");
        while(f) {
            r = rate.next();
            if(r == null){
                System.out.println("Sorry that is not valid input");
                break;
            }
            else if(f){
                try{
                    x = Double.parseDouble(r);
                    break;
                }
                catch (NumberFormatException exception){
                    System.out.println("Sorry that's not valid input.");
                    getRate();
                }
            }
            }
        return x;
        }
        public double calcInvestment(double rate){
            return Math.round((72.0/rate)*100.0)/100.0;
        }

    public void calcRate(double rate) {
        if (rate == 0) {
            System.out.println("Cannot Divide by zero please try again.");
            getRate();
        } else {
            System.out.println("It will take " + calcInvestment(rate) + " years to double your investment.");
        }
    }
}
