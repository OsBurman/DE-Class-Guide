/**
 * CommentsDemo.java
 * 
 * Demonstrates proper commenting practices in Java:
 * - Single-line comments (//)
 * - Multi-line comments (/* */)
 * - JavaDoc comments (/** */)
 * - When and how to use each
 * 
 * Key concepts:
 * - Comments explain WHY, not WHAT
 * - Different comment types for different purposes
 * - Professional documentation standards
 */

public class CommentsDemo {
    
    // Single-line comment at the top of a method - brief explanation
    public static void demonstrateSingleLineComments() {
        // Use single-line comments for brief explanations
        System.out.println("=== SINGLE-LINE COMMENTS ===");
        
        int age = 25;  // Store the user's age
        
        // Check if user is an adult
        if (age >= 18) {
            System.out.println("User is an adult");
        }
        
        System.out.println();
    }
    
    /*
     * Multi-line comment at the top of a method
     * Use this format for longer explanations
     * Useful for explaining complex logic
     */
    public static void demonstrateMultiLineComments() {
        System.out.println("=== MULTI-LINE COMMENTS ===");
        
        /*
         * This multi-line comment explains a calculation
         * We're computing the average of three numbers
         * Each number is entered by the user
         */
        int num1 = 85;
        int num2 = 90;
        int num3 = 88;
        
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
        
        System.out.println();
    }
    
    /**
     * JavaDoc comment - the professional standard
     * Use this for public methods and classes
     * 
     * This method calculates the sum of two numbers.
     * It demonstrates proper JavaDoc formatting.
     * 
     * @param firstNumber the first number to add
     * @param secondNumber the second number to add
     * @return the sum of the two numbers
     */
    public static int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    
    /**
     * Checks if a number is positive.
     * 
     * @param number the number to check
     * @return true if positive, false otherwise
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }
    
    public static void main(String[] args) {
        System.out.println("=== COMMENTS IN JAVA - TYPES AND BEST PRACTICES ===\n");
        
        // 1. SINGLE-LINE COMMENTS
        demonstrateSingleLineComments();
        
        // 2. MULTI-LINE COMMENTS
        demonstrateMultiLineComments();
        
        // 3. JAVADOC COMMENTS
        System.out.println("=== JAVADOC COMMENTS ===");
        System.out.println("JavaDoc comments start with /** and end with */");
        System.out.println("They're used for public methods and classes");
        System.out.println("They generate professional API documentation");
        System.out.println();
        
        System.out.println("Sum of 10 and 20: " + addNumbers(10, 20));
        System.out.println("Is 5 positive? " + isPositive(5));
        System.out.println();
        
        // 4. GOOD COMMENT PRACTICES
        System.out.println("=== GOOD COMMENTING PRACTICES ===");
        System.out.println();
        
        // GOOD: Explains WHY
        System.out.println("GOOD - Explains WHY:");
        System.out.println("// We use a LinkedList here because we need fast insertion");
        System.out.println();
        
        // BAD: Explains WHAT (code already does this)
        System.out.println("BAD - Just states WHAT:");
        System.out.println("age = age + 1;  // increment age");
        System.out.println("(Code already shows this!)");
        System.out.println();
        
        // GOOD: Documents algorithm complexity
        System.out.println("GOOD - Documents complex logic:");
        System.out.println("// Using binary search for O(log n) performance");
        System.out.println("// instead of linear search O(n)");
        System.out.println();
        
        // GOOD: Warns about gotchas
        System.out.println("GOOD - Highlights important gotchas:");
        System.out.println("// IMPORTANT: String comparison uses .equals(), not ==");
        System.out.println();
        
        // 5. JAVADOC FORMAT EXPLANATION
        System.out.println("=== JAVADOC FORMAT ===");
        System.out.println("/** (with two asterisks to start)");
        System.out.println(" * Description of method");
        System.out.println(" * @param paramName description");
        System.out.println(" * @return description of return value");
        System.out.println(" * @throws ExceptionType when it's thrown");
        System.out.println(" */");
        System.out.println();
        
        // 6. COMMENT ANTI-PATTERNS
        System.out.println("=== ANTI-PATTERNS - WHAT NOT TO DO ===");
        System.out.println();
        
        System.out.println("DON'T: Over-comment obvious code");
        System.out.println("// BAD");
        System.out.println("int x = 5;  // Set x to 5");
        System.out.println();
        
        System.out.println("DON'T: Let comments get out of sync");
        System.out.println("// BAD - misleading comment");
        System.out.println("// This adds two numbers");
        System.out.println("int result = firstNumber * secondNumber;  // actually multiplies!");
        System.out.println();
        
        System.out.println("DON'T: Use comments to explain bad code");
        System.out.println("// BAD");
        System.out.println("// This confusing logic is because of legacy reasons");
        System.out.println("// but I don't understand it anymore");
        System.out.println("(Instead: refactor to make it clear)");
        System.out.println();
        
        System.out.println("DON'T: Nest multi-line comments");
        System.out.println("/* outer /* inner */ outer */ ← This breaks!");
        System.out.println();
        
        // 7. REAL EXAMPLE
        System.out.println("=== REAL EXAMPLE: GOOD COMMENTING ===");
        System.out.println();
        
        demonstrateGoodCommenting();
        
        System.out.println("\n=== KEY TAKEAWAYS ===");
        System.out.println("1. Use // for single-line comments (quick notes)");
        System.out.println("2. Use /* */ for multi-line comments (longer explanations)");
        System.out.println("3. Use /** */ for JavaDoc (professional documentation)");
        System.out.println("4. Comments should explain WHY, not WHAT");
        System.out.println("5. Good code is self-documenting - don't over-comment");
        System.out.println("6. Keep comments in sync with code");
        System.out.println("7. Use JavaDoc for public methods and classes");
    }
    
    /**
     * Calculates the average of test scores using a specific formula.
     * 
     * Note: We weight recent scores more heavily (40%, 30%, 30%)
     * to account for student improvement over time.
     * 
     * @param recentScore the most recent test score (weighted 40%)
     * @param midScore the middle test score (weighted 30%)
     * @param oldScore the oldest test score (weighted 30%)
     * @return the weighted average score
     */
    public static double calculateWeightedAverage(double recentScore, double midScore, double oldScore) {
        // Weights: recent (0.4), middle (0.3), old (0.3)
        // This formula emphasizes recent performance
        double weighted = (recentScore * 0.4) + (midScore * 0.3) + (oldScore * 0.3);
        
        // Round to one decimal place for readability
        return Math.round(weighted * 10.0) / 10.0;
    }
    
    public static void demonstrateGoodCommenting() {
        System.out.println("Example with good comments:");
        System.out.println();
        
        // Scores from different test sessions
        double score1 = 85.0;  // Most recent
        double score2 = 80.0;  // One month ago
        double score3 = 75.0;  // Two months ago
        
        // Calculate using weighted average (emphasizes recent performance)
        double finalScore = calculateWeightedAverage(score1, score2, score3);
        
        System.out.println("Test scores: " + score1 + ", " + score2 + ", " + score3);
        System.out.println("Weighted average: " + finalScore);
        System.out.println();
        System.out.println("(Notice comments explain CHOICES, not obvious operations)");
    }
}
