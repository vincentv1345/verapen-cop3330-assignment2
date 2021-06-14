package ex36;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class computingStats {
    public static void main(String []args){
        getNumbers n = new getNumbers();
        int[] numArray = n.getNum();
        n.average(numArray);
        n.average(numArray);
        n.min(numArray);
        n.max(numArray);

    }
}
