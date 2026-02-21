# Exercise 07: Array Statistics (Min, Max, Average)

## Objective
Practice array iteration and implementing common array operations.

## Problem Statement
Write a program that accepts an array of numbers (via command-line arguments) and calculates:
1. Minimum value
2. Maximum value
3. Average (mean)
4. Sum of all elements
5. Count of elements

## Requirements
1. **Input**: Variable number of integers as command-line arguments
2. **Processing**: 
   - Find minimum value
   - Find maximum value
   - Calculate sum and average
3. **Output**: Display all statistics with clear labels
4. **Edge Cases**: Handle single element, all same values

## Example Output
```
Command: java ArrayStatistics 5 12 3 18 7 9 14

Array: [5, 12, 3, 18, 7, 9, 14]
Count: 7
Sum: 68
Average: 9.71
Minimum: 3
Maximum: 18
```

## Hints
- Initialize min to array[0] and max to array[0]
- Use a loop starting at index 1 for min/max comparisons
- For average, cast to double: `(double)sum / array.length`
- Use printf to format decimal: `System.out.printf("%.2f\n", average);`

## Constraints
- Must use arrays
- Input validation: at least one number required
- Don't use ArrayList or other collections
- Keep code in main method

## Success Criteria
- ✅ Correct minimum value
- ✅ Correct maximum value
- ✅ Correct sum
- ✅ Correct average (2 decimal places)
- ✅ Handles single element
- ✅ Handles negative numbers
- ✅ Proper formatting
