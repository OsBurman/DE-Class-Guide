/**
 * Exercise 09 - StringBuilder vs StringBuffer
 * Solution
 */

public class StringBuildingDemo {
    public static void main(String[] args) {
        System.out.println("=== StringBuilder vs Concatenation ===\n");
        
        // Method 1: Concatenation (creates many string objects)
        long start1 = System.nanoTime();
        String result1 = "";
        for (int i = 0; i < 1000; i++) {
            result1 = result1 + "X";
        }
        long end1 = System.nanoTime();
        System.out.println("Concatenation time: " + (end1 - start1) + " ns");
        System.out.println("Result length: " + result1.length());
        
        // Method 2: StringBuilder (efficient)
        long start2 = System.nanoTime();
        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            result2.append("X");
        }
        long end2 = System.nanoTime();
        System.out.println("\nStringBuilder time: " + (end2 - start2) + " ns");
        System.out.println("Result length: " + result2.length());
        
        System.out.println("\nStringBuilder is much faster for loops!");
    }
}
