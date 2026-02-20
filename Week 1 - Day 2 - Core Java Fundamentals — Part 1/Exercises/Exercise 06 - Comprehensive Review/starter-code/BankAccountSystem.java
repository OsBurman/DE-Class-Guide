/**
 * Exercise 06: Comprehensive Review - Bank Account System
 * Starter Code
 * 
 * Build a complete program that simulates a simple bank account system.
 * This exercise combines all concepts from Exercises 01-05:
 * - Primitive types
 * - Variables and naming
 * - Constants
 * - Type conversions
 * - Autoboxing/Unboxing
 */

public class BankAccountSystem {
    public static void main(String[] args) {
        System.out.println("===== Bank Account System =====\n");
        
        // TODO 1: Declare variables for account information
        // - Account owner (String)
        // - Account number (int or long)
        // - Current balance (double)
        // - Account active status (boolean)
        
        // TODO 2: Create constants for bank policies
        // - MAX_WITHDRAWAL (double, e.g., 500.0)
        // - MIN_BALANCE (double, e.g., 100.0)
        // - ANNUAL_INTEREST_RATE (double, e.g., 0.025 for 2.5%)
        
        // TODO 3: Calculate annual interest
        // Interest = Balance * Rate
        // Remember: might need type conversion
        double annualInterest = 0;  // CHANGE THIS
        
        // TODO 4: Display account summary (use System.out.println)
        System.out.println("Account Owner: TODO");
        System.out.println("Account Number: TODO");
        System.out.println("Current Balance: $TODO");
        System.out.println();
        
        System.out.println("Bank Policies:");
        System.out.println("  Maximum Withdrawal: $TODO");
        System.out.println("  Minimum Balance: $TODO");
        System.out.println("  Annual Interest Rate: TODO%");
        System.out.println();
        
        System.out.println("Calculated Interest (Annual): $TODO");
        System.out.println();
        
        System.out.println("Account Status: TODO");
        System.out.println();
        
        // TODO 5: Calculate total assets (balance + interest earned)
        double totalAssets = 0;  // CHANGE THIS
        System.out.println("Total Assets: $TODO");
        System.out.println();
        
        // TODO 6: Add a type conversion example
        // For instance: Convert account number (int) to String for display
        // Or: Convert balance to long for database storage
        // Or: Parse a string to get numeric value
        
        System.out.println("=== REFLECTION ===");
        System.out.println("1. Which primitive types did you choose for which data? Why?");
        System.out.println("2. Where did you use constants and why?");
        System.out.println("3. What type conversions occurred in your calculations?");
        System.out.println("4. How might you improve this program further?");
    }
}
