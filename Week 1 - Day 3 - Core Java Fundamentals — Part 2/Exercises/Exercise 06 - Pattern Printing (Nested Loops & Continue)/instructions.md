# Exercise 06: Pattern Printing (Nested Loops & Continue)

## Objective
Practice nested loops with continue statement to create visual patterns.

## Problem Statement
Create a program that prints a pyramid pattern. The user specifies the height of the pyramid.

## Requirements
1. **Input**: Pyramid height as command-line argument
2. **Pattern**: Right-aligned pyramid made of asterisks
3. **Validation**: Height must be between 1 and 20
4. **Output**: Each row i has i asterisks, right-aligned

## Example Output
```
Command: java PyramidPrinter 5

    *
   **
  ***
 ****
*****
```

## More Complex Version (Bonus)
Print a diamond pattern if height is even:
```
Command: java PyramidPrinter 6

     *
    **
   ***
  ****
 *****
******
 *****
  ****
   ***
    **
     *
```

## Hints
- Outer loop: iterate rows (1 to height)
- Inner loop 1: print spaces (for alignment)
- Inner loop 2: print asterisks
- Use printf for formatting: `System.out.printf("%*s\n", 5, "X");` for right-alignment
- Or use a loop to print spaces, then asterisks

## Constraints
- Height must be 1-20
- Don't use Arrays
- All code in main method

## Success Criteria
- ✅ Correct pattern shape
- ✅ Proper right-alignment
- ✅ Correct number of asterisks per row
- ✅ Input validation (1-20)
- ✅ Clean output formatting
