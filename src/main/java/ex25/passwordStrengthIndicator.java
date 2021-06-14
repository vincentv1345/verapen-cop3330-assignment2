package ex25;

public class passwordStrengthIndicator {
    public static void main(String []args)
    {
        testIndicators p = new testIndicators();
        String password = p.getPassword();
        p.indicator(password);
        boolean f =p.checkStrongPassword(password);
        System.out.println(f);
    }

}
