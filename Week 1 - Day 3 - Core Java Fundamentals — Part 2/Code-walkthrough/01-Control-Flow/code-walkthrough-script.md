# Code Walkthrough Script - Part 1: Control Flow

## Overview
Part 1 covers conditional statements (if/else, switch) and loop structures (for, while, do-while, enhanced for, break/continue).

---

## Section 1: Conditional Statements (If-Else & Switch)

### IfElseDemo.java (40 minutes)

**Key Teaching Points:**
- if/else is used for binary decisions
- if-else if-else handles multiple conditions
- Nested if for complex logic
- Logical operators (&&, ||, !) for combining conditions
- Ternary operator as shorthand for simple if-else
- Boolean return simplification

**Walkthrough:**
1. Run `IfElseDemo` - show all 7 examples
2. Example 1: Simple if (only checks one condition)
3. Example 2: if-else (two paths)
4. Example 3: if-else if-else (multiple paths) - ask which branch executes first
5. Example 4: Nested if (validating login) - discuss order of checks
6. Example 5: Logical operators - show how && and || work
7. Example 6: Ternary operator - show it's alternative to simple if-else
8. Example 7: Boolean return pattern - common mistake students make

**Discussion Points:**
- When to use if-else vs switch
- Order matters in if-else if chains (first true wins)
- De Morgan's laws: !(a && b) = !a || !b

---

### SwitchStatementDemo.java (30 minutes)

**Key Teaching Points:**
- switch is better for many exact matches
- Each case needs break (unless fall-through intended)
- Default case is optional but recommended
- Switch with String is common
- Fall-through behavior for grouping cases
- Switch expression (Java 14+) is more concise

**Walkthrough:**
1. Example 1: Basic switch with integers (day of week)
2. Example 2: Switch with String (country capitals)
3. Example 3: Fall-through for grouping (vowels)
4. Example 4: Multiple cases sharing logic (seasons)
5. Example 5: Switch expression syntax (newer, cleaner)
6. Example 6: Common mistake - missing break creates fall-through

**Discussion Points:**
- Break behavior: what happens without it?
- Switch vs if-else: when to use each?
- Performance: switch is often faster than many if-else chains

---

## Section 2: Loop Structures

### ForLoopDemo.java (45 minutes)

**Key Teaching Points:**
- for loop has three parts: initialization, condition, increment
- Traditional for loop best when you need index
- Can increment by any amount (not just 1)
- Nested loops for multi-dimensional problems
- Break exits loop, continue skips to next iteration

**Walkthrough:**
1. Example 1: Basic counting (1 to n)
2. Example 2: Step increment (every 2nd number)
3. Example 3: Counting backwards
4. Example 4: Nested loops - multiplication table (shows O(n²))
5. Example 5: Pattern drawing with nested loops
6. Example 6: Iterating over array with index
7. Example 7: Multiple variables in for loop
8. Example 8: Factorial calculation
9. Example 9: String building in loop
10. Example 10: Break to exit early

**Discussion Points:**
- Loop anatomy: what would happen if condition is missing?
- Index starting at 0: why? (off-by-one errors)
- Nested loops grow complexity quickly

---

### WhileLoopDemo.java (35 minutes)

**Key Teaching Points:**
- while loop checks condition first (may not execute at all)
- while is best when you don't know loop count in advance
- while(true) + break is common pattern
- Continue skips to next iteration
- Infinite loops are dangerous

**Walkthrough:**
1. Example 1: Simple while loop
2. Example 2: While with false condition (doesn't execute)
3. Example 3: User input validation pattern
4. Example 4: Process until condition (event-driven)
5. Example 5: Processing array
6. Example 6: Search with break
7. Example 7: Skip with continue
8. Example 8: Nested while loops
9. Example 9: Digit sum calculation
10. Example 10: Complex conditions

**Discussion Points:**
- while vs for: when to use each?
- Infinite loops: how to avoid them?
- Counter variable still needed with while

---

### DoWhileLoopDemo.java (25 minutes)

**Key Teaching Points:**
- do-while executes at least once (condition checked after)
- Perfect for input validation / menu loops
- Rarely used compared to while
- Difference from while: check when it matters

**Walkthrough:**
1. Example 1: Simple do-while
2. Example 2: Executes once even if condition is false
3. Example 3: Menu pattern (common real-world use)
4. Example 4: Compare all three loops (same logic)
5. Example 5: False condition demonstrates at-least-once
6. Example 6-10: Various use cases

**Discussion Points:**
- When would you NEED do-while vs while?
- Real example: do-while for user menu (gets input first)

---

### EnhancedForLoopDemo.java (25 minutes)

**Key Teaching Points:**
- Enhanced for (for-each) simplifies iteration
- No index access (limitation)
- Works with arrays and collections
- Cleaner, less error-prone than traditional for

**Walkthrough:**
1. Example 1-3: Basic usage with arrays
2. Example 4-5: Summing and finding max
3. Example 6: Works with ArrayList
4. Example 7: Limitation - no index
5. Example 8-10: Various data types
11. Example 13: When to use enhanced for vs traditional for

**Discussion Points:**
- When you CAN'T use enhanced for
- Enhanced for is syntactic sugar for traditional for
- No off-by-one errors with enhanced for

---

### BreakContinueDemo.java (30 minutes)

**Key Teaching Points:**
- break exits loop immediately
- continue skips to next iteration
- In nested loops: break/continue affect inner loop only
- Labels allow breaking outer loops
- Practical use: search with early exit, skip invalid data

**Walkthrough:**
1. Example 1: Break - find value and exit
2. Example 2: Continue - skip even numbers
3. Example 3-4: Behavior in nested loops
4. Example 5-6: Labels for outer control (advanced)
5. Example 7-8: In while/do-while
6. Example 9-10: Practical use cases
7. Example 11-12: Special cases

**Discussion Points:**
- Break/continue make code harder to follow (use sparingly)
- Labels are rarely used in practice
- Early exit optimization (break from search)

---

## Summary & Connections

- **Conditionals** direct program flow (if/else, switch)
- **Loops** repeat code (for, while, do-while, enhanced for)
- **Break/Continue** control loop behavior
- **Nested structures** solve complex problems but increase complexity

**Real-world patterns:**
- Validating user input (while with continue)
- Searching arrays (for with break)
- Processing collections (enhanced for)
- Menu systems (do-while)
- Sorting/patterns (nested for loops)

---

## Classroom Activity Suggestions

1. **Trace execution**: Given code, students predict output
2. **Convert loops**: Change for to while, while to for-each
3. **Fix infinite loops**: Given broken code, identify and fix
4. **Pattern matching**: Identify which loop/conditional fits each problem
5. **Debug exercises**: Find logical errors in control flow

---

## Common Student Mistakes

1. Off-by-one errors with array indices
2. Missing break in switch (fall-through)
3. Infinite loops (wrong condition)
4. Confusion between continue and break
5. Nested loop complexity
6. Using for when while is better
7. Trying to use index with enhanced for

---

## Connection to Next Topics

- Control flow is prerequisite for all algorithms
- Loops are basis for working with arrays/collections
- These patterns appear in every program
- Understanding break/continue helps with exception handling later
