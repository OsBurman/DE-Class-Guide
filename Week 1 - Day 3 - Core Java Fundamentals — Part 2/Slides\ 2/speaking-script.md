# Week 1 Day 3 - Part 2: Arrays and Programming Patterns
## Speaking Script (20 slides)

---

# SLIDE 1: Title Slide - Arrays and Patterns

**Speaker Notes:**
Welcome to Part 2 of Core Java Fundamentals. We've covered control flow - how to make decisions and repeat code. Now we're moving into one of the most fundamental data structures in programming: arrays.

Arrays are where you start processing collections of data. Instead of having ten different variables, you have one array with ten elements. This makes code cleaner, more efficient, and more scalable.

By the end of this session, you'll understand how arrays work, how to manipulate them efficiently, and you'll learn ten common programming patterns that solve real-world problems. These patterns are like tools in a toolbox - once you know them, you'll recognize when to use them.

---

# SLIDE 2: What are Arrays?

**Speaker Notes:**
An array is a container that holds multiple values of the same type. It's like a series of boxes in a row, each containing a value.

The key aspects: first, all elements must be the same type. You can have an array of integers, an array of Strings, an array of doubles, but you can't mix types in one array. Second, elements are accessed by index, starting from 0. This is critical - arrays are zero-indexed. The first element is at index 0, not 1.

Arrays have a fixed size. When you create an array of 5 elements, it always has exactly 5 elements. You can't add a 6th element later. This is different from other data structures like ArrayList which we'll see later.

Look at the code examples. When you declare an int array, all elements default to 0. When you declare a boolean array, all default to false. When you declare a String array, all default to null.

The most common error with arrays is the off-by-one error - trying to access an index that doesn't exist. If your array has 5 elements, valid indices are 0, 1, 2, 3, 4. Index 5 doesn't exist and will cause a runtime error.

---

# SLIDE 3: Array Basics - Access and Iteration

**Speaker Notes:**
To access an array element, use square brackets with the index. array[0] gets the first element, array[2] gets the third, and so on.

You can also get the length of the array with array.length. Notice this is a property, not a method - there are no parentheses. array.length tells you how many elements the array has.

The most common mistake beginners make is the off-by-one error with the loop condition. If your array has 5 elements, the last valid index is 4. So you want to loop while i < array.length, not i <= array.length. If you use <=, you'll try to access index 5 when array.length is 5, and that's an error.

I show three ways to iterate through an array. The traditional for loop is most common because it gives you the index. The enhanced for loop (for-each) is cleaner when you don't need the index. The while loop is less common but occasionally useful.

Choose based on what you need. If you need the index to modify elements or know the position, use traditional for. If you're just reading values, use for-each - it's clearer and you can't accidentally go out of bounds.

---

# SLIDE 4: Multidimensional Arrays - 2D Arrays

**Speaker Notes:**
A 2D array is an array of arrays. It represents a grid or table structure, like a spreadsheet.

When you declare a 2D array, you specify two dimensions: rows and columns. A 3x4 array has 3 rows and 4 columns, for a total of 12 elements.

To access a 2D array element, you need two indices: the row and the column. matrix[0][0] is the top-left corner, matrix[2][3] is the bottom-right corner in a 3x4 array.

Most commonly, you'll use nested for loops to iterate through a 2D array. The outer loop iterates rows, the inner loop iterates columns within each row. This is exactly like reading a book: you go through each line (row), and within each line you read each word (column).

One important detail: after printing all columns in a row, you often want a newline to move to the next row. Otherwise all the elements print on one line and it's hard to visualize the grid.

The visualization at the end shows the index notation clearly. This is a 3x3 grid. Notice the row index is first, column index is second: matrix[row][col].

---

# SLIDE 5: Jagged Arrays

**Speaker Notes:**
A jagged array is a 2D array where rows have different lengths. It's less common than a regular 2D array, but useful in certain situations.

In a regular 2D array, all rows are the same length. In a jagged array, each row can be a different length. Row 0 might have 2 elements, row 1 might have 5 elements, row 2 might have 3 elements.

Why would you use this? Mainly to save memory when your data naturally has rows of different sizes. For example, if you're storing student grades by subject, and different students take different numbers of subjects, a jagged array is perfect.

When iterating a jagged array, you must check the length of each row individually. You can't assume all rows have the same length. That's why in the loop, the inner condition is "col < jagged[row].length" - each row defines its own length.

This is less commonly used than regular 2D arrays, but it's good to know it exists and when to use it.

---

# SLIDE 6: 3D Arrays (Higher Dimensions)

**Speaker Notes:**
If 2D arrays are tables, 3D arrays are cubes. They represent three-dimensional data.

You can technically create arrays of even higher dimensions (4D, 5D, etc.), but 3D is usually the practical limit. Beyond that, your code becomes hard to understand.

Each access requires three indices: layer, row, column. 3D arrays require three nested loops to iterate completely.

A real-world example: a 3D chess game might use a 3D array to represent multiple chess boards stacked on top of each other. Each board is 8x8, and there might be 3 such boards. That's a 3x8x8 array.

The complexity increases with each dimension. Iterating a 3D array with dimensions n×m×k requires n×m×k iterations. This can get computationally expensive quickly.

In practice, you'll mostly work with 1D and 2D arrays. 3D and higher are used in specialized domains like graphics, scientific computing, and game development.

---

# SLIDE 7: Common Array Operations

**Speaker Notes:**
Some operations you'll do over and over with arrays. Let's look at the most common ones.

Finding the minimum value: initialize min to the first element, then iterate through the rest, updating min whenever you find a smaller value. Notice we start the loop at index 1, not 0, because we already "processed" index 0 by using it as the initial min.

Finding maximum is the same pattern, but you're looking for larger values instead of smaller.

Sum and average: initialize sum to 0, add all elements to it, then divide by the count. Note the cast to double - if you don't cast, you get integer division and lose the decimal part.

Comparing arrays: the Arrays.equals() method compares two arrays element by element. It returns true only if both arrays have the same length and all elements are equal. Don't use == with arrays - that checks if they're the same object in memory, not if they have the same values.

These operations form the building blocks for more complex algorithms.

---

# SLIDE 8: Searching Fundamentals

**Speaker Notes:**
Linear search is the basic search algorithm. You start at one end and check each element until you find the target or reach the end.

It's simple but not efficient. If you have a million elements and you're unlucky, you might have to check all a million. On average, you'll check half of them.

Here's the algorithm: loop through the array, compare each element to the target, if it matches, return that index. If you finish the loop without finding it, return -1 (a common convention meaning "not found").

The advantage of linear search: works on unsorted data. The disadvantage: slow for large arrays.

When do you use linear search? For small arrays, or when the data isn't sorted. For large sorted arrays, you should use binary search, which is much faster.

---

# SLIDE 9: Binary Search

**Speaker Notes:**
Binary search is dramatically faster than linear search, but it requires one critical thing: the array must be sorted.

The idea: if the array is sorted, you can eliminate half the remaining elements with each comparison. Start in the middle. Is the target in the middle? No. Is it greater or less than the middle? If it's greater, the target must be in the right half, so forget the left half. If it's less, the target must be in the left half. Repeat with the remaining half.

This cuts the search space in half each time. For a million elements, linear search might need a million comparisons. Binary search needs only about 20.

The algorithm uses two pointers, left and right, that narrow the search space. We calculate the midpoint, check that element, and update left or right based on whether the target is greater or less.

Java provides Arrays.binarySearch() which does this for you. But understanding how it works is important.

Critical requirement: the array must be sorted. If it's not sorted, binary search gives wrong results. Always sort first if needed.

---

# SLIDE 10: Sorting Algorithms

**Speaker Notes:**
Sorting is a fundamental operation. You'll do it all the time. Let me show you three algorithms: bubble sort, selection sort, and the built-in sort.

Bubble sort is the simplest but slowest. The idea is simple: compare adjacent elements, swap if they're in the wrong order, repeat until sorted. It's called "bubble" because larger values "bubble" to the end.

Selection sort is slightly more efficient. The idea: find the smallest element, move it to the front, then find the smallest in the remaining elements, and so on.

Both are O(n²), meaning for 1000 elements, they do roughly a million operations. They're fine for learning, but for production code, you use Arrays.sort().

Arrays.sort() uses an efficient algorithm under the hood (Java 7 and later uses Tim Sort, which is a hybrid of merge sort and insertion sort). It's O(n log n) on average, which is much faster.

For the quiz: understand how bubble sort works, be able to trace through it. For production: always use Arrays.sort(). There's no reason to implement your own sorting - the built-in is tested, optimized, and you have a thousand other things to worry about.

---

# SLIDE 11: Pattern 1 - Count Occurrences

**Speaker Notes:**
This is a super common pattern. You want to know how many times a value appears in an array.

Initialize a counter to 0. Loop through the array. If each element matches the target, increment the counter. After the loop, the counter tells you how many times the target appeared.

Real-world examples: counting votes, analyzing data frequencies, quality control (how many defective items?), web analytics (how many times was this page viewed?).

This is dead simple, but it's the foundation for frequency analysis and other statistical operations.

---

# SLIDE 12: Pattern 2 - Accumulate (Sum, Product)

**Speaker Notes:**
Another super common pattern. You want to combine all elements into a single result.

The three main accumulations are sum, product, and concatenation.

For sum: initialize to 0 (the identity for addition), then add each element.

For product: initialize to 1 (the identity for multiplication), then multiply each element.

For concatenation: initialize to empty string, then concatenate each word.

Why these initial values? Because they don't change the result. 0 + anything = anything. 1 × anything = anything. "" + anything = anything. These are called "identity elements."

Real-world: calculating total sales, calculating compound interest (product of growth rates), combining log messages, etc.

---

# SLIDE 13: Pattern 3 - Find Max/Min with Index

**Speaker Notes:**
Sometimes you don't just want the maximum value, you want to know where it is in the array. Maybe you're tracking temperatures and want to know not just the highest temperature, but when it occurred.

Initialize both the max value and its index to the first element. Loop through the rest of the array. When you find a larger value, update both the value and the index.

If you need to find all indices where the maximum occurs (in case of ties), loop again and compare each element to the max.

This pattern is used in everything: finding the best score in a game, the worst performance in a system, the employee with the most sales, etc.

---

# SLIDE 14: Pattern 4 - Search and Extract

**Speaker Notes:**
You want to find elements matching a condition and extract them (or process them in some way).

The pattern is simple: loop through the array, if each element matches the condition, process it.

In the example, we're looking for passing scores (>= 70). We print them out. You might instead copy them to a new array, store them in a database, etc.

The condition can be anything: even numbers, negative numbers, strings containing certain text, objects with certain properties. The pattern is the same: loop, check condition, process if true.

This is fundamental for filtering data, which is something you'll do constantly in real programming.

---

# SLIDE 15: Pattern 5 - Two-Pointer Technique

**Speaker Notes:**
This is a clever technique where you use two pointers, one starting at the beginning of the array and one at the end, and you move them towards each other.

Why would you do this? Often you need to compare opposite ends of an array, or you need to do something symmetric.

In the example, we're printing pairs of elements from opposite ends. This might be used to check if the array is a palindrome - compare first with last, second with second-to-last, and so on.

The loop condition is "left < right" because when they meet or cross, you've compared all pairs.

Other uses: merge sorted arrays, partition arrays for quicksort, string reversal, checking for matching parentheses.

It's an elegant technique that shows up in many algorithms.

---

# SLIDE 16: Pattern 6 - Sliding Window

**Speaker Notes:**
Sliding window is an optimization technique when you need to examine contiguous subarrays.

Naive approach: for each possible window position, recalculate the sum. If the window size is k and the array has n elements, that's O(n·k) operations.

Sliding window: calculate the sum for the first window. Then, as you slide the window one position right, subtract the element that left the window and add the element that entered the window. This makes each step O(1), so total is O(n).

In the example, we're finding the maximum sum of 3 consecutive elements. We calculate the sum of the first three, then for each subsequent position, subtract the element that left and add the element that entered. This is much more efficient than recalculating the whole sum each time.

Real-world: analyzing continuous data (stock prices, sensor readings), finding contiguous subarrays with certain properties, etc.

---

# SLIDE 17: Pattern 7 - Prefix Sum / Cumulative Sum

**Speaker Notes:**
Prefix sum is a preprocessing technique. You do some setup work once, then queries are very fast.

Idea: create an array where each element is the sum of all elements before that point. Then, to get the sum of any range, it's just two lookups and a subtraction.

In the example, prefix[i] = sum of all elements from index 0 to i-1. To get the sum from index 1 to 3, it's prefix[4] - prefix[1] = 9 - 3 = 6.

Setup is O(n). Each query is O(1). If you need to do many range sum queries, this is way faster than recalculating each time.

This is used in competitive programming, data analysis, graphics (for 2D prefix sums to quickly calculate rectangle sums), etc.

---

# SLIDE 18: Pattern 8 - Rearrangement (Rotate/Reverse)

**Speaker Notes:**
Sometimes you need to rearrange array elements.

Reversing is straightforward: use two pointers from opposite ends, swap, move towards the middle.

Rotation is more complex. To rotate right by k, you need to move the last k elements to the front. There are multiple approaches - using a temporary array, or using a clever reversal approach.

The two-pointer swap is efficient and doesn't need extra space.

Real-world: image manipulation (rotate image), game board rotations, data transformations, etc.

---

# SLIDE 19: Pattern 9 - Frequency Count

**Speaker Notes:**
You want to track how often each value appears in an array.

If the values are a known range (like 0-9 digits), you can use an array where the index represents the value. Increment the frequency for each value as you see it.

After counting, you can find the most frequent element, or generate a frequency histogram.

This pattern is the basis for many algorithms and is used in data analysis, cryptography (frequency analysis of text), load balancing (frequency of each server), etc.

---

# SLIDE 20: Pattern 10 - Remove Duplicates (In-Place)

**Speaker Notes:**
The requirement is: remove duplicates from an array while modifying it in-place (no extra array created).

Critical prerequisite: the array must be sorted. This makes the algorithm simple - duplicates are adjacent.

The algorithm uses two pointers: one to track where to place the next unique element, one to scan through the array. When you find an element different from the previous one, it's unique - place it in the "write" position and advance the write pointer.

After the loop, the first "newSize" elements are unique and sorted. The rest of the array contains old data that we ignore.

This is a classic interview problem and appears in real code when dealing with deduplicated datasets.

---

## End of Speaking Script

**Key Learning Points:**
1. Arrays organize data for processing
2. Zero-indexing and off-by-one errors - watch for them
3. 2D and 3D arrays for multi-dimensional data
4. Master the 10 patterns - they solve most array problems
5. Linear search for unsorted, binary search for sorted
6. Use built-in Arrays.sort() for production code

**Pattern Reminders:**
- Count: tallying occurrences
- Accumulate: combining values (sum, product, etc.)
- Max/min with index: finding position of extreme values
- Search and extract: filtering data
- Two-pointer: comparing from opposite ends
- Sliding window: efficient subarray analysis
- Prefix sum: fast range queries
- Rearrange: moving elements around
- Frequency: tracking occurrences
- Remove duplicates: deduplication

**Next Steps:**
These patterns are building blocks for more complex algorithms. As you progress, you'll combine them in interesting ways to solve harder problems.

**Practice Reminder:**
Arrays seem simple, but mastery comes from practice. Write code. Make mistakes. Debug. Understand. That's how you become proficient.
