# Exercise 09: Bubble Sort Implementation

## Objective
Understand and implement basic sorting algorithm with nested loops.

## Problem Statement
Implement the bubble sort algorithm to sort an array of numbers in ascending order.

Bubble Sort Algorithm:
- Compare adjacent elements
- Swap if they're in wrong order
- Repeat until array is sorted
- Each pass "bubbles" the largest unsorted element to its correct position

## Requirements
1. **Input**: Variable number of integers as command-line arguments
2. **Algorithm**: Implement bubble sort (not use Arrays.sort)
3. **Output**: Print original array and sorted array
4. **Steps**: Print each pass/step (optional but recommended for learning)

## Example Output
```
Command: java BubbleSort 64 25 12 22 11

Original array: [64, 25, 12, 22, 11]

Sorting...
Pass 1: [25, 12, 22, 11, 64]
Pass 2: [12, 22, 11, 25, 64]
Pass 3: [12, 11, 22, 25, 64]
Pass 4: [11, 12, 22, 25, 64]

Sorted array: [11, 12, 22, 25, 64]
```

## Bubble Sort Pseudocode
```
for i from 0 to n-2:
    for j from 0 to n-i-2:
        if array[j] > array[j+1]:
            swap array[j] and array[j+1]
```

## Hints
- Use nested loops (outer for passes, inner for comparisons)
- To swap: use a temp variable
- The inner loop's upper bound decreases each pass: n-i-1
- This is because each pass moves one more element to its final position

## Constraints
- Must implement bubble sort from scratch (not Arrays.sort)
- Must use arrays
- Keep code in main method

## Success Criteria
- ✅ Array sorted in ascending order
- ✅ All elements present (no loss/duplication)
- ✅ Correct number of passes
- ✅ Correct output formatting
- ✅ Handles single element, duplicates
- ✅ Handles already-sorted array
