# Exercise 07: Constructor Chaining - Reusing Initialization Logic

## Learning Objectives

After completing this exercise, you should be able to:
- Implement multiple constructors that call each other
- Use `this()` to delegate constructor work
- Avoid code duplication across constructors
- Understand the order of constructor execution

## Problem Statement

You're building a **Person** class with various ways to create instances:
- Full info: name, age, address
- Name and age only (address is optional)
- Name only (age and address are optional)
- Default person

But you want to avoid repeating validation and initialization logic in each constructor.

## Requirements

### Part 1: Define the Person Class
Create a class called `Person` with:

**Fields**:
- `name`: String
- `age`: int
- `address`: String

**Constructors** (in order of most parameters to least):
- `Person(String name, int age, String address)`: Full constructor with validation
- `Person(String name, int age)`: Calls the full constructor with address = "Unknown"
- `Person(String name)`: Calls the 2-param constructor with age = 0
- `Person()`: Default - calls the 1-param constructor with name = "No Name"

**Methods**:
- `displayPerson()`: Prints all information
- `isAdult()`: Returns true if age >= 18

### Part 2: Test Your Class
In the `main()` method:
1. Create persons using each constructor
2. Display information for each
3. Verify chain execution
4. Show how each constructor initializes different fields

## Example Output

```
--- Default Person (no arguments) ---
Name: No Name, Age: 0, Address: Unknown
Is Adult? No

--- Person with name only ---
Name: John Smith, Age: 0, Address: Unknown
Is Adult? No

--- Person with name and age ---
Name: Jane Doe, Age: 25, Address: Unknown
Is Adult? Yes

--- Full Person ---
Name: Bob Johnson, Age: 35, Address: 123 Main St
Is Adult? Yes
```

## Hints

- Each `this()` call must be the FIRST statement in a constructor
- Only ONE `this()` call per constructor
- The chain flows from most parameters to least
- Validation happens in the full constructor only

## Testing Tips

- Create persons with each constructor
- Verify each one initializes correctly
- Check adult status for different ages
- Understand the execution flow (which constructor runs first)

## Complexity Assessment

**Difficulty**: Medium  
**Concepts**: Constructor Chaining, Code Reuse, this() Delegation  
**Time Estimate**: 20-30 minutes
