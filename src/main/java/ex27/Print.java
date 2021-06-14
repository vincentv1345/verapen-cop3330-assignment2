package ex27;

public class Print extends checkEmployeeInfo {
    public void validateInput(String firstName, String lastName, String zipCode, String employeeID) {
        checkEmployeeInfo n = new checkEmployeeInfo();
        if (n.checkFirstName(firstName) == true) {
            if (n.checkLastName(lastName) == true) {
                if(n.checkZipCode(zipCode) == true){
                    if(n.checkID(employeeID) == true){
                        System.out.println("There are no errors");
                    }
                    else{
                        System.out.println("The employee ID must be in the format of AA-1234.");

                    }
                }
                else{
                    System.out.println("The zipcode must be a 5 digit number.");
                }

            }
            else{
                System.out.println("The last name must be at least 2 characters long.");
            }
        }
        else {
            System.out.println("The first name must be at least 2 characters long.");
        }
    }
}
