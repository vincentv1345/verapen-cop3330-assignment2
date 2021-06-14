package ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Verapen
 */
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
