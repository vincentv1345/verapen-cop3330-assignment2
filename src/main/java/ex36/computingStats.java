package ex36;

import java.util.ArrayList;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class computingStats {
    public static void main(String []args){
        getNumbers n = new getNumbers();
        ArrayList<Integer> newList = n.getNum();
        n.printNumbers(newList);
        n.average(newList);
        n.min(newList);
        n.max(newList);
        n.std(newList);
    }
}
