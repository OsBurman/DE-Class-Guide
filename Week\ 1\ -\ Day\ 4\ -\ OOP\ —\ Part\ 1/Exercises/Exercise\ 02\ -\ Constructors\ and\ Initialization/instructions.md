# Exercise 02: Constructors and Initialization - Initializing Objects Properly

## Learning Objectives

After completing this exercise, you should be able to:
- Define and use constructors to initialize objects
- Understand the difference between default and parameterized constructors
- Use constructors to ensure objects are created in valid states
- Call constructors to set initial values automatically

## Problem Statement

You're building a **BankAccount** class for a banking system. Instead of creating an account and then setting values manually, you should use constructors to initialize accounts automatically when they're created.

## Requirements

### Part 1: Define the BankAccount Class
Create a class called `BankAccount` with:

**Fields**:
- `accountNumber`: String - unique account identifier
- `accountHolder`: String - name of the account owner
- `balance`: double - current balance (should start at 0 or initial amount)

**Constructors**:
- Constructor 1 (Basic): Takes accountNumber and accountHolder, sets balance to 0
- Constructor 2 (With Initial Balance): Takes accountNumber, accountHolder, and initial balance

**Methods**:
- `displayAccount()`: Prints account info in format: "Account [number] - Holder: [holder], Balance: $[balance]"
- `deposit(double amount)`: Adds amount to balance
- `withdraw(double amount)`: Subtracts amount from balance (if sufficient funds exist)

### Part 2: Test Your Class
In the `main()` method:
1. Create an account using Constructor 1 (basic)
2. Create another account using Constructor 2 (with initial balance)
3. Call `displayAccount()` for both
4. Perform deposit/withdraw operations and display results

### Part 3: Observations
You should observe that:
- Objects are initialized immediately upon creation (with constructor values)
- Different constructors can initialize objects in different ways
- Constructors run automatically and must have the same name as the class

## Example Output

```
--- Account 1 (Created with basic constructor) ---
Account 123456 - Holder: John Doe, Balance: $0.00
Deposit $500.00
Account 123456 - Holder: John Doe, Balance: $500.00

--- Account 2 (Created with initial balance) ---
Account 789012 - Holder: Jane Smith, Balance: $1000.00
Deposit $250.00
Account 789012 - Holder: Jane Smith, Balance: $1250.00
Withdraw $150.00
Account 789012 - Holder: Jane Smith, Balance: $1100.00
```

## Hints

- Constructor names MUST match the class name
- Constructor runs automatically when you use `new`
- Don't add a return type to constructors (not even void)
- Use parameters in constructors to set field values
- Consider validation: Can you withdraw more than available balance?

## Testing Tips

- Test creating accounts with both constructors
- Verify initial balance is set correctly
- Test deposit and withdraw operations
- Consider edge cases: What if someone tries to withdraw $1000 from an account with $100?

## Complexity Assessment

**Difficulty**: Easy-Medium  
**Concepts**: Constructors, Initialization, Parameterized Constructors, Object State  
**Time Estimate**: 25-35 minutes
