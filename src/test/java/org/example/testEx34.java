package org.example;
import ex34.getEmployee;
import org.junit.jupiter.api.Test;
public class testEx34 extends getEmployee {
    @Test
    public String[] employee(String employeeList[], String employee){
        String newEmployeeList[] = new String[employeeList.length-1];
        employeeList = new String[]{"John Smith", "John Doe", "Lisa Burns"};
        employee = "Lisa Burns";
        for(int i = 0; i<employeeList.length; i++){
            if(employeeList[i].equals(employee)){
                for(int j = 0; i<employeeList.length-1;i++){
                    newEmployeeList[i] = employeeList[j+1];
                }
                break;
            }
        }
        return newEmployeeList;
    }
    @Test
    public void printNewEmployeeList(String []newEmployeeList){
        newEmployeeList = new String[]{"a", "b", "c", "d"};
        for(int i = 0; i< newEmployeeList.length; i++){
            System.out.println(newEmployeeList[i]);
        }
    }
}

