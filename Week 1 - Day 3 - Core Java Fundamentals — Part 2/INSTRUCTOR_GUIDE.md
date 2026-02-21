# Week 1 - Day 3: Core Java Fundamentals (Part 2) - Instructor Guide

## Quick Start for Instructors

Welcome! This guide contains everything you need to teach Week 1 - Day 3 - Core Java Fundamentals Part 2. Today covers **Control Flow** (Part 1) and **Arrays & Programming Patterns** (Part 2). This is a high-engagement day with lots of coding and visual patterns.

---

## Folder Structure

```
Week 1 - Day 3 - Core Java Fundamentals — Part 2/
├── Slides 1/                          (Control Flow)
│   ├── slide-descriptions.md          (22 slides visual content)
│   └── speaking-script.md             (Complete script for delivery)
├── Slides 2/                          (Arrays & Patterns)
│   ├── slide-descriptions.md          (20 slides visual content)
│   └── speaking-script.md             (Complete script for delivery)
├── Code-walkthrough/
│   ├── 01-Control-Flow/
│   │   ├── code-walkthrough-script.md
│   │   ├── IfElseDemo.java
│   │   ├── SwitchStatementDemo.java
│   │   ├── ForLoopDemo.java
│   │   ├── WhileLoopDemo.java
│   │   ├── DoWhileLoopDemo.java
│   │   ├── EnhancedForLoopDemo.java
│   │   └── BreakContinueDemo.java
│   └── 02-Arrays-and-Patterns/
│       ├── code-walkthrough-script.md
│       ├── ArrayBasicsDemo.java
│       ├── MultiDimensionalArrayDemo.java
│       ├── SearchAndSortDemo.java
│       └── CommonPatternsDemo.java
├── Exercises/
│   ├── Exercise 01/ - Grade Calculator (if-else)
│   ├── Exercise 02/ - Day of Week (switch)
│   ├── Exercise 03/ - Guessing Game (while, break)
│   ├── Exercise 04/ - Multiplication Table (nested loops)
│   ├── Exercise 05/ - Prime Checker (loop optimization)
│   ├── Exercise 06/ - Pyramid Printer (nested loops, patterns)
│   ├── Exercise 07/ - Array Statistics (min/max/avg)
│   ├── Exercise 08/ - Linear Search
│   ├── Exercise 09/ - Bubble Sort
│   └── Exercise 10/ - Grade Distribution Analysis (comprehensive)
├── INSTRUCTOR_GUIDE.md                (This file)
└── COMPLETENESS_CHECKLIST.md          (Verification checklist)
```

---

## Daily Flow

### Part 1: Control Flow (Morning Session - ~2 hours)

**Time Allocation:**

1. **Slides 1 (45-50 minutes)**
   - Slides 1-3: Welcome, what is control flow (5 min)
   - Slides 4-9: Conditionals (if/else/if-else if/nested/ternary) (15 min)
   - Slides 10-11: Switch statements (10 min)
   - Slides 12-18: Loops intro & for loop anatomy (15 min)
   - Slides 19-22: Loop control & best practices (10 min)

2. **Code Walkthrough (40-50 minutes)**
   - **LIVE DEMO** (5 min): IfElseDemo.java (show multiple branches)
   - **LIVE DEMO** (5 min): SwitchStatementDemo.java (show fall-through)
   - **LIVE DEMO** (10 min): ForLoopDemo.java (counting, patterns)
   - **LIVE DEMO** (5 min): BreakContinueDemo.java (show difference)
   - Others: Can assign as homework/review

3. **Exercises 1-3 (30-40 minutes)**
   - Ex 01: Grade Calculator (if-else) (10 min)
   - Ex 02: Day of Week (switch) (10 min)
   - Ex 03: Guessing Game (while/break) (15 min)

**Part 1 Total: 115-140 minutes (2-2.5 hours)**

---

### Part 2: Arrays & Patterns (Afternoon Session - ~2.5 hours)

**Time Allocation:**

1. **Slides 2 (50-60 minutes)**
   - Slides 1-3: What are arrays, basics (10 min)
   - Slides 4-6: Multi-dimensional, jagged, 3D arrays (10 min)
   - Slides 7-10: Common operations & searching (15 min)
   - Slides 11-20: 10 Programming patterns (25 min)

2. **Code Walkthrough (40-50 minutes)**
   - **LIVE DEMO** (10 min): ArrayBasicsDemo.java (iteration methods)
   - **LIVE DEMO** (10 min): SearchAndSortDemo.java (linear/binary search, bubble sort)
   - **LIVE DEMO** (15 min): CommonPatternsDemo.java (2-3 key patterns)
   - Others: Can assign as pre-recorded or review

3. **Exercises 4-10 (45-60 minutes)**
   - Ex 04: Multiplication Table (15 min)
   - Ex 05: Prime Checker (15 min)
   - Ex 06: Pyramid Printer (15 min)
   - Ex 07-10: Can be assigned as homework with office hours for Q&A

**Part 2 Total: 135-170 minutes (2.25-2.75 hours)**

---

## Key Teaching Points - Part 1: Control Flow

### If-Else Statements
- **Key Insight**: Decision points; exactly one path always executes
- **Common Confusion**: Forgetting curly braces, confusing == with =
- **Checkpoint Question**: "What's the difference between if-else and two separate ifs?"
  - Answer: If-else guarantees one path; two ifs could execute both (or neither)
- **Live Coding**: Show the multiplication problem with two separate ifs

### Switch Statements
- **Key Insight**: Only for exact value matching, not ranges
- **Critical Warning**: MUST include break; statements (or fall-through intentionally)
- **Common Confusion**: Students forget the break, causing fall-through
- **Checkpoint Question**: "When should you use switch vs if-else?"
  - Answer: Switch for fixed values; if-else for ranges/complex conditions
- **Live Demo**: Show fall-through bug, then fix with break

### Loops - The For Loop
- **Key Insight**: Three-part header: initialization, condition, update
- **Most Common Mistake**: Off-by-one errors (<=  vs <)
- **Checkpoint Question**: "For array of length 5, what's the last valid index?"
  - Answer: Index 4, so use i < array.length, NOT i <= array.length
- **Live Coding**: Iterate backwards (i--), skip by N (i += 2)

### Loops - While and Do-While
- **Key Insight**: While for unknown iterations; do-while for at-least-once
- **Common Confusion**: When condition is checked (start vs end)
- **Checkpoint Question**: "When would you use do-while?"
  - Answer: Menu systems, input validation, at-least-once scenarios
- **Warning**: Infinite loops! Show while(true) problem

### Break and Continue
- **Key Insight**: Break exits loop; continue skips iteration
- **Common Mistake**: Confusing the two
- **Demonstration**: Show how they behave differently in nested loops
  - Break only breaks innermost loop
  - Continue only skips innermost loop

### Nested Loops
- **Key Insight**: Complexity multiplies (N×M iterations for N outer, M inner)
- **Warning**: Deep nesting (3+ levels) is a code smell
- **Checkpoint Question**: "How many total iterations for nested loops 10×10?"
  - Answer: 100 iterations

---

## Key Teaching Points - Part 2: Arrays & Patterns

### Array Basics
- **Key Insight**: Zero-indexed, fixed-size, same type
- **Most Critical Mistake**: Off-by-one errors
  - Array of length 5: indices 0-4
  - Loop condition: i < array.length (NOT <=)
- **Checkpoint Question**: "What's array[array.length]?"
  - Answer: ArrayIndexOutOfBoundsException

### Multi-Dimensional Arrays
- **Key Insight**: Arrays of arrays; visualization helps
- **Mental Model**: Rows and columns (like spreadsheet)
- **Common Confusion**: Jagged arrays (rows can be different lengths)
- **Checkpoint Question**: "How many elements in int[3][4]?"
  - Answer: 12 total (3 rows × 4 columns)

### Pattern 1-5: Basic Patterns
- **Count**: Loop, check condition, increment counter
- **Accumulate**: Initialize identity element, update in loop
- **Max/Min**: Initialize to first element, compare rest
- **Search**: Loop until found, return index or -1
- **Two-Pointer**: Compare from opposite ends

### Pattern 6-10: Advanced Patterns
- **Sliding Window**: Efficient subarray processing
- **Prefix Sum**: Precompute for fast range queries
- **Rearrangement**: Rotate, reverse using two pointers
- **Frequency Count**: Track occurrences using index or count variable
- **Remove Duplicates**: In-place modification, sorted prerequisite

---

## Running the Code Examples

### Setup (Before Class)
```bash
# Create demo directory
mkdir -p ~/demo/Week1Day3
cd ~/demo/Week1Day3

# Copy all examples
cp /path/to/Code-walkthrough/01-Control-Flow/*.java ./
cp /path/to/Code-walkthrough/02-Arrays-and-Patterns/*.java ./

# Compile everything
javac *.java
```

### Part 1: Control Flow Demos
```bash
# If-Else demo
java IfElseDemo

# Switch demo
java SwitchStatementDemo

# For loop demo (various patterns)
java ForLoopDemo

# Break and Continue
java BreakContinueDemo

# Enhanced for loop
java EnhancedForLoopDemo
```

### Part 2: Array Demos
```bash
# Array basics
java ArrayBasicsDemo

# Multi-dimensional
java MultiDimensionalArrayDemo

# Search and Sort
java SearchAndSortDemo

# Patterns
java CommonPatternsDemo
```

---

## Interactive Moments & Engagement

### During Control Flow (Part 1)

**After Slides 5-6 (If-Else)**
- **Activity**: "Fix the bug"
  - Show code with two separate if statements that should be if-else
  - Ask students to spot the problem
  - Run it and show unexpected behavior

**After Slides 10-11 (Switch)**
- **Prediction Game**: Before running SwitchStatementDemo
  - Show intentional fall-through code
  - Ask: "How many times does 'Day found' print?"
  - Run it and surprise them with fall-through behavior
  - Discuss when fall-through is intentional vs bug

**After Slides 13-15 (For Loop Anatomy)**
- **Challenge**: "Write the loop"
  - Describe pattern: "Print 2, 4, 6, 8... 20"
  - Let students code it (5 min)
  - Show solution: `for(int i=2; i<=20; i+=2)`

**After Slides 19-22 (Break/Continue)**
- **Spot the Difference**:
  - Run two similar loops, one with break, one with continue
  - Ask students: "What's the difference in output?"
  - Explain and reinforce

### During Arrays (Part 2)

**After Slides 2-3 (Array Basics)**
- **Activity**: "Calculate the index"
  - Array of 5 elements: What's the last valid index?
  - Array of 100 elements: Loop condition?
  - Why does this cause bugs?

**After Slides 7-10 (Searching & Sorting)**
- **Efficiency Challenge**:
  - Array of 1,000,000 elements
  - Linear search: up to 1,000,000 comparisons
  - Binary search: up to ~20 comparisons
  - Discuss why this matters

**After Slides 11-20 (10 Patterns)**
- **Pattern Recognition Game**:
  - Describe a problem
  - Students identify which pattern(s) to use
  - Examples:
    - "Find the highest temperature" → Max pattern
    - "Add up all scores" → Accumulate pattern
    - "Check if word is palindrome" → Two-pointer pattern

---

## Exercise Delivery Strategy

### Exercises 1-3 (Control Flow)

**Exercise 01: Grade Calculator**
- **Time**: 10-15 min
- **Challenge Level**: Easy
- **Teaching Value**: Reinforces if-else if-else chaining
- **Tips**: Some students might struggle with >= operators

**Exercise 02: Day of Week**
- **Time**: 10-15 min
- **Challenge Level**: Easy-Medium
- **Teaching Value**: Reinforces switch and break
- **Tips**: Watch for students forgetting break statements

**Exercise 03: Guessing Game**
- **Time**: 15-20 min
- **Challenge Level**: Medium
- **Teaching Value**: Combines loops, conditions, break, comparison
- **Tips**: Some might struggle with loop iteration and break placement

### Exercises 4-6 (Nested Loops & Patterns)

**Exercise 04: Multiplication Table**
- **Time**: 15-20 min
- **Challenge Level**: Medium
- **Teaching Value**: Nested loops, formatting, spacing
- **Tips**: Printf formatting might be new to some; show examples

**Exercise 05: Prime Checker**
- **Time**: 15-20 min
- **Challenge Level**: Medium-Hard
- **Teaching Value**: Algorithm efficiency (√N optimization), loops
- **Tips**: Discuss why checking up to √N works

**Exercise 06: Pyramid Printer**
- **Time**: 15-20 min
- **Challenge Level**: Medium
- **Teaching Value**: Nested loops, pattern visualization
- **Tips**: Celebrate the visual success when patterns work!

### Exercises 7-10 (Arrays)

**Exercise 07: Array Statistics**
- **Time**: 15-20 min
- **Challenge Level**: Medium
- **Teaching Value**: Min/max patterns, averaging, iteration
- **Tips**: Emphasize initializing min to first element, not to 0

**Exercise 08: Linear Search**
- **Time**: 10-15 min
- **Challenge Level**: Easy-Medium
- **Teaching Value**: Array searching, index returns
- **Tips**: Show the difference between -1 (not found) and index

**Exercise 09: Bubble Sort**
- **Time**: 15-20 min
- **Challenge Level**: Medium
- **Teaching Value**: Sorting algorithm, nested loops, swapping
- **Tips**: Show the "bubbling" of largest element to end each pass

**Exercise 10: Grade Distribution**
- **Time**: 25-35 min
- **Challenge Level**: Hard
- **Teaching Value**: Comprehensive (multiple patterns, helper methods, statistics)
- **Tips**: Can include helper methods (getLetterGrade, printDistribution)
- **Bonus**: Discuss sorting grades before finding median

---

## Common Student Mistakes & How to Address

### Control Flow Mistakes

**Mistake 1: Off-by-one errors in loops**
```java
// WRONG
for (int i = 0; i <= array.length; i++) {
    System.out.println(array[i]);  // ArrayIndexOutOfBounds on last iteration
}

// CORRECT
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}
```
**Fix**: Drill this repeatedly. Show the off-by-one error running and crashing.

**Mistake 2: Forgetting break in switch**
```java
// WRONG - falls through!
switch(day) {
    case 1: System.out.println("Monday");
    case 2: System.out.println("Tuesday");  // BOTH print if day==1!
}

// CORRECT
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
}
```
**Fix**: Show the fall-through happening, then add breaks.

**Mistake 3: Confusing break and continue**
```java
// WRONG - break exits loop, doesn't skip
for(int i=1; i<=5; i++) {
    if(i==3) break;  // Exits loop entirely!
}

// CORRECT for skipping
for(int i=1; i<=5; i++) {
    if(i==3) continue;  // Skips to next iteration
}
```
**Fix**: Visual comparison showing different outputs.

**Mistake 4: Infinite loops**
```java
// WRONG
while(true) {
    System.out.println("Help!");
    // No way to exit!
}

// CORRECT
while(condition) {
    // ...
    condition = false;  // Eventually false
}
```
**Fix**: Show Ctrl+C to kill infinite loop, explain why it happened.

### Array Mistakes

**Mistake 5: Initializing min/max to wrong value**
```java
// WRONG
int min = 0;  // What if all numbers are > 0? min will be 0!
for(int num : array) {
    if(num < min) min = num;
}

// CORRECT
int min = array[0];  // Initialize to first element
for(int num : array) {
    if(num < min) min = num;
}
```
**Fix**: Show actual data where this fails (e.g., [15, 20, 25]).

**Mistake 6: Forgetting array initialization**
```java
// WRONG
int[] array;
array[0] = 5;  // NullPointerException!

// CORRECT
int[] array = new int[5];
array[0] = 5;
```
**Fix**: Show the error message and explain new keyword.

**Mistake 7: Confusing array.length**
```java
// WRONG
String[] names = {"Alice", "Bob", "Charlie"};
System.out.println(names.length());  // NO! length is a property, not method

// CORRECT
System.out.println(names.length);
```
**Fix**: Show the compilation error for using ().

---

## Pacing Tips

### If running slow:
- Skip some code walkthrough examples (they can do as homework)
- Shorten Exercise 5-6 introduction
- Skip advanced sorting algorithms, focus on bubble sort

### If running fast:
- Dive into Pattern Recognition game for all 10 patterns
- Have students code additional variations (reverse pyramid, diamond, etc.)
- Discuss Big-O complexity for search algorithms
- Introduce binary search as bonus

---

## Q&A Anticipation

**Q: "Why do we have so many loop types?"**
A: Different scenarios. for = known iterations, while = unknown, do-while = at-least-once, enhanced for = simple iteration.

**Q: "Can I use continue in a switch?"**
A: No, switch isn't a loop. Continue is for loops only.

**Q: "What if I need to break out of nested loops?"**
A: Use a flag variable or restructure code. You can't break out of outer loop directly from inner loop.

**Q: "Why not just use ArrayList instead of arrays?"**
A: Arrays are simpler, faster, foundational. ArrayList built on top of arrays. Master arrays first!

**Q: "Is bubble sort used in real code?"**
A: No, Java's Arrays.sort() uses better algorithms (TimSort). But bubble sort teaches the concept.

---

## Assessment Strategies

### Quick Checks (During Class)
1. Ask students to predict loop output before running
2. Have them identify the pattern for a new problem
3. Ask: "Would this need break or continue?"

### Exercise Checkpoints
- Exercises 1-3: Students should complete by end of Part 1
- Exercises 4-6: 2-3 should be done by end of Part 2
- Exercises 7-10: Can be homework with guidance

### Homework Opportunities
- Complete any exercises not finished in class
- Add enhancements (e.g., backward pyramid, diamond pattern)
- Research Big-O complexity for sorting
- Pre-read Week 1 Day 4 (OOP concepts)

---

## Extensions & Challenges

### For Advanced Students

**Challenge 1**: "Optimize the prime checker"
- Current: Loop to √N
- Optimize: Skip even numbers after 2

**Challenge 2**: "Reverse and Palindrome"
- Create a program that reverses an array
- Check if it's a palindrome

**Challenge 3**: "Selection Sort"
- Implement selection sort (more efficient than bubble sort)

**Challenge 4**: "Two-Pointer Techniques"
- Find pair of numbers that sum to target
- Reverse array in-place

---

## Resources for Instructors

### Visualization Tools
- Visualgo.net - Algorithm visualizations (sorts, searches)
- Pythontutor.com - Step-through execution (Java compatible)

### Additional Reading
- Big-O Cheat Sheet: Time/space complexity for algorithms
- GeeksforGeeks: Algorithm explanations with interactive code

### Next Session (Week 1 Day 4)
- Transition into OOP
- Review: Control flow and arrays as foundations
- Preview: Classes, objects, and methods

---

## Troubleshooting Common Technical Issues

### Issue: Java not found
```bash
# Check if Java installed
java -version

# If not, install JDK
# Mac: brew install openjdk
# Windows: Download from java.com or oracle.com
```

### Issue: File not found when compiling
```bash
# Make sure in correct directory
pwd
ls *.java

# Compile all
javac *.java
```

### Issue: Class not found when running
```bash
# Class name must match filename and be public
# File: GradeCalculator.java must have:
public class GradeCalculator {
```

---

## Attendance & Notes

**Remember to:**
- Take attendance at start of Part 1 and Part 2
- Note any students struggling with concepts
- Send class notes within 24 hours
- Record session if possible for review

---

**Last Updated**: February 21, 2026
