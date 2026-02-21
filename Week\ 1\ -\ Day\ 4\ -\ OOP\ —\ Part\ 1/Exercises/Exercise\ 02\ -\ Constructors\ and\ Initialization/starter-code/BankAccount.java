/**
 * Exercise 02: Constructors and Initialization
 * 
 * TODO: Complete the BankAccount class with two constructors
 */
public class BankAccount {

    // TODO: Declare three fields
    // - accountNumber (String)
    // - accountHolder (String)
    // - balance (double)

    // TODO: Create Constructor 1 - Takes accountNumber and accountHolder
    // Sets balance to 0.0
    // Constructor signature: BankAccount(String accountNumber, String
    // accountHolder)

    // TODO: Create Constructor 2 - Takes accountNumber, accountHolder, and
    // initialBalance
    // Sets balance to initialBalance
    // Constructor signature: BankAccount(String accountNumber, String
    // accountHolder, double initialBalance)

    // TODO: Create displayAccount() method that prints:
    // "Account [number] - Holder: [holder], Balance: $[balance formatted to 2
    // decimals]"

    // TODO: Create deposit(double amount) method that adds amount to balance

    // TODO: Create withdraw(double amount) method that:
    // - Subtracts amount from balance if balance >= amount
    // - Does nothing (or prints error) if balance < amount

    public static void main(String[] args) {
        // TODO: Test Constructor 1 - Basic constructor (balance starts at 0)
        // Create account "123456" for "John Doe"
        // Display the account
        // Deposit $500
        // Display the account again

        System.out.println();

        // TODO: Test Constructor 2 - With initial balance
        // Create account "789012" for "Jane Smith" with initial balance of $1000
        // Display the account
        // Deposit $250
        // Display the account
        // Withdraw $150
        // Display the account
    }
}
