package ex30;

public class multiplicationTable {
    public void createTable() {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j<13; j++){
                System.out.printf("%4d ", i*j);
                if(j == 12){
                    System.out.println();
                }
            }
        }
    }
}
