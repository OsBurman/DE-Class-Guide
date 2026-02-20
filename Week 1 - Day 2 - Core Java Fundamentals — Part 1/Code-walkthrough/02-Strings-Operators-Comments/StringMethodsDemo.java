/**
 * StringMethodsDemo.java
 * 
 * Demonstrates essential String methods that students will use constantly.
 * Shows how strings are immutable and how to use common methods for
 * string manipulation.
 * 
 * Key concepts:
 * - String immutability (operations return new strings)
 * - Essential methods: length, charAt, substring, indexOf, contains, etc.
 * - Proper string comparison with .equals()
 * - Case conversion methods
 */

public class StringMethodsDemo {
    public static void main(String[] args) {
        System.out.println("=== STRING METHODS DEMONSTRATION ===\n");
        
        // Create a sample string
        String message = "Hello World";
        System.out.println("Original string: \"" + message + "\"");
        System.out.println();
        
        // 1. LENGTH - get the number of characters
        System.out.println("1. STRING LENGTH");
        System.out.println("   message.length() = " + message.length());
        System.out.println("   (Includes the space!)");
        System.out.println();
        
        // 2. CHARAT - get character at specific index
        System.out.println("2. GET CHARACTER AT INDEX (charAt)");
        System.out.println("   message.charAt(0) = '" + message.charAt(0) + "'");  // H
        System.out.println("   message.charAt(1) = '" + message.charAt(1) + "'");  // e
        System.out.println("   message.charAt(6) = '" + message.charAt(6) + "'");  // W (index 6)
        System.out.println();
        
        // 3. TOSTRING - not needed for strings, but shown for comparison
        System.out.println("3. CASE CONVERSION");
        System.out.println("   message.toUpperCase() = \"" + message.toUpperCase() + "\"");
        System.out.println("   message.toLowerCase() = \"" + message.toLowerCase() + "\"");
        System.out.println("   Original unchanged: \"" + message + "\"");
        System.out.println("   (This demonstrates IMMUTABILITY - original never changes)");
        System.out.println();
        
        // 4. SUBSTRING - extract a portion of the string
        System.out.println("4. EXTRACT SUBSTRING");
        System.out.println("   message.substring(0, 5) = \"" + message.substring(0, 5) + "\"");
        System.out.println("   (Start at index 0, go up to but NOT including index 5)");
        System.out.println("   message.substring(6) = \"" + message.substring(6) + "\"");
        System.out.println("   (Start at index 6, go to the end)");
        System.out.println();
        
        // 5. INDEXOF - find position of character or substring
        System.out.println("5. FIND POSITION (indexOf)");
        System.out.println("   message.indexOf('o') = " + message.indexOf('o'));
        System.out.println("   (First 'o' is at index 4)");
        System.out.println("   message.indexOf('World') = " + message.indexOf("World"));
        System.out.println("   (Substring 'World' starts at index 6)");
        System.out.println("   message.indexOf('x') = " + message.indexOf('x'));
        System.out.println("   (Returns -1 if not found)");
        System.out.println();
        
        // 6. CONTAINS - check if substring exists
        System.out.println("6. CHECK IF CONTAINS SUBSTRING");
        System.out.println("   message.contains(\"World\") = " + message.contains("World"));
        System.out.println("   message.contains(\"Java\") = " + message.contains("Java"));
        System.out.println();
        
        // 7. TRIM - remove leading and trailing whitespace
        System.out.println("7. REMOVE WHITESPACE (trim)");
        String spaces = "   Hello   ";
        System.out.println("   Original: \"" + spaces + "\" (length: " + spaces.length() + ")");
        System.out.println("   Trimmed:  \"" + spaces.trim() + "\" (length: " + spaces.trim().length() + ")");
        System.out.println();
        
        // 8. REPLACE - create new string with replacements
        System.out.println("8. REPLACE CHARACTERS");
        String original = "Hello World";
        System.out.println("   Original: \"" + original + "\"");
        System.out.println("   message.replace('o', '0') = \"" + original.replace('o', '0') + "\"");
        System.out.println("   message.replace(\"World\", \"Java\") = \"" + original.replace("World", "Java") + "\"");
        System.out.println();
        
        // 9. SPLIT - break string into array
        System.out.println("9. SPLIT INTO ARRAY");
        String sentence = "Java is fun and powerful";
        String[] words = sentence.split(" ");
        System.out.println("   Original: \"" + sentence + "\"");
        System.out.println("   Split by space:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("      words[" + i + "] = \"" + words[i] + "\"");
        }
        System.out.println();
        
        // 10. EQUALS - proper string comparison
        System.out.println("10. STRING COMPARISON (use .equals(), NOT ==)");
        String name1 = "Alex";
        String name2 = "Alex";
        String name3 = new String("Alex");  // Different object, same content
        System.out.println("   name1 = \"" + name1 + "\"");
        System.out.println("   name2 = \"" + name2 + "\"");
        System.out.println("   name3 = \"" + name3 + "\" (created with new String)");
        System.out.println("   name1 == name2: " + (name1 == name2) + " (checks memory reference)");
        System.out.println("   name1.equals(name2): " + name1.equals(name2) + " (checks content)");
        System.out.println("   name1.equals(name3): " + name1.equals(name3) + " (content same, so true)");
        System.out.println("   IMPORTANT: Always use .equals() for string content comparison!");
        System.out.println();
        
        // 11. EQUALSIGNORECASE - case-insensitive comparison
        System.out.println("11. CASE-INSENSITIVE COMPARISON");
        System.out.println("   \"hello\".equals(\"HELLO\") = " + "hello".equals("HELLO"));
        System.out.println("   \"hello\".equalsIgnoreCase(\"HELLO\") = " + "hello".equalsIgnoreCase("HELLO"));
        System.out.println();
        
        // 12. STARTSWITH / ENDSWITH - check string prefix/suffix
        System.out.println("12. CHECK PREFIX AND SUFFIX");
        String url = "https://www.example.com";
        System.out.println("   URL: \"" + url + "\"");
        System.out.println("   startsWith(\"https\"): " + url.startsWith("https"));
        System.out.println("   endsWith(\".com\"): " + url.endsWith(".com"));
        System.out.println();
        
        System.out.println("=== KEY TAKEAWAY ===");
        System.out.println("Strings are IMMUTABLE - every operation returns a NEW string");
        System.out.println("The original string never changes!");
    }
}
