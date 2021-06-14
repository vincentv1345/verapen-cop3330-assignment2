package ex34;

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
