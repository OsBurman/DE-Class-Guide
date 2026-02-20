# Exercise 12: String Manipulation with Operators

## Learning Objectives
- Combine string operations with operators
- Parse and validate string input
- Format and combine strings with logic
- Apply operators in real-world string scenarios

## Your Task
Create a program that validates and processes user information using strings, operators, and type conversion.

## Scenario
Build a simple email validation and user profile formatter that:
1. Validates email format (contains @ and .)
2. Validates password strength (length >= 8 AND contains uppercase OR number)
3. Extracts and formats parts of an email
4. Creates formatted output combining strings and calculations

## What You'll Practice
- String methods (indexOf, contains, substring, length, toUpperCase, etc.)
- Type conversion (string to number and back)
- Logical operators (&&, ||, !) in validation
- Comparison operators on strings and numbers
- String concatenation with formatted results

## Requirements
1. Create at least 3 sample user inputs (email, password)
2. Validate email using string operators (&&, ||, !)
3. Validate password strength using logical operators
4. Extract username from email using substring and indexOf
5. Extract domain using string methods
6. Create formatted output combining all parts
7. Show at least one case where validation fails and explain why

## Example Output
```
Email: john.doe@example.com
  ✓ Valid format
  Username: john.doe
  Domain: example.com
  
Password: MyPass123
  ✓ Strong (length 9, contains uppercase, contains number)
  
Profile:
  User: john.doe
  Domain: example.com
  Password strength: Strong
```

## Reflection Questions
1. How do && and || help with password validation?
2. What string method was most useful for extracting parts?
3. How did you combine multiple conditions?
4. What edge cases should you consider for email validation?

## Extension
- Build a more complete email validator (local part rules, domain rules)
- Create a password score system (0-100) using numeric calculations
- Handle special cases (subdomains, plus addressing)
