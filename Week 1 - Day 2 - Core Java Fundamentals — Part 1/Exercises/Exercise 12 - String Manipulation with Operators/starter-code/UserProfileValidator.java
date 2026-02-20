/**
 * Exercise 12 - String Manipulation with Operators
 * Starter Code
 * 
 * Validate and process user information combining strings and operators.
 */

public class UserProfileValidator {
    public static void main(String[] args) {
        System.out.println("=== User Profile Validator ===\n");

        // TODO 1: Define test data
        String email1 = "john.doe@example.com";
        String password1 = "MyPassword123";

        String email2 = "invalid.email@";
        String password2 = "weak";

        // TODO 2: Validate email for user 1
        System.out.println("User 1: " + email1);
        boolean hasAt = email1.contains("@");
        boolean hasDot = email1.contains(".");
        boolean validEmail1 = hasAt && hasDot;
        System.out.println("Valid email: " + validEmail1);

        // TODO 3: Extract parts from email
        int atIndex = email1.indexOf("@");
        String username1 = email1.substring(0, atIndex);
        String domain1 = email1.substring(atIndex + 1);
        System.out.println("Username: " + username1);
        System.out.println("Domain: " + domain1);
        System.out.println();

        // TODO 4: Validate password strength
        System.out.println("Password: " + password1);
        int passLength = password1.length();
        boolean lengthOk = passLength >= 8;
        // TODO: Check for uppercase and number (use string methods)
        System.out.println("Length >= 8: " + lengthOk);
        // TODO: Check for uppercase
        // TODO: Check for at least one digit
        // TODO: Combine checks with logical operators
        System.out.println();

        // TODO 5: Do same for user 2
        System.out.println("User 2: " + email2);
        // TODO: Validate email
        // TODO: Validate password
        // TODO: Extract and display parts if valid
    }
}
