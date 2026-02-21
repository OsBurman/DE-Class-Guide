/**
 * Exercise 02: Constructors and Initialization - SOLUTION
 * 
 * This solution demonstrates:
 * - Defining multiple constructors (constructor overloading)
 * - Automatic initialization through constructors
 * - Different ways to create objects with different initial states
 */
public class BankAccount {
    
    String accountNumber;
    String accountHolder;
    double balance;
    
    // Constructor 1: Basic constructor - initializes balance to 0
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }
    
    // Constructor 2: With initial balance
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    
    // Display account information
    void displayAccount() {
        System.out.printf("Account %s - Holder: %s, Balance: $%.2f%n", accountNumber, accountHolder, balance);
    }
    
    // Deposit money into account
    void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposit $%.2f%n", amount);
    }
    
    // Withdraw money from account (if sufficient funds)
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Withdraw $%.2f%n", amount);
        } else {
            System.out.printf("Cannot withdraw $%.2f - insufficient funds!%n", amount);
        }
    }
    
    public static void main(String[] args) {
        // Test Constructor 1 - Basic constructor
        System.out.println("--- Account 1 (Created with basic constructor) ---");
        BankAccount account1 = new BankAccount("123456", "John Doe");
        account1.displayAccount();
        account1.deposit(500);
        account1.displayAccount();
        
        System.out.println();
        
        // Test Constructor 2 - With initial balance
        System.out.println("--- Account 2 (Created with initial balance) ---");
        BankAccount account2 = new BankAccount("789012", "Jane Smith", 1000);
        account2.displayAccount();
        account2.deposit(250);
        account2.displayAccount();
        account2.withdraw(150);
        account2.displayAccount();
    }
}
