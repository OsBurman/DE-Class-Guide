/**
 * Exercise 08 - String Operations
 * Solution
 */

public class StringOperationsDemo {
    public static void main(String[] args) {
        System.out.println("=== String Operations ===\n");
        
        String sentence = "Java is awesome";
        
        // Find substring position
        System.out.println("Index of 'awesome': " + sentence.indexOf("awesome"));
        
        // Extract substring
        System.out.println("First word: " + sentence.substring(0, 4));
        
        // Replace content
        System.out.println("Replaced: " + sentence.replace("awesome", "great"));
        
        // Split string
        String[] words = sentence.split(" ");
        System.out.println("Word count: " + words.length);
        for (String word : words) {
            System.out.println("  - " + word);
        }
    }
}
