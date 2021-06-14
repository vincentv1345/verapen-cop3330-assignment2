package org.example;
import ex26.getCreditInformation;
import java.lang.Math;
import org.junit.jupiter.api.Test;
public class testEx26 extends getCreditInformation{
    @Test
    public double calculateUntilMonthsPaidOff(double b, double n, double p)
    {
        b = 25.4;
        b = 1.0;
        p = 20.0;
        double i = (n/100.0)/365.0;
        double x = -(1.0/30.0) * Math.log(1.0 + (b/p) * (1-(Math.pow((1.0 + i), 30.0)))) / Math.log(1.0+ i);
        return Math.ceil(x);
    }
}
