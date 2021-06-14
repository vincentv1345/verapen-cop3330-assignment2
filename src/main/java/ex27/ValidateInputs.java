package ex27;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Verapen
 */
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
