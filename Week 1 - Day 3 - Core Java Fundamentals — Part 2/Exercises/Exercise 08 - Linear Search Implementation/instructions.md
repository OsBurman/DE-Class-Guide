# Exercise 08: Linear Search Implementation

## Objective
Practice array searching and understand linear search algorithm.

## Problem Statement
Implement a linear search algorithm to find a target value in an array.

Requirements:
1. Accept multiple numbers and a target value as command-line arguments
2. Search the array for the target
3. Return the index if found, -1 if not found
4. Print position (1-based) or "Not found"

Format: `java LinearSearch target number1 number2 number3...`

## Requirements
1. **Input**: First argument is target, remaining are array elements
2. **Algorithm**: Linear search - check each element sequentially
3. **Output**: Print index (0-based) and position (1-based), or "Not found"
4. **Edge Cases**: Handle empty array, target at start/middle/end, not found

## Example Output
```
Command: java LinearSearch 12 5 12 3 18 7 9 14

Searching for: 12
Array: [5, 12, 3, 18, 7, 9, 14]
Found at index: 1
Position: 2 (1-based)

Command: java LinearSearch 20 5 12 3 18 7 9 14

Searching for: 20
Array: [5, 12, 3, 18, 7, 9, 14]
Not found

Command: java LinearSearch 5 5 12 3 18 7 9 14

Searching for: 5
Array: [5, 12, 3, 18, 7, 9, 14]
Found at index: 0
Position: 1 (1-based)
```

## Algorithm Pseudocode
```
for i from 0 to array.length - 1:
    if array[i] == target:
        return i
return -1
```

## Hints
- Use a for loop to iterate through the array
- Use break or return when found
- Initialize result to -1 (not found)
- Remember: 0-based index becomes 1-based position (add 1)

## Constraints
- Must use linear search (not binary search)
- Must use arrays
- Handle first argument as target
- Keep code in main method

## Success Criteria
- ✅ Finds target when it exists
- ✅ Returns -1 (or "Not found") when target doesn't exist
- ✅ Finds first occurrence if duplicates exist
- ✅ Handles target at different positions (start, middle, end)
- ✅ Correct 1-based position output
