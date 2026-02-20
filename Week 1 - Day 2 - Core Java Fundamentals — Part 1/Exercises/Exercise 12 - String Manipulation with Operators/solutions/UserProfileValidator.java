/**
 * Exercise 12 - String Manipulation with Operators
 * Solution
 */

public class UserProfileValidator {
    public static void main(String[] args) {
        System.out.println("=== User Profile Validator ===\n");
        
        // Define test data for two users
        String email1 = "john.doe@example.com";
        String password1 = "MyPassword123";
        
        String email2 = "invalid.email@";
        String password2 = "weak";
        
        String email3 = "alice.smith@domain.co.uk";
        String password3 = "SecurePass999";
        
        // Process each user
        validateUser(email1, password1);
        validateUser(email2, password2);
        validateUser(email3, password3);
    }
    
    // Helper method to validate and display user info
    static void validateUser(String email, String password) {
        System.out.println("=== Processing User ===");
        System.out.println("Email: " + email);
        
        // Validate email format
        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");
        int atIndex = email.indexOf("@");
        
        // Email is valid if it has @ and . AND @ comes before .
        boolean validEmail = hasAt && hasDot && atIndex > 0 && atIndex < email.length() - 1;
        
        System.out.println("Email valid: " + validEmail);
        
        if (validEmail) {
            // Extract username and domain
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex + 1);
            System.out.println("  Username: " + username);
            System.out.println("  Domain: " + domain);
        } else {
            System.out.println("  (Invalid email - cannot extract parts)");
        }
        
        System.out.println();
        System.out.println("Password: " + password);
        
        // Validate password strength
        int length = password.length();
        boolean lengthOk = length >= 8;
        
        // Check for at least one uppercase letter
        boolean hasUppercase = !password.equals(password.toLowerCase());
        
        // Check for at least one digit
        boolean hasDigit = password.matches(".*[0-9].*");
        
        // Strong password: length >= 8 AND (uppercase OR digit)
        boolean strongPassword = lengthOk && (hasUppercase || hasDigit);
        
        System.out.println("  Length >= 8: " + lengthOk);
        System.out.println("  Has uppercase: " + hasUppercase);
        System.out.println("  Has digit: " + hasDigit);
        System.out.println("  Password strong: " + strongPassword);
        
        if (!strongPassword && lengthOk) {
            System.out.println("  (Weak: needs uppercase or number)");
        } else if (!lengthOk) {
            System.out.println("  (Weak: too short, minimum 8 characters)");
        }
        
        System.out.println();
        
        // Display formatted profile if both valid
        if (validEmail && strongPassword) {
            displayProfile(email, password);
        } else {
            System.out.println("  ✗ Profile incomplete - email or password invalid");
        }
        
        System.out.println("---\n");
    }
    
    // Helper method to display formatted profile
    static void displayProfile(String email, String password) {
        int atIndex = email.indexOf("@");
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);
        
        System.out.println("  ✓ Profile Created:");
        System.out.println("    User: " + username);
        System.out.println("    Domain: " + domain);
        System.out.println("    Email: " + email);
        
        // Create a masked password display
        String masked = "";
        for (int i = 0; i < password.length(); i++) {
            masked += "*";
        }
        System.out.println("    Password: " + masked + " (length: " + password.length() + ")");
    }
}
