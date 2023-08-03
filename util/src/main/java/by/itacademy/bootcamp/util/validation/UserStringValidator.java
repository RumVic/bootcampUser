package by.itacademy.bootcamp.util.validation;

public class UserStringValidator {

    public static boolean isValidPatronymic(String input) {
        return isValidString(input);
    }
    public static boolean isValidSurname(String input) {
        return isValidString(input);
    }
    public static boolean isValidName(String input) {

        if (input == null || input.isEmpty()) {
            return false;
        }
        if (input.length() > 20) {
            return false;
        }
        if (!input.matches("^[a-zA-Z]+$")) {
            return false;
        }
        return true;
    }
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        if (email.length() > 50) {
            return false;
        }
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailPattern);
    }

    private static boolean isValidString(String input){
        if (input == null || input.isEmpty()) {
            return false;

        }
        if (input.length() > 40) {
            return false;
        }
        if (!input.matches("^[a-zA-Z]+$")) {
            return false;
        }
        return true;
    }
}

