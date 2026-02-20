/**
 * StringBuilderDemo.java
 * 
 * Demonstrates the difference between String concatenation and StringBuilder.
 * Shows why StringBuilder is critical for performance when building strings in loops.
 * 
 * Key concepts:
 * - String concatenation with + creates new objects each time
 * - StringBuilder is mutable and efficient
 * - StringBuilder.append() vs String concatenation performance
 * - When to use each approach
 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        System.out.println("=== STRING CONCATENATION vs STRINGBUILDER ===\n");
        
        // Example 1: Simple concatenation (few iterations)
        System.out.println("1. SIMPLE CONCATENATION (readable, but slow for loops)");
        long start1 = System.nanoTime();
        String result1 = "";
        for (int i = 0; i < 1000; i++) {
            result1 = result1 + "X";  // This creates a new String object each time!
        }
        long end1 = System.nanoTime();
        long time1 = end1 - start1;
        System.out.println("   Time to concatenate 1,000 times: " + time1 + " nanoseconds");
        System.out.println("   Result length: " + result1.length());
        System.out.println();
        
        // Example 2: Using StringBuilder (efficient, more complex)
        System.out.println("2. USING STRINGBUILDER (faster, efficient)");
        long start2 = System.nanoTime();
        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            result2.append("X");  // Modifies the same object
        }
        long end2 = System.nanoTime();
        long time2 = end2 - start2;
        System.out.println("   Time to append 1,000 times: " + time2 + " nanoseconds");
        System.out.println("   Result length: " + result2.length());
        System.out.println();
        
        // Performance comparison
        System.out.println("3. PERFORMANCE COMPARISON");
        System.out.println("   String concatenation time:  " + time1 + " ns");
        System.out.println("   StringBuilder time:         " + time2 + " ns");
        double ratio = (double) time1 / time2;
        System.out.println("   Ratio (concat / builder):   " + String.format("%.1f", ratio) + "x");
        if (ratio > 1) {
            System.out.println("   ✓ StringBuilder is " + String.format("%.0f", ratio) + "x FASTER!");
        }
        System.out.println();
        
        // Example 3: Building a more complex string
        System.out.println("4. BUILDING A FORMATTED STRING");
        System.out.println("   (This is a common real-world use)");
        
        // Without StringBuilder (inefficient but readable for small cases)
        System.out.println("\n   WITHOUT StringBuilder:");
        String csv1 = "Name,Age,City\n";
        csv1 = csv1 + "Alice,25,New York\n";
        csv1 = csv1 + "Bob,30,San Francisco\n";
        csv1 = csv1 + "Charlie,22,Austin\n";
        System.out.println("   Result: ");
        System.out.println("   " + csv1.replace("\n", "\n   "));
        
        // With StringBuilder (efficient)
        System.out.println("   WITH StringBuilder:");
        StringBuilder csv2 = new StringBuilder();
        csv2.append("Name,Age,City\n");
        csv2.append("Alice,25,New York\n");
        csv2.append("Bob,30,San Francisco\n");
        csv2.append("Charlie,22,Austin\n");
        System.out.println("   Result: ");
        System.out.println("   " + csv2.toString().replace("\n", "\n   "));
        System.out.println();
        
        // Example 4: StringBuilder methods
        System.out.println("5. STRINGBUILDER COMMON METHODS");
        
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("   Initial: \"" + sb + "\"");
        
        // append
        sb.append(" World");
        System.out.println("   After append(' World'): \"" + sb + "\"");
        
        // insert
        sb.insert(5, "Beautiful ");
        System.out.println("   After insert(5, 'Beautiful '): \"" + sb + "\"");
        
        // delete
        sb.delete(5, 15);  // Remove "Beautiful "
        System.out.println("   After delete(5, 15): \"" + sb + "\"");
        
        // replace
        sb.replace(0, 5, "Hi");
        System.out.println("   After replace(0, 5, 'Hi'): \"" + sb + "\"");
        
        // reverse
        sb.reverse();
        System.out.println("   After reverse(): \"" + sb + "\"");
        
        // toString - converts to String when done
        String finalString = sb.toString();
        System.out.println("   Final result as String: \"" + finalString + "\"");
        System.out.println();
        
        // Example 5: When to use each
        System.out.println("6. WHEN TO USE EACH APPROACH");
        System.out.println("   USE String concatenation (+):");
        System.out.println("   ✓ For a few concatenations (< 5)");
        System.out.println("   ✓ When readability is more important than performance");
        System.out.println("   ✓ One-time string building");
        System.out.println();
        System.out.println("   USE StringBuilder:");
        System.out.println("   ✓ In loops building strings");
        System.out.println("   ✓ When performance matters");
        System.out.println("   ✓ When building complex strings from many pieces");
        System.out.println("   ✓ When the number of iterations is large");
        System.out.println();
        
        // Example 6: Real-world scenario
        System.out.println("7. REAL-WORLD SCENARIO");
        System.out.println("   Building an HTML response with 1000 rows:");
        
        long start3 = System.nanoTime();
        String html1 = "<table>";
        for (int i = 1; i <= 100; i++) {
            html1 = html1 + "<tr><td>Row " + i + "</td></tr>";
        }
        html1 = html1 + "</table>";
        long end3 = System.nanoTime();
        
        long start4 = System.nanoTime();
        StringBuilder html2 = new StringBuilder("<table>");
        for (int i = 1; i <= 100; i++) {
            html2.append("<tr><td>Row ").append(i).append("</td></tr>");
        }
        html2.append("</table>");
        long end4 = System.nanoTime();
        
        System.out.println("   String concatenation: " + (end3 - start3) + " ns");
        System.out.println("   StringBuilder:        " + (end4 - start4) + " ns");
        System.out.println("   StringBuilder is faster for building repetitive strings!");
        System.out.println();
        
        System.out.println("=== KEY TAKEAWAY ===");
        System.out.println("StringBuilder is MUTABLE and EFFICIENT for building strings");
        System.out.println("Use it when concatenating in loops!");
    }
}
