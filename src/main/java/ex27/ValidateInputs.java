package ex27;

public class ValidateInputs {
    public static void main(String []args){
        Print f = new Print();
        String firstName = f.getFirstName();
        String lastName = f.getLastName();
        String zipCode = f.getZip();
        String id = f.getEmployeeID();
        f.validateInput(firstName, lastName, zipCode, id);
    }

}
