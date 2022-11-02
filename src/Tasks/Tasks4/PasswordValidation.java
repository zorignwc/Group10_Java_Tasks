package Tasks.Tasks4;

public class PasswordValidation {
    public static void main(String[] args) {
        /*
        1. Password Must be at least have 6 characters and should not contain space
        2. Password should at least contain one upper case letter
        3. Password should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. password should at least contain a digit
        if all requirements above are met, the method returns true, otherwise returns false
         */
        String password = "Bayarmaa8!";
        boolean length = password.length()>=6;
        boolean lower = password.matches(".*[a-z].*");
        boolean upper = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[!@.,#$?].*");
        boolean valid = length && lower && upper && number && special;

        if(valid){
            System.out.println("Password is Valid");
        }else{
            System.out.println("Not a Valid Password");
        }

    }
}
