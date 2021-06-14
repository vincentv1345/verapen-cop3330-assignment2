package ex34;

import javax.crypto.spec.PSource;

public class removeEmployee extends getEmployee{
    public String[] employee(String employeeList[], String employee){
        String newEmployeeList[] = new String[employeeList.length-1];
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
    public void printNewEmployeeList(String []newEmployeeList){
        for(int i = 0; i< newEmployeeList.length; i++){
            System.out.println(newEmployeeList[i]);
        }
    }
}
