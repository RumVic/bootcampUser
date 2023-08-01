package by.itacademy.bootcamp.util.validation;

public class StringValidator {

    public static boolean isValidString40(String input) {
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
    public static boolean isValidString20(String input) {

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

