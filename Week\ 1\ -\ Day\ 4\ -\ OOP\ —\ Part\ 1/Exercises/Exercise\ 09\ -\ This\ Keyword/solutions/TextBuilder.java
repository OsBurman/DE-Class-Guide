/**
 * Exercise 09: This Keyword - SOLUTION
 * 
 * This solution demonstrates:
 * - Using 'this' to disambiguate shadowed names
 * - Returning 'this' for method chaining
 * - Building fluent APIs with chaining
 */
public class TextBuilder {
    
    String text = "";
    
    // Default constructor
    public TextBuilder() {
    }
    
    // Append text - demonstrates 'this' for parameter shadowing
    TextBuilder append(String text) {
        // this.text refers to the field
        // text refers to the parameter
        this.text += text;
        return this;  // Return the object for chaining
    }
    
    // Append text with newline
    TextBuilder appendLine(String line) {
        this.text += line + "\n";
        return this;
    }
    
    // Clear the text
    TextBuilder clear() {
        this.text = "";
        return this;
    }
    
    // Get the built text
    String build() {
        return text;
    }
    
    // Get text length
    int length() {
        return text.length();
    }
    
    // Check if empty
    boolean isEmpty() {
        return text.isEmpty();
    }
    
    public static void main(String[] args) {
        // Create TextBuilder
        System.out.println("--- Building with Method Chaining ---");
        TextBuilder builder = new TextBuilder();
        System.out.println("Length: " + builder.length());
        System.out.println();
        
        // Build message using chaining
        System.out.println("Building message...");
        builder.append("Hello, ").append("World! ").append("Welcome to ").append("Java!");
        System.out.println("Result: \"" + builder.build() + "\"");
        System.out.println("Length: " + builder.length());
        System.out.println("Is Empty? " + builder.isEmpty());
        System.out.println();
        
        // Clear and build different message
        System.out.println("Clearing...");
        builder.clear();
        System.out.println("Is Empty? " + builder.isEmpty());
        System.out.println();
        
        System.out.println("Building different message...");
        builder.appendLine("Java is awesome!")
               .appendLine("Goodbye!");
        System.out.println("Result: \"" + builder.build() + "\"");
        System.out.println("Length: " + builder.length());
        System.out.println();
        
        System.out.println("Final length: " + builder.length());
    }
}
