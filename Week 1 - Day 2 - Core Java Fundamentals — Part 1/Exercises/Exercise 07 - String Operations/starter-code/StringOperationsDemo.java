/**
 * Exercise 08 - String Operations
 * Starter Code
 */

public class StringOperationsDemo {
    public static void main(String[] args) {
        System.out.println("=== String Operations ===\n");
        
        // TODO: Practice advanced string operations
        String sentence = "Java is awesome";
        
        // TODO 1: Find substring position
        System.out.println("Index of 'awesome': " + sentence.indexOf("awesome"));
        
        // TODO 2: Extract substring
        System.out.println("First word: " + sentence.substring(0, 4));
        
        // TODO 3: Replace content
        System.out.println("Replaced: " + sentence.replace("awesome", "great"));
        
        // TODO 4: Split string
        String[] words = sentence.split(" ");
        System.out.println("Word count: " + words.length);
    }
}
