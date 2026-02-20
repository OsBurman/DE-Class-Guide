/**
 * Exercise 03 - Variables, Literals, Constants
 * Solution
 * 
 * This solution shows proper variable declaration, naming conventions,
 * and use of constants.
 */

public class VariableDeclarationDemo {
    public static void main(String[] args) {
        System.out.println("=== Variables, Literals, and Constants ===\n");

        // PART 1: Basic Variable Declaration
        System.out.println("PART 1: Variable Declaration");
        System.out.println();

        // Declare a variable for a student's name using camelCase
        String studentName = "Sarah Johnson";
        System.out.println("Student name: " + studentName);

        // Declare a variable for a student's age
        int studentAge = 22;
        System.out.println("Student age: " + studentAge);

        // Declare a variable for test score as a double
        double testScore = 87.5;
        System.out.println("Test score: " + testScore);

        System.out.println();

        // PART 2: Naming Conventions
        System.out.println("PART 2: Naming Conventions (camelCase)");
        System.out.println();

        // Good examples - all follow camelCase
        String firstName = "Alice";
        String lastName = "Smith";
        int studentId = 12345;
        boolean isActive = true;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Is active: " + isActive);
        System.out.println();

        // Create three variables following naming convention
        String courseTitle = "Core Java Fundamentals";
        String enrollmentDate = "January 15, 2025";
        double gpa = 3.85;

        System.out.println("Course: " + courseTitle);
        System.out.println("Enrollment: " + enrollmentDate);
        System.out.println("GPA: " + gpa);
        System.out.println();

        // PART 3: Constants with final keyword
        System.out.println("PART 3: Constants (using final keyword)");
        System.out.println();

        // Constants are written in UPPER_CASE
        // They cannot be changed once assigned
        final double PI = 3.14159;
        final String SCHOOL_NAME = "Java Academy";
        final int PASSING_GRADE = 60;

        System.out.println("PI constant: " + PI);
        System.out.println("School name: " + SCHOOL_NAME);
        System.out.println("Passing grade: " + PASSING_GRADE);
        System.out.println();

        // Declare constants for common values
        final int MAX_STUDENTS = 30;
        final int COURSE_DURATION_WEEKS = 16;

        System.out.println("Max students per class: " + MAX_STUDENTS);
        System.out.println("Course duration: " + COURSE_DURATION_WEEKS + " weeks");
        System.out.println();

        // PART 4: Literals of Different Types
        System.out.println("PART 4: Different Types of Literals");
        System.out.println();

        // Integer literals - different number bases
        int decimal = 100; // Base 10 (decimal)
        int hexadecimal = 0xFF; // Base 16 (0x prefix), FF in hex = 255
        int binary = 0b1100100; // Base 2 (0b prefix), 1100100 in binary = 100

        System.out.println("Decimal 100: " + decimal);
        System.out.println("Hex 0xFF: " + hexadecimal);
        System.out.println("Binary 0b1100100: " + binary);
        System.out.println("(All three represent different numbers!)");
        System.out.println();

        // Long literals (need L suffix for values > Integer.MAX_VALUE)
        long largeNumber = 1000000000L; // L suffix required
        System.out.println("Large number (long): " + largeNumber);
        System.out.println();

        // Float literals (need f suffix)
        float temperature = 98.6f; // f suffix required for float
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println();

        // String literals with escape sequences
        String message1 = "Hello";
        String message2 = "Hello\nWorld"; // \n creates new line
        String message3 = "Path: C:\\Users\\Student"; // \\ represents single backslash

        System.out.println("Message 1: " + message1);
        System.out.println("Message 2:");
        System.out.println(message2);
        System.out.println("Message 3: " + message3);
        System.out.println();

        // Create variables using different numeric literals
        long populationOfUSA = 330000000L;
        float gasPrice = 3.49f;

        System.out.println("USA Population: " + populationOfUSA);
        System.out.println("Gas price: $" + gasPrice);
        System.out.println();

        // BONUS: Common escape sequences
        System.out.println("BONUS: Common Escape Sequences");
        System.out.println("Tab:\tThis is indented");
        System.out.println("Newline:\nThis is on next line");
        System.out.println("Quote: \"Hello\"");
        System.out.println("Backslash: C:\\Program Files");
        System.out.println();

        System.out.println("=== REFLECTION QUESTIONS ===");
        System.out.println("1. Why do we use camelCase for variable names?");
        System.out.println("   Answer: It's the Java convention and makes code readable.");
        System.out.println("   Variable names start lowercase, then capitalize each word.");
        System.out.println();
        System.out.println("2. What's the difference between a variable and a constant?");
        System.out.println("   Answer: Variables can change value. Constants (final) cannot.");
        System.out.println("   Use constants for values that should never change.");
        System.out.println();
        System.out.println("3. Why do we need L suffix for long and f suffix for float?");
        System.out.println("   Answer: Java defaults to int for whole numbers and double");
        System.out.println("   for decimals. L and f tell Java to use long and float instead.");
        System.out.println();
        System.out.println("4. When would you use final to create a constant?");
        System.out.println("   Answer: For values that are fixed and shouldn't change:");
        System.out.println("   - Mathematical constants (PI)");
        System.out.println("   - Configuration values (MAX_STUDENTS)");
        System.out.println("   - Application constants (SCHOOL_NAME)");
    }
}
