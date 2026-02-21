# Week 1 Day 3 - Part 2: Arrays and Programming Patterns
## Slide Descriptions (20 slides)

---

# SLIDE 1: Title Slide - Arrays and Patterns

## Visual:
```
╔═══════════════════════════════════╗
║   ARRAYS & PROGRAMMING PATTERNS   ║
║   Working with Collections of     ║
║   Data & Common Solutions         ║
║                                   ║
║   Week 1 - Day 3 - Part 2         ║
║   Core Java Fundamentals          ║
╚═══════════════════════════════════╝
```

---

# SLIDE 2: What are Arrays?

## Definition:
**Array** = A collection of elements of the same type, stored in contiguous memory

## Why Use Arrays?
- Store multiple related values
- Access values by index (0, 1, 2, ...)
- Process many items with loops
- Foundation for more complex data structures

## Declaration and Creation:
```java
// Declare array
int[] numbers;

// Create array (size 5)
numbers = new int[5];

// Declare and create in one line
int[] numbers = new int[5];

// Declare and initialize with values
int[] numbers = {10, 20, 30, 40, 50};
```

## Key Points:
- Arrays are indexed from 0 to length-1
- All elements same type
- Fixed size (cannot grow/shrink)
- Default values: 0 for int, false for boolean, null for objects

---

# SLIDE 3: Array Basics - Access and Iteration

## Accessing Elements:
```java
int[] numbers = {10, 20, 30, 40, 50};

System.out.println(numbers[0]);    // 10
System.out.println(numbers[2]);    // 30
System.out.println(numbers[4]);    // 50
System.out.println(numbers.length); // 5

// numbers[5] - ERROR: out of bounds!
```

## Common Mistake - Off-by-One:
```java
// WRONG - tries to access index 5 (doesn't exist)
for (int i = 0; i <= array.length; i++) { }

// RIGHT - stops at index array.length - 1
for (int i = 0; i < array.length; i++) { }
```

## Three Ways to Iterate:
```java
// 1. Traditional for loop (need index)
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}

// 2. Enhanced for loop (don't need index)
for (int num : array) {
    System.out.println(num);
}

// 3. While loop (less common)
int i = 0;
while (i < array.length) {
    System.out.println(array[i]);
    i++;
}
```

---

# SLIDE 4: Multidimensional Arrays - 2D Arrays

## What is a 2D Array?
Array of arrays (grid/table structure)

## Declaration and Creation:
```java
// 2D array: 3 rows, 4 columns
int[][] matrix = new int[3][4];

// Initialize with values
int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

## Accessing Elements:
```java
int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};

System.out.println(matrix[0][0]);  // 1 (row 0, col 0)
System.out.println(matrix[1][1]);  // 4 (row 1, col 1)
System.out.println(matrix[2][0]);  // 5 (row 2, col 0)
```

## Iterating 2D Arrays:
```java
// Nested for loops
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
    }
    System.out.println();  // New line after each row
}
```

## Visualization:
```
matrix[0][0]  matrix[0][1]  matrix[0][2]
matrix[1][0]  matrix[1][1]  matrix[1][2]
matrix[2][0]  matrix[2][1]  matrix[2][2]
```

---

# SLIDE 5: Jagged Arrays

## What is Jagged?
2D array where rows have different lengths

## Declaration and Usage:
```java
// Jagged array - rows with different lengths
int[][] jagged = new int[3][];
jagged[0] = new int[2];     // First row has 2 elements
jagged[1] = new int[3];     // Second row has 3 elements
jagged[2] = new int[4];     // Third row has 4 elements

// Or initialize directly
int[][] jagged = {
    {1, 2},
    {3, 4, 5},
    {6, 7, 8, 9}
};
```

## Why Jagged Arrays?
- Save memory when rows have different sizes
- Represent irregular data (e.g., student grades by subject)

## Iteration (Must Check Row Length):
```java
for (int row = 0; row < jagged.length; row++) {
    for (int col = 0; col < jagged[row].length; col++) {  // Each row can differ
        System.out.print(jagged[row][col] + " ");
    }
    System.out.println();
}
```

---

# SLIDE 6: 3D Arrays (Higher Dimensions)

## Concept:
2D array of 2D arrays (cube of data)

## Declaration:
```java
int[][][] cube = new int[2][3][4];
// 2 rows, 3 columns, 4 depth
```

## Accessing Elements:
```java
int[][][] cube = {
    {{1, 2}, {3, 4}},
    {{5, 6}, {7, 8}}
};

System.out.println(cube[0][0][0]);  // 1
System.out.println(cube[1][1][1]);  // 8
```

## Iterating 3D Arrays:
```java
for (int layer = 0; layer < cube.length; layer++) {
    for (int row = 0; row < cube[layer].length; row++) {
        for (int col = 0; col < cube[layer][row].length; col++) {
            System.out.print(cube[layer][row][col] + " ");
        }
    }
}
```

## Real-World Example:
```
3D array for chessboard simulation:
- Dimension 1: Multiple boards
- Dimension 2: 8 rows
- Dimension 3: 8 columns
```

---

# SLIDE 7: Common Array Operations

## Finding Minimum:
```java
int[] scores = {45, 92, 78, 55, 88};
int min = scores[0];
for (int i = 1; i < scores.length; i++) {
    if (scores[i] < min) {
        min = scores[i];
    }
}
System.out.println("Min: " + min);  // 45
```

## Finding Maximum:
```java
int max = scores[0];
for (int score : scores) {
    if (score > max) {
        max = score;
    }
}
System.out.println("Max: " + max);  // 92
```

## Sum and Average:
```java
int sum = 0;
for (int score : scores) {
    sum += score;
}
double average = (double) sum / scores.length;
System.out.println("Sum: " + sum + ", Avg: " + average);
```

## Comparing Arrays:
```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
boolean same = Arrays.equals(arr1, arr2);  // true
```

---

# SLIDE 8: Searching Fundamentals

## Linear Search:
```java
// Search for value in array, return index
int[] array = {10, 5, 20, 15, 30};
int target = 20;
int index = -1;

for (int i = 0; i < array.length; i++) {
    if (array[i] == target) {
        index = i;
        break;
    }
}

if (index != -1) {
    System.out.println("Found at index " + index);
} else {
    System.out.println("Not found");
}
```

## When to Use:
- Unsorted arrays
- Small arrays
- When you need element, not just existence

## Time Complexity:
- Best case: O(1) - found at index 0
- Worst case: O(n) - found at end or not found

---

# SLIDE 9: Binary Search

## Prerequisite:
Array MUST be sorted

## Algorithm:
```java
int[] sortedArray = {5, 10, 15, 20, 25, 30};
int target = 20;
int left = 0, right = sortedArray.length - 1;
int index = -1;

while (left <= right) {
    int mid = (left + right) / 2;
    if (sortedArray[mid] == target) {
        index = mid;
        break;
    } else if (sortedArray[mid] < target) {
        left = mid + 1;  // Search right half
    } else {
        right = mid - 1;  // Search left half
    }
}
```

## Or Use Built-in:
```java
int index = Arrays.binarySearch(sortedArray, target);
```

## Time Complexity:
- O(log n) - Much faster than linear search!
- For 1 million items: linear needs ~500k comparisons, binary needs ~20

## Comparison:
```
Linear Search:  10, 5, 20, 15, 30 → O(n)
Binary Search:  5, 10, 15, 20, 25, 30 → O(log n)
```

---

# SLIDE 10: Sorting Algorithms

## Bubble Sort (Simplest):
```java
int[] array = {64, 25, 12, 22, 11};

// Bubble sort
for (int i = 0; i < array.length - 1; i++) {
    for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
            // Swap
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }
}
```

## Selection Sort:
```java
for (int i = 0; i < array.length - 1; i++) {
    int minIndex = i;
    for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
            minIndex = j;
        }
    }
    // Swap min to position i
    int temp = array[i];
    array[i] = array[minIndex];
    array[minIndex] = temp;
}
```

## Built-in Sort:
```java
Arrays.sort(array);  // Uses efficient algorithm internally
```

## Complexity Comparison:
| Algorithm | Best | Average | Worst |
|-----------|------|---------|-------|
| Bubble | O(n) | O(n²) | O(n²) |
| Selection | O(n²) | O(n²) | O(n²) |
| Arrays.sort | O(n log n) | O(n log n) | O(n²) |

---

# SLIDE 11: Pattern 1 - Count Occurrences

## Problem:
Count how many times a value appears in an array

## Solution:
```java
int[] numbers = {1, 2, 2, 3, 2, 4, 2, 5};
int target = 2;
int count = 0;

for (int num : numbers) {
    if (num == target) {
        count++;
    }
}

System.out.println(target + " appears " + count + " times");  // 4
```

## Real-World Use:
- Vote counting
- Frequency analysis
- Quality control (defects)

---

# SLIDE 12: Pattern 2 - Accumulate (Sum, Product)

## Problem:
Combine all elements (sum, product, concatenation)

## Sum:
```java
int[] sales = {100, 250, 175, 300};
int total = 0;

for (int sale : sales) {
    total += sale;
}

System.out.println("Total sales: " + total);  // 825
```

## Product:
```java
int[] factors = {2, 3, 5};
int product = 1;

for (int factor : factors) {
    product *= factor;
}

System.out.println("Product: " + product);  // 30
```

## Concatenation:
```java
String[] words = {"Hello", "World", "Java"};
String sentence = "";

for (String word : words) {
    sentence += word + " ";
}

System.out.println(sentence);  // "Hello World Java "
```

---

# SLIDE 13: Pattern 3 - Find Max/Min with Index

## Problem:
Find largest or smallest value AND where it is

## Solution:
```java
int[] temperatures = {22, 28, 25, 31, 20};
int maxTemp = temperatures[0];
int maxIndex = 0;

for (int i = 1; i < temperatures.length; i++) {
    if (temperatures[i] > maxTemp) {
        maxTemp = temperatures[i];
        maxIndex = i;
    }
}

System.out.println("Highest: " + maxTemp + " at index " + maxIndex);
```

## Finding Multiple Occurrences:
```java
// Find ALL indices where value equals max
for (int i = 0; i < temperatures.length; i++) {
    if (temperatures[i] == maxTemp) {
        System.out.println("Max at index: " + i);
    }
}
```

---

# SLIDE 14: Pattern 4 - Search and Extract

## Problem:
Find elements matching a condition, extract them

## Solution:
```java
int[] scores = {45, 92, 78, 55, 88, 60};
int threshold = 70;

System.out.print("Passing scores: ");
for (int score : scores) {
    if (score >= threshold) {
        System.out.print(score + " ");
    }
}
// Output: Passing scores: 92 78 88 60
```

## Count Matches:
```java
int passCount = 0;
for (int score : scores) {
    if (score >= threshold) {
        passCount++;
    }
}
```

## More Complex Condition:
```java
// Even numbers only
for (int num : scores) {
    if (num % 2 == 0) {
        System.out.print(num + " ");
    }
}
```

---

# SLIDE 15: Pattern 5 - Two-Pointer Technique

## Problem:
Compare elements from opposite ends

## Solution:
```java
int[] array = {1, 2, 3, 4, 5};
int left = 0;
int right = array.length - 1;

while (left < right) {
    System.out.println("Pair: " + array[left] + ", " + array[right]);
    left++;
    right--;
}
// Output: (1,5), (2,4), (3,3)
```

## Check if Palindrome:
```java
String word = "racecar";
char[] chars = word.toCharArray();
int left = 0, right = chars.length - 1;
boolean isPalindrome = true;

while (left < right) {
    if (chars[left] != chars[right]) {
        isPalindrome = false;
        break;
    }
    left++;
    right--;
}
```

## Real-World Use:
- Check palindromes
- Merge sorted arrays
- Partition arrays

---

# SLIDE 16: Pattern 6 - Sliding Window

## Problem:
Find contiguous subarray matching condition

## Sum of K Consecutive Elements:
```java
int[] array = {1, 2, 3, 4, 5};
int k = 3;

// Calculate sum of first window
int windowSum = 0;
for (int i = 0; i < k; i++) {
    windowSum += array[i];
}

int maxSum = windowSum;

// Slide the window
for (int i = k; i < array.length; i++) {
    windowSum = windowSum - array[i - k] + array[i];
    if (windowSum > maxSum) {
        maxSum = windowSum;
    }
}

System.out.println("Max sum of " + k + " elements: " + maxSum);
```

## Why Sliding Window?
- More efficient than recalculating each window
- O(n) instead of O(n·k)

---

# SLIDE 17: Pattern 7 - Prefix Sum / Cumulative Sum

## Problem:
Quickly calculate sum of any range

## Setup Prefix Array:
```java
int[] array = {3, 1, 4, 1, 5};
int[] prefix = new int[array.length + 1];
prefix[0] = 0;

for (int i = 0; i < array.length; i++) {
    prefix[i + 1] = prefix[i] + array[i];
}
// prefix = {0, 3, 4, 8, 9, 14}
```

## Query Range Sum:
```java
// Sum from index 1 to 3 (inclusive)
int rangeStart = 1, rangeEnd = 3;
int rangeSum = prefix[rangeEnd + 1] - prefix[rangeStart];
// = prefix[4] - prefix[1]
// = 9 - 3 = 6
```

## Benefit:
- Setup: O(n)
- Each query: O(1) instead of O(n)

---

# SLIDE 18: Pattern 8 - Rearrangement (Rotate/Reverse)

## Reverse Array:
```java
int[] array = {1, 2, 3, 4, 5};

// Using two pointers
int left = 0, right = array.length - 1;
while (left < right) {
    int temp = array[left];
    array[left] = array[right];
    array[right] = temp;
    left++;
    right--;
}
// Result: {5, 4, 3, 2, 1}
```

## Rotate Array Right by K:
```java
int[] array = {1, 2, 3, 4, 5};
int k = 2;  // Rotate right by 2

// After rotation: {4, 5, 1, 2, 3}
k = k % array.length;  // Handle k > length

// Move last k elements to front
// ... (implementation in code walkthrough)
```

## Real-World Use:
- Image transformations
- Data rearrangement
- Game mechanics

---

# SLIDE 19: Pattern 9 - Frequency Count

## Problem:
Track how often each value appears

## Solution Using Array (if integers 0-9):
```java
int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
int[] frequency = new int[10];  // For digits 0-9

for (int num : numbers) {
    frequency[num]++;
}

for (int i = 0; i < frequency.length; i++) {
    if (frequency[i] > 0) {
        System.out.println(i + " appears " + frequency[i] + " times");
    }
}
```

## Find Most Frequent:
```java
int maxFreq = 0;
int mostFrequent = 0;

for (int i = 0; i < frequency.length; i++) {
    if (frequency[i] > maxFreq) {
        maxFreq = frequency[i];
        mostFrequent = i;
    }
}
```

---

# SLIDE 20: Pattern 10 - Remove Duplicates (In-Place)

## Problem:
Remove duplicate values, return new size

## Solution:
```java
int[] array = {1, 1, 2, 2, 2, 3, 4, 4};
int newSize = 1;  // At least 1 unique element

for (int i = 1; i < array.length; i++) {
    if (array[i] != array[i - 1]) {
        array[newSize] = array[i];
        newSize++;
    }
}

System.out.println("Array: " + Arrays.toString(array));
System.out.println("New size (unique count): " + newSize);
// Result: [1, 2, 3, 4, ...] with newSize=4
```

## Key Point:
- Input array must be sorted
- Modifies array in-place (no extra array)
- Returns count of unique elements

---

## End of Part 2 Slides

**Key Takeaways:**
1. Arrays store multiple values of same type
2. Arrays are indexed 0 to length-1
3. 2D/3D arrays for multi-dimensional data
4. Master common patterns (search, sort, count, etc.)
5. Two-pointer and sliding window for efficiency
6. Linear search for unsorted, binary search for sorted

**Pattern Reference:**
1. Count occurrences
2. Accumulate (sum/product)
3. Find max/min with index
4. Search and extract
5. Two-pointer technique
6. Sliding window
7. Prefix sum
8. Rearrangement
9. Frequency count
10. Remove duplicates

**Next Session:** Moving into more advanced Java topics (Object-Oriented Programming)
