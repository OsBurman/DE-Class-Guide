# Exercise 04: Method Overloading - Same Method, Different Parameters

## Learning Objectives

After completing this exercise, you should be able to:
- Implement method overloading with different parameter counts
- Implement method overloading with different parameter types
- Understand method signature matching
- Know when overloading is appropriate

## Problem Statement

You're building a **Calculator** utility class with methods that can add/multiply numbers. However, users need flexibility:
- Add two numbers (2 parameters)
- Add three numbers (3 parameters)
- Multiply two numbers (2 parameters)
- Multiply different types (int, double, mixed)

## Requirements

### Part 1: Define the Calculator Class
Create a class called `Calculator` with:

**Methods**:
- `add(int a, int b)`: Returns sum of two ints
- `add(double a, double b)`: Returns sum of two doubles
- `add(int a, int b, int c)`: Returns sum of three ints
- `multiply(int a, int b)`: Returns product of two ints
- `multiply(double a, double b)`: Returns product of two doubles
- `multiply(int a, double b)`: Returns product of int and double

### Part 2: Test Your Class
In the `main()` method:
1. Test all overloaded add methods
2. Test all overloaded multiply methods
3. Verify correct method is called based on parameters
4. Show different return types

## Example Output

```
--- Addition ---
add(5, 10) = 15
add(3.5, 2.5) = 6.0
add(10, 20, 30) = 60

--- Multiplication ---
multiply(4, 7) = 28
multiply(2.5, 4.0) = 10.0
multiply(5, 3.5) = 17.5
```

## Hints

- Method overloading is determined by method signature (name + parameters)
- Return type alone is NOT enough to differentiate methods
- Java determines which method to call based on argument types
- Parameter count differences also create valid overloads

## Testing Tips

- Test each overloaded version
- Verify correct calculations
- Try passing different types to see which method is called
- Consider integer division vs. double division

## Complexity Assessment

**Difficulty**: Easy-Medium  
**Concepts**: Method Overloading, Parameter Types, Method Resolution  
**Time Estimate**: 20-25 minutes
