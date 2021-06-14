package ex26;
import java.util.Scanner;
public class getCreditInformation {
    Scanner info = new Scanner(System.in);
    public double getBalance(){
        System.out.print("What is your Credit Card Balance? ");
        return info.nextDouble();
    }
    public double getAPR(){
        System.out.print("What is the APR(as a percent)? ");
        return info.nextDouble();
    }
    public double getMonthlyPayment(){
        System.out.print("What is the monthly payment you can make? ");
        return info.nextDouble();
    }
}
