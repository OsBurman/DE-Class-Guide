/**
 * Exercise 06: Comprehensive Review - Bank Account System
 * Solution
 * 
 * Complete program demonstrating all concepts from Exercises 01-05:
 * - Primitive types chosen appropriately for each data type
 * - Variables with proper naming conventions
 * - Constants for unchanging values
 * - Type conversions for calculations and display
 * - Autoboxing with String parsing
 */

public class BankAccountSystem {
    public static void main(String[] args) {
        System.out.println("===== Bank Account System =====\n");

        // PART 1: Declare variables for account information
        // Naming convention: camelCase for variables
        String accountOwner = "John Doe";
        int accountNumber = 10001234; // Use int for account numbers
        double currentBalance = 5234.50; // Use double for money
        boolean isAccountActive = true; // Use boolean for status

        System.out.println("Account Owner: " + accountOwner);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + currentBalance);
        System.out.println();

        // PART 2: Create constants for bank policies
        // Naming convention: UPPER_CASE for constants
        final double MAX_WITHDRAWAL = 500.0;
        final double MIN_BALANCE = 100.0;
        final double ANNUAL_INTEREST_RATE = 0.025; // 2.5% as decimal

        System.out.println("Bank Policies:");
        System.out.println("  Maximum Withdrawal: $" + MAX_WITHDRAWAL);
        System.out.println("  Minimum Balance: $" + MIN_BALANCE);
        System.out.println("  Annual Interest Rate: " + (ANNUAL_INTEREST_RATE * 100) + "%");
        System.out.println();

        // PART 3: Calculate annual interest
        // Interest = Balance × Rate
        // Both currentBalance and ANNUAL_INTEREST_RATE are doubles
        // Result is naturally a double - no conversion needed
        double annualInterest = currentBalance * ANNUAL_INTEREST_RATE;

        // Format to 2 decimal places for currency
        System.out.println("Calculated Interest (Annual): $" +
                String.format("%.2f", annualInterest));
        System.out.println();

        // PART 4: Display account status
        String accountStatus = isAccountActive ? "Active" : "Inactive";
        System.out.println("Account Status: " + accountStatus);
        System.out.println();

        // PART 5: Calculate total assets (balance + interest earned)
        double totalAssets = currentBalance + annualInterest;
        System.out.println("Total Assets: $" + String.format("%.2f", totalAssets));
        System.out.println();

        // PART 6: Demonstrate type conversions
        System.out.println("=== TYPE CONVERSION EXAMPLES ===");
        System.out.println();

        // Example 1: int to String for display
        String accountNumberString = String.valueOf(accountNumber);
        System.out.println("1. Convert account number to String:");
        System.out.println("   int accountNumber = " + accountNumber);
        System.out.println("   String as text: \"" + accountNumberString + "\"");
        System.out.println();

        // Example 2: double to long for database storage
        long balanceInCents = (long) (currentBalance * 100);
        System.out.println("2. Convert balance to cents (for database):");
        System.out.println("   double balance = $" + currentBalance);
        System.out.println("   long balanceInCents = " + balanceInCents);
        System.out.println();

        // Example 3: Parse string to get numeric value
        String stringAmount = "150.00";
        double parsedAmount = Double.parseDouble(stringAmount);
        System.out.println("3. Parse string to get amount:");
        System.out.println("   String stringAmount = \"" + stringAmount + "\"");
        System.out.println("   double parsedAmount = " + parsedAmount);
        System.out.println();

        // PART 7: Demonstrate autoboxing
        System.out.println("=== AUTOBOXING EXAMPLE ===");
        System.out.println();

        // Autobox primitives to wrappers
        Integer boxedAccountNumber = accountNumber; // int → Integer
        Double boxedBalance = currentBalance; // double → Double
        Boolean boxedActive = isAccountActive; // boolean → Boolean

        System.out.println("Autoboxing primitives to wrappers:");
        System.out.println("Integer boxedAccountNumber = " + boxedAccountNumber);
        System.out.println("Double boxedBalance = " + boxedBalance);
        System.out.println("Boolean boxedActive = " + boxedActive);
        System.out.println();

        // PART 8: Additional bank calculations
        System.out.println("=== ADDITIONAL CALCULATIONS ===");
        System.out.println();

        // Can the account owner withdraw the maximum?
        boolean canWithdrawMax = (currentBalance - MAX_WITHDRAWAL) >= MIN_BALANCE;
        System.out.println("Can withdraw maximum amount?");
        System.out.println("Balance: $" + currentBalance + " - Withdrawal: $" + MAX_WITHDRAWAL);
        System.out.println("Remaining: $" + (currentBalance - MAX_WITHDRAWAL));
        System.out.println("Meets minimum? " + canWithdrawMax);
        System.out.println();

        // Monthly interest
        double monthlyInterestRate = ANNUAL_INTEREST_RATE / 12;
        double monthlyInterest = currentBalance * monthlyInterestRate;
        System.out.println("Monthly Interest Calculation:");
        System.out.println("  Monthly rate: " + monthlyInterestRate);
        System.out.println("  Monthly interest: $" + String.format("%.2f", monthlyInterest));
        System.out.println();

        // PART 9: Summary with proper formatting
        System.out.println("===== FINAL SUMMARY =====");
        System.out.println("Owner: " + accountOwner);
        System.out.println("Account #: " + accountNumber);
        System.out.println("Status: " + accountStatus);
        System.out.println("Current Balance: $" + String.format("%.2f", currentBalance));
        System.out.println("Annual Interest: $" + String.format("%.2f", annualInterest));
        System.out.println("Projected Total (with interest): $" + String.format("%.2f", totalAssets));
        System.out.println();

        System.out.println("=== REFLECTION ===");
        System.out.println();
        System.out.println("1. Which primitive types did you choose for which data? Why?");
        System.out.println("   - String for owner name (text data)");
        System.out.println("   - int for account number (whole number identifier)");
        System.out.println("   - double for balance (currency needs decimals)");
        System.out.println("   - boolean for active status (true/false)");
        System.out.println();
        System.out.println("2. Where did you use constants and why?");
        System.out.println("   - MAX_WITHDRAWAL, MIN_BALANCE, ANNUAL_INTEREST_RATE");
        System.out.println("   - These are bank policies that shouldn't change during program");
        System.out.println("   - UPPER_CASE naming makes it clear these are constants");
        System.out.println();
        System.out.println("3. What type conversions occurred in your calculations?");
        System.out.println("   - int → String for account number display");
        System.out.println("   - double → long for database storage in cents");
        System.out.println("   - String → double for parsing user input");
        System.out.println("   - Autoboxing: primitives → wrapper classes for collections");
        System.out.println();
        System.out.println("4. How might you improve this program further?");
        System.out.println("   - Add multiple accounts in an ArrayList");
        System.out.println("   - Use Scanner to accept user input");
        System.out.println("   - Create methods for deposit, withdrawal, calculateInterest");
        System.out.println("   - Add transaction history");
        System.out.println("   - Format currency output automatically");
    }
}
