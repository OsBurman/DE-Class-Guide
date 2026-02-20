/**
 * Exercise 09 - StringBuilder vs StringBuffer
 * Starter Code
 */

public class StringBuildingDemo {
    public static void main(String[] args) {
        System.out.println("=== StringBuilder vs Concatenation ===\n");
        
        // TODO 1: Build string with concatenation (slow)
        String result1 = "";
        for (int i = 0; i < 10; i++) {
            result1 = result1 + "X";
        }
        System.out.println("Concatenation result: " + result1);
        
        // TODO 2: Build string with StringBuilder (fast)
        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            result2.append("X");
        }
        System.out.println("StringBuilder result: " + result2);
        
        // TODO 3: Compare performance (optional)
        System.out.println("Both produce same result, but StringBuilder is faster!");
    }
}
