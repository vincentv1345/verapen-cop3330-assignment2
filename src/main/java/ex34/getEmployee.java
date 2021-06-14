package ex34;
import java.util.Scanner;
public class getEmployee {
    public String getEmployee(){
        Scanner e = new Scanner(System.in);
        System.out.print("Choose an employee to remove: ");
        return e.next();
    }
    public String[] getEmployees(){
        String[]employees= {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        return employees;
    }
    public void displayEmployees(String [] employeeList){
        System.out.println("There are " + employeeList.length + " employees: ");
        for (String s : employeeList) {
            System.out.println(s);
        }
    }
}
