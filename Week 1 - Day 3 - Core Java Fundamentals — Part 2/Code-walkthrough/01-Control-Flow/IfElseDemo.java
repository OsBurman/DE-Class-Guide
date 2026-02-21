public class IfElseDemo {

    // Example 1: Simple if statement
    public static void checkPassFail(int score) {
        if (score >= 60) {
            System.out.println("You passed!");
        }
    }

    // Example 2: if-else statement
    public static void checkPassFailDetailed(int score) {
        if (score >= 60) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }
    }

    // Example 3: if-else if-else statement (multiple conditions)
    public static void getGrade(int score) {
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    // Example 4: Nested if statements
    public static void validateLogin(String username, String password, boolean isAdmin) {
        if (username != null && !username.isEmpty()) {
            if (password != null && password.length() >= 8) {
                if (isAdmin) {
                    System.out.println("Admin login successful");
                } else {
                    System.out.println("User login successful");
                }
            } else {
                System.out.println("Password too short");
            }
        } else {
            System.out.println("Username required");
        }
    }

    // Example 5: Using logical operators in conditions
    public static void checkTicketPrice(int age, boolean isStudent) {
        if (age < 3) {
            System.out.println("Free admission");
        } else if ((age >= 3 && age <= 12) || isStudent) {
            System.out.println("Child/Student ticket: $8");
        } else if (age >= 65) {
            System.out.println("Senior ticket: $10");
        } else {
            System.out.println("Adult ticket: $15");
        }
    }

    // Example 6: Ternary operator (alternative to simple if-else)
    public static void ternaryExample(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + result);
    }

    // Example 7: Common mistake - unnecessary if
    public static boolean isEligible(int age) {
        // DON'T: if (age >= 18) { return true; } else { return false; }
        // DO: return age >= 18;
        return age >= 18;
    }

    public static void main(String[] args) {
        System.out.println("=== If-Else Examples ===\n");

        // Example 1
        System.out.println("Example 1: Simple if");
        checkPassFail(65);
        checkPassFail(45);
        System.out.println();

        // Example 2
        System.out.println("Example 2: if-else");
        checkPassFailDetailed(65);
        checkPassFailDetailed(45);
        System.out.println();

        // Example 3
        System.out.println("Example 3: if-else if-else");
        getGrade(95);
        getGrade(75);
        getGrade(55);
        System.out.println();

        // Example 4
        System.out.println("Example 4: Nested if");
        validateLogin("alice", "password123", true);
        validateLogin("bob", "pass", false);
        System.out.println();

        // Example 5
        System.out.println("Example 5: Logical operators");
        checkTicketPrice(5, false);
        checkTicketPrice(20, true);
        checkTicketPrice(70, false);
        System.out.println();

        // Example 6
        System.out.println("Example 6: Ternary operator");
        ternaryExample(7);
        ternaryExample(8);
        System.out.println();

        // Example 7
        System.out.println("Example 7: Boolean return");
        System.out.println("Age 25 eligible? " + isEligible(25));
        System.out.println("Age 16 eligible? " + isEligible(16));
    }
}
