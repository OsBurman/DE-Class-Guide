/**
 * Exercise 03 - Variables, Literals, Constants
 * Starter Code
 * 
 * In this exercise, you'll practice:
 * - Declaring variables with appropriate types
 * - Using literals (values written directly in code)
 * - Creating constants with the final keyword
 * - Following naming conventions
 * 
 * TODO: Complete the TODOs below to practice variable declaration and naming
 */

public class VariableDeclarationDemo {
    public static void main(String[] args) {
        System.out.println("=== Variables, Literals, and Constants ===\n");

        // PART 1: Basic Variable Declaration
        System.out.println("PART 1: Variable Declaration");
        System.out.println();

        // TODO 1: Declare a variable for a student's name
        // Name it following camelCase convention
        // Assign it your name as a string literal
        String studentName = "TODO: declare variable"; // CHANGE THIS
        System.out.println("Student name: " + studentName);

        // TODO 2: Declare a variable for a student's age
        // Use the int type
        // Assign it a literal value
        int studentAge = 0; // CHANGE THIS
        System.out.println("Student age: " + studentAge);

        // TODO 3: Declare a variable for test score as a double
        // Assign it a literal like 87.5
        double testScore = 0.0; // CHANGE THIS
        System.out.println("Test score: " + testScore);

        System.out.println();

        // PART 2: Naming Conventions
        System.out.println("PART 2: Naming Conventions (camelCase)");
        System.out.println();

        // Good examples:
        String firstName = "Alice";
        String lastName = "Smith";
        int studentId = 12345;
        boolean isActive = true;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Is active: " + isActive);
        System.out.println();

        // TODO 4: Create three variables following naming convention
        // Example names: courseTitle, enrollmentDate, gpa
        // Assign them appropriate literal values
        // String courseTitle = TODO;
        // TODO more variables here

        System.out.println();

        // PART 3: Constants with final keyword
        System.out.println("PART 3: Constants (using final keyword)");
        System.out.println();

        // Constants are written in UPPER_CASE
        final double PI = 3.14159;
        final String SCHOOL_NAME = "Java Academy";
        final int PASSING_GRADE = 60;

        System.out.println("PI constant: " + PI);
        System.out.println("School name: " + SCHOOL_NAME);
        System.out.println("Passing grade: " + PASSING_GRADE);
        System.out.println();

        // TODO 5: Declare two constants
        // One for maximum students per class (30)
        // One for course duration in weeks (16)
        // Use UPPER_CASE naming
        final int MAX_STUDENTS = 0; // CHANGE THIS
        final int COURSE_DURATION_WEEKS = 0; // CHANGE THIS

        System.out.println("Max students: " + MAX_STUDENTS);
        System.out.println("Course duration: " + COURSE_DURATION_WEEKS + " weeks");
        System.out.println();

        // PART 4: Literals of Different Types
        System.out.println("PART 4: Different Types of Literals");
        System.out.println();

        // Integer literals
        int decimal = 100; // decimal
        int hexadecimal = 0xFF; // starts with 0x
        int binary = 0b1100100; // starts with 0b

        System.out.println("Decimal 100: " + decimal);
        System.out.println("Hex 0xFF: " + hexadecimal);
        System.out.println("Binary 0b1100100: " + binary);
        System.out.println();

        // Long literals (need L suffix for large numbers)
        long largeNumber = 1000000000L; // Note the L suffix
        System.out.println("Large number: " + largeNumber);
        System.out.println();

        // Float literals (need f suffix)
        float temperature = 98.6f; // Note the f suffix
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println();

        // String literals with escape sequences
        String message1 = "Hello";
        String message2 = "Hello\nWorld"; // \n is newline
        String message3 = "Path: C:\\Users\\Student"; // \\ is backslash

        System.out.println("Message 1: " + message1);
        System.out.println("Message 2: " + message2);
        System.out.println("Message 3: " + message3);
        System.out.println();

        // TODO 6: Create variables using different numeric literals
        // One with long literal
        // One with float literal
        // long bigNumber = TODO;
        // float price = TODO;

        System.out.println();
        System.out.println("=== REFLECTION QUESTIONS ===");
        System.out.println("1. Why do we use camelCase for variable names?");
        System.out.println("2. What's the difference between a variable and a constant?");
        System.out.println("3. Why do we need L suffix for long and f suffix for float?");
        System.out.println("4. When would you use final to create a constant?");
    }
}
