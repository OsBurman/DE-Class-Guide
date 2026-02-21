# Exercise 04: Nested Loops - Multiplication Table

## Objective
Practice nested loops and understand loop control in 2D patterns.

## Problem Statement
Create a program that generates a multiplication table. The program should:
1. Accept the table size as a command-line argument (e.g., 5 for a 5×5 table)
2. Print a formatted multiplication table
3. Use nested loops (one for rows, one for columns)
4. Align output nicely with proper spacing

## Requirements
1. **Input**: Table size as command-line argument (1-12)
2. **Nested Loops**: Outer loop for rows, inner loop for columns
3. **Calculation**: Multiply row * column for each cell
4. **Formatting**: Right-align numbers in columns (4 characters wide)
5. **Header Row**: Optional - print column numbers as header (0-based or 1-based)

## Example Output
```
Command: java Multiplication 5

Multiplication Table (5x5):
      1    2    3    4    5
   1  1    2    3    4    5
   2  2    4    6    8   10
   3  3    6    9   12   15
   4  4    8   12   16   20
   5  5   10   15   20   25
```

## Hints
- Use `System.out.print()` (without newline) for columns
- Use `System.out.println()` (with newline) after each row
- Use printf for formatting: `System.out.printf("%4d", value);`
- Alternatively, use String.format for padding

## Constraints
- Must use nested for loops (not ArrayList or arrays of results)
- Table size must be between 1 and 12
- Print "Invalid size" if out of range

## Success Criteria
- ✅ Correct multiplication calculations
- ✅ Proper alignment (columns line up)
- ✅ Correct number of rows and columns
- ✅ Formatted output is readable
- ✅ Input validation for table size
