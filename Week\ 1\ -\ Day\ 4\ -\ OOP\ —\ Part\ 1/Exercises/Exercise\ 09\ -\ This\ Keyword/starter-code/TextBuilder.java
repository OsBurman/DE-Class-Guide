/**
 * Exercise 09: This Keyword
 * 
 * TODO: Create TextBuilder class demonstrating 'this' for chaining
 */
public class TextBuilder {
    
    // TODO: Declare a String field named 'text' initialized to ""
    
    
    // TODO: Create default constructor
    
    
    // TODO: Create append(String text) method
    // This demonstrates parameter shadowing!
    // Use this.text to refer to the field
    // Use text to refer to the parameter
    // Append parameter to field: this.text += text;
    // Return this for chaining
    
    
    // TODO: Create appendLine(String line) method
    // Appends line with newline: this.text += line + "\n";
    // Return this for chaining
    
    
    // TODO: Create clear() method
    // Sets text to ""
    // Return this for chaining
    
    
    // TODO: Create build() method
    // Returns the accumulated text
    
    
    // TODO: Create length() method
    // Returns length of text
    
    
    // TODO: Create isEmpty() method
    // Returns true if text is empty
    
    
    public static void main(String[] args) {
        // TODO: Create TextBuilder
        System.out.println("--- Building with Method Chaining ---");
        TextBuilder builder = new TextBuilder();
        System.out.println("Length: " + builder.length());
        System.out.println();
        
        // TODO: Build message using method chaining
        System.out.println("Building message...");
        builder.append("Hello, ").append("World! ").append("Welcome to ").append("Java!");
        System.out.println("Result: \"" + builder.build() + "\"");
        System.out.println("Length: " + builder.length());
        System.out.println("Is Empty? " + builder.isEmpty());
        System.out.println();
        
        // TODO: Clear and build different message
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
