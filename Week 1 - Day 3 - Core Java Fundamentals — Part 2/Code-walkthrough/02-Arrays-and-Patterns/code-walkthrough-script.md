# Code Walkthrough Script - Part 2: Arrays and Patterns

## Overview
Part 2 covers array fundamentals, multidimensional arrays, searching/sorting algorithms, and common programming patterns using arrays.

---

## Section 1: Array Fundamentals

### ArrayBasicsDemo.java (40 minutes)

**Key Teaching Points:**
- Arrays are fixed-size collections of same type
- Index-based access (0-based)
- Default values depend on type (0, 0.0, false, null)
- Arrays.toString() for printing
- Length property (not method)
- Copying arrays (three methods)

**Walkthrough:**
1. Example 1: Declaration and initialization patterns
   - Size specified: new int[5]
   - With initialization: {10, 20, 30}
   - Strings vs primitives
2. Example 2: Accessing elements (first, last, middle)
3. Example 3: Array.length property
4. Example 4: Modifying elements
5. Example 5: Default values (critical for understanding)
6. Example 6: Two loop styles (traditional for vs enhanced for)
7. Example 7: Three ways to copy arrays (discuss performance)
8. Example 8: Finding min/max patterns
9. Example 9: Sum and average (accumulator pattern)
10. Example 10: Comparing arrays (reference vs equals)

**Discussion Points:**
- Why 0-based indexing? (pointer arithmetic)
- Array[index] vs Array.get(index) - why arrays use []?
- Reference vs value: arr1 == arr2 vs Arrays.equals()
- Default values: why useful?

**Common Mistakes to Highlight:**
- ArrayIndexOutOfBoundsException (accessing beyond length-1)
- Arrays.equals() vs == operator
- Modifying copied array affects original (shallow copy for primitives)

---

### MultiDimensionalArrayDemo.java (35 minutes)

**Key Teaching Points:**
- 2D arrays: rows and columns
- Jagged arrays: variable row sizes
- 3D arrays: less common but important concept
- Nested loops required for 2D iteration
- Matrix operations (addition, transpose)
- Memory layout understanding

**Walkthrough:**
1. Example 1: 2D array basics
   - Size specified: new int[3][3]
   - With initialization: {{1,2,3}, {4,5,6}}
2. Example 2: Accessing elements [row][col]
3. Example 3: Jagged arrays (different row sizes)
4. Example 4: 2D String array (practical example)
5. Example 5: Modifying 2D array elements
6. Example 6: 3D array (extending concept)
7. Example 7: Summing all elements (nested loop)
8. Example 8: Transpose matrix (swap rows/cols)
9. Example 9: Diagonal elements
10. Example 10: Matrix addition

**Discussion Points:**
- How are 2D arrays stored in memory? (row-major)
- When would you use jagged arrays? (variable length data)
- 3D arrays: practical applications?

**Complexity Connection:**
- 1D array loop: O(n)
- 2D array loop: O(n²)
- 3D array loop: O(n³)

---

## Section 2: Searching and Sorting

### SearchAndSortDemo.java (50 minutes)

**Key Teaching Points:**
- Linear search: O(n), works on unsorted
- Binary search: O(log n), requires sorted
- Bubble sort: O(n²), simple but slow
- Selection sort: O(n²), finds min each pass
- Insertion sort: O(n²), like sorting cards
- Built-in sorts: O(n log n), always use these

**Walkthrough:**

**Part A: Searching (15 minutes)**
1. Example 1: Linear search
   - Iterate through each element
   - Return index when found
   - Return -1 if not found
   - O(n) time complexity

2. Example 2: Binary search
   - Only works on sorted arrays
   - Divide and conquer approach
   - Much faster: O(log n)
   - Walk through iterations visually

**Part B: Sorting (35 minutes)**
3. Example 3: Bubble sort (visualize swaps)
   - Compare adjacent elements
   - Swap if wrong order
   - Largest "bubbles" to end each pass
   - Show step-by-step output

4. Example 4: Selection sort
   - Find minimum, place at start
   - Repeat for remaining elements
   - O(n²) but fewer swaps than bubble
   - More efficient than bubble

5. Example 5: Insertion sort
   - Like sorting playing cards
   - Take one element, insert in right place
   - Good for small or nearly-sorted arrays
   - O(n²) average case

6. Example 6: Built-in Arrays.sort()
   - Uses quicksort or mergesort
   - O(n log n)
   - Always prefer to manual sorting
   - Single line replaces 20 lines

7. Example 7: Reverse sort
   - Arrays.sort(array, Collections.reverseOrder())
   - Works with objects, not primitives

8. Example 8: Built-in binary search
   - Arrays.binarySearch()
   - Returns index if found
   - Returns negative if not found

9. Example 9: Sorting Strings
   - Alphabetical order
   - Case-sensitive (uppercase first)

10. Example 10: Partial sort (range)
    - Sort only portion of array
    - java.util.Arrays.sort(array, start, end)

**Discussion Points:**
- Why so many sorting algorithms? (different trade-offs)
- When is bubble sort ever used? (educational)
- Stability: does sort preserve relative order?
- Comparing numbers vs Strings: different implementations

**Time Complexity Comparison:**
- Bubble: O(n²)
- Selection: O(n²)
- Insertion: O(n²) average, O(n) best case
- Merge/Quick: O(n log n)
- Counting: O(n) (for specific cases)

---

## Section 3: Common Programming Patterns

### CommonPatternsDemo.java (40 minutes)

**Key Teaching Points:**
- Recognizing patterns makes coding faster
- Same patterns apply across languages
- Practice pattern identification

**Walkthrough:**

1. **Count Pattern** (5 min)
   - Count occurrences of value
   - Integer counter, increment in loop
   - Used for: frequency analysis, validation

2. **Accumulator Pattern** (5 min)
   - Sum, product, string concatenation
   - Initialize with neutral value (0, 1, "")
   - Apply operation in loop
   - Used for: calculations, totals

3. **Max/Min Pattern** (5 min)
   - Track maximum or minimum value
   - Initialize with first element
   - Update if current > (or <) tracked
   - Used for: finding extremes

4. **Search Pattern** (5 min)
   - Find index of element
   - Return when found, -1 if not
   - Used for: validation, lookups

5. **Two-Pointer Pattern** (5 min)
   - Start from both ends, move toward middle
   - Check palindromes, reverse arrays
   - Used for: symmetry checking

6. **Filter Pattern** (5 min)
   - Create new array with selected elements
   - Count matching first, create smaller array
   - Used for: data processing, validation

7. **Transform Pattern** (5 min)
   - Apply function to each element
   - Create new array with transformed values
   - Used for: unit conversion, scaling

8. **Sliding Window Pattern** (5 min)
   - Process consecutive elements in window
   - Efficient: don't recalculate from scratch
   - Used for: moving averages, subarray sums

9. **Prefix Sum Pattern** (5 min)
   - Precompute cumulative sums
   - Enable range sum queries in O(1)
   - Used for: optimization, range queries

10. **Rearrange Pattern** (5 min)
    - Reorganize array based on condition
    - Swap elements to group
    - Used for: partitioning, organizing

11. **Frequency Count Pattern** (5 min)
    - Count occurrences of each unique value
    - Use Map/HashMap
    - Used for: analysis, deduplication

12. **Duplicates Pattern** (5 min)
    - Detect if array has duplicates
    - Use Set to track seen values
    - Used for: validation, deduplication

**Discussion Points:**
- Pattern recognition is key to problem solving
- Same pattern often solves different problems
- Combine patterns for complex solutions

**Real-World Applications:**
- Social media: filter users, frequency of posts
- E-commerce: min/max prices, search products
- Data analysis: duplicates detection, statistics
- Algorithms: sorting, searching, graph traversal

---

## Summary & Connections

**Arrays enable:**
- Storing multiple values of same type
- Iteration and collection operations
- Algorithm implementation
- Pattern application

**Searching & Sorting:**
- Prerequisites for many algorithms
- Performance matters (O(n²) vs O(n log n))
- Must know both manual and built-in approaches

**Patterns:**
- Templates for common problems
- Recognizing patterns accelerates development
- Building blocks for complex algorithms

---

## Classroom Activities

1. **Algorithm Race**: Which sort is fastest for different sizes?
2. **Pattern Recognition**: Given problem, identify pattern(s)
3. **Trace Execution**: Step through search/sort manually
4. **Optimize Code**: Refactor nested loops using patterns
5. **Debug**: Find why sort didn't work
6. **Combine Patterns**: Solve problem using multiple patterns

---

## Common Student Mistakes

1. Off-by-one errors in array access
2. Infinite loops in manual sorts
3. Confusing linear vs binary search conditions
4. Not recognizing when pattern applies
5. Modifying array during iteration
6. Not handling edge cases (empty array)
7. O(n²) solutions when O(n) exists

---

## Performance Notes

- **Small arrays** (< 50 elements): All sorts similar
- **Medium arrays** (50-10,000): Quick/merge sort ~100x faster
- **Large arrays** (> 10,000): Performance matters significantly
- **Nearly sorted**: Insertion sort faster than quick sort
- **Cache locality**: Array iteration is fast, jumping slow

---

## Connection to Next Topics

- Arrays are foundation for data structures (lists, sets, maps)
- Sorting used in Collections (ArrayList, TreeSet)
- Searching patterns appear in every algorithm
- Two-pointer pattern used in sliding window problems
- Patterns are basis for elegant code and interviews
