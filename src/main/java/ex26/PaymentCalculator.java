package ex26;
import java.lang.Math;
public class PaymentCalculator extends getCreditInformation{
    public double calculateUntilMonthsPaidOff(double b, double n, double p)
    {
        double i = (n/100.0)/365.0;
        double x = -(1.0/30.0) * Math.log(1.0 + (b/p) * (1-(Math.pow((1.0 + i), 30.0)))) / Math.log(1.0+ i);
        return Math.ceil(x);
    }
}
