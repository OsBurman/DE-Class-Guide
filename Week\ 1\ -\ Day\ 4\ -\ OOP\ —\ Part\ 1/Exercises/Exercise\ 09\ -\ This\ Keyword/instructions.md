# Exercise 09: This Keyword - Resolving Ambiguity and Method Chaining

## Learning Objectives

After completing this exercise, you should be able to:
- Use `this` to refer to the current object
- Resolve parameter shadowing with `this`
- Use `this` for method chaining
- Understand when `this` is necessary and when it's optional
- Build fluent APIs with `this`

## Problem Statement

You're building a **StringBuilder-like** class called **TextBuilder** that allows:
- Adding text to a buffer
- Method chaining for fluent API
- Ability to build complex strings in one statement
- Clear field access when parameter names shadow field names

## Requirements

### Part 1: Define the TextBuilder Class
Create a class called `TextBuilder` with:

**Fields**:
- `text`: String - the current text (initialized to "")

**Methods**:
- `TextBuilder()`: Default constructor
- `append(String text)`: Adds text to current text, returns `this` for chaining
  - Note: Parameter name `text` shadows field `text`
  - Use `this.text` to disambiguate
- `appendLine(String line)`: Appends text with newline, returns `this`
- `clear()`: Clears text, returns `this`
- `build()`: Returns the final text
- `length()`: Returns length of current text
- `isEmpty()`: Returns true if text is empty

### Part 2: Test Your Class
In the `main()` method:
1. Create a TextBuilder
2. Use method chaining to build text
3. Print intermediate results
4. Show how `this` enables chaining
5. Demonstrate clearing and rebuilding

## Example Output

```
--- Building with Method Chaining ---
Length: 0

Building message...
Result: "Hello, World! Welcome to Java!"
Length: 30
Is Empty? false

Clearing...
Is Empty? true

Building different message...
Result: "Java is awesome!
Goodbye!"
Length: 25

Final length: 25
```

## Hints

- `return this;` at end of method enables chaining
- Use `this.fieldName` when parameter shadows field
- Method chaining is calling multiple methods in sequence
- Each method returns the same object (this)

## Testing Tips

- Build strings using method chaining
- Verify intermediate lengths
- Test clear() functionality
- Try chaining multiple operations
- Notice how this enables elegant, fluent code

## Complexity Assessment

**Difficulty**: Medium  
**Concepts**: This Keyword, Method Chaining, Parameter Shadowing, Fluent API  
**Time Estimate**: 25-30 minutes
