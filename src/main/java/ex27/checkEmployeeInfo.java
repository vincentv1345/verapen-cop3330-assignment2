package ex27;

public class checkEmployeeInfo extends getEmployeeInfo{
    public boolean checkFirstName(String firstName){
        if(firstName.length()<2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean checkLastName(String lastName){
        if(lastName.length()<2){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean checkZipCodeNum(String zipCode){
        for(int i = 0; i < zipCode.length(); i++){
            if(Character.isDigit(zipCode.charAt(i))==false){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
    public boolean checkID(String employeeID){
        for(int i = 0; i < 2; i++){
            if(!Character.isLetter(employeeID.charAt(i)))
            {
                return false;
            }
        }
        for(int i = 2; i <3; i++){
            char a = employeeID.charAt(2);
            if(a != '-'){
                return false;
            }
        }
        for(int i = 4; i <7; i++){
            if(!Character.isDigit(employeeID.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean checkZipCode(String zipCode){
        for(int i = 0; i < zipCode.length(); i++){
            if(zipCode.length() != 5 || checkZipCodeNum(zipCode) == false)
            {
                return false;
            }
        }
        return true;
    }
}
