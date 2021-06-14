package ex35;

public class PickWinner {
    public static void main(String []args){
        getNames n = new getNames();
        int num = n.getTotalNames();
        n.getNames(num);
    }
}
