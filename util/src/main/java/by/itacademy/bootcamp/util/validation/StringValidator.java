package by.itacademy.bootcamp.util.validation;

public class StringValidator {

    public static boolean isValidString40(String input) {
        // Check if the input string is null or empty
        if (input == null || input.isEmpty()) {
            return false;
        }
        // Check if the input string has more than 40 characters
        if (input.length() > 40) {
            return false;
        }
        // Check if the input string contains only Latin letters (both uppercase and lowercase)
        if (!input.matches("^[a-zA-Z]+$")) {
            return false;
        }
        return true;
    }
    public static boolean isValidString20(String input) {
        // Check if the input string is null or empty
        if (input == null || input.isEmpty()) {
            return false;
        }
        // Check if the input string has more than 40 characters
        if (input.length() > 40) {
            return false;
        }
        // Check if the input string contains only Latin letters (both uppercase and lowercase)
        if (!input.matches("^[a-zA-Z]+$")) {
            return false;
        }
        return true;
    }
}

