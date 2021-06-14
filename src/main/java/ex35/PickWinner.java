package ex35;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class PickWinner {
    public static void main(String []args){
        getNames n = new getNames();
        int num = n.getTotalNames();
        n.getNames(num);
    }
}
