package ex26;

public class printData extends PaymentCalculator{
    public void print(double b, double i, double p){
        PaymentCalculator m = new PaymentCalculator();
        double months = m.calculateUntilMonthsPaidOff(b, i, p);
        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}
