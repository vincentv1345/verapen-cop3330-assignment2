package ex26;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class interestCreditCard {
    public static void main(String []args){
        printData n = new printData();
        double b = n.getBalance();
        double i = n.getAPR();
        double p = n.getMonthlyPayment();
        n.print(b,i,p);
    }
}
