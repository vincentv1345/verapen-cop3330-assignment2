package ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class employeeListRemoval {
    public static void main(String []args){
        removeEmployee n = new removeEmployee();
        String []employees = n.getEmployees();
        n.displayEmployees(employees);
        String employee = n.getEmployee();
        String []newEmployees = n.employee(employees, employee);
        n.printNewEmployeeList(newEmployees);
    }
}
