package ex27;
import java.util.Scanner;
public class getEmployeeInfo {
    Scanner data = new Scanner(System.in);
    public String getFirstName(){
        System.out.print("Enter the first Name: ");
        return data.next();
    }
    public String getLastName(){
        System.out.print("Enter the last name: ");
        return data.next();
    }
    public String getEmployeeID(){
        System.out.print("Enter employee ID: ");
        return data.next();
    }
    public String getZip(){
        System.out.print("Enter the zip code: ");
        return data.next();
    }
}
