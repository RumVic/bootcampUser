package by.itacademy.bootcamp.util.validation;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        // Check if the email is null or empty
        if (email == null || email.isEmpty()) {
            return false;
        }

        // Check if the email length is no more than 50 characters
        if (email.length() > 50) {
            return false;
        }

        // Check if the email matches the email pattern using a regular expression
        // This is a simple pattern to match most email addresses, but it's not perfect
        // For more advanced email validation, consider using a more robust regex pattern
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailPattern);
    }
}

