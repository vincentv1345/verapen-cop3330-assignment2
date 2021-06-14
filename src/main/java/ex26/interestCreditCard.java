package ex26;

public class interestCreditCard {
    public static void main(String []args){
        printData n = new printData();
        double b = n.getBalance();
        double i = n.getAPR();
        double p = n.getMonthlyPayment();
        n.print(b,i,p);
    }
}
