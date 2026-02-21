# Week 1 Day 3 - Part 1: Control Flow
## Slide Descriptions (22 slides)

---

# SLIDE 1: Title Slide - Control Flow

## Visual:
```
╔═══════════════════════════════════╗
║   CONTROL FLOW IN JAVA            ║
║   Making Decisions & Repetition   ║
║                                   ║
║   Week 1 - Day 3 - Part 1         ║
║   Core Java Fundamentals          ║
╚═══════════════════════════════════╝
```

---

# SLIDE 2: What is Control Flow?

## Definition:
**Control Flow** = The order in which statements execute in your program

## Without it: Programs are rigid
- Run same code every time
- Can't respond to different inputs
- Can't repeat actions

## With it: Programs are flexible
- Make decisions (if X, then do Y)
- Repeat actions (do this 5 times)
- Handle multiple paths

**Example:**
```
WITHOUT: Always print "Pass"
WITH: If score >= 60, print "Pass", else print "Fail"
```

---

# SLIDE 3: Two Categories of Control Flow

## 1️⃣ CONDITIONALS (Decision Making)
- if / else
- switch / case
- ternary operator

Used when: "Should I do this? Or that?"

## 2️⃣ LOOPS (Repetition)
- for loop
- while loop
- do-while loop
- enhanced for loop

Used when: "Do this N times"

**Visual:**
```
     CONDITIONALS (if/else)
            ↙️        ↘️
     Path A       Path B

     LOOPS (repeat)
     Do again → Again? → Again?
```

---

# SLIDE 4: Conditionals - If Statement

## Syntax:
```java
if (condition) {
    // Code runs if condition is TRUE
}
```

## Key Point:
- Condition must be BOOLEAN (true or false)
- If TRUE: execute block
- If FALSE: skip block

## Example:
```java
if (score >= 60) {
    System.out.println("You passed!");
}
```

**Visual:**
```
     score >= 60?
     /          \
   TRUE        FALSE
   ↓            ↓
  Run       Skip block
 block
```

---

# SLIDE 5: Conditionals - If-Else

## Syntax:
```java
if (condition) {
    // Code if TRUE
} else {
    // Code if FALSE
}
```

## Two Paths:
- If condition is TRUE: execute if-block
- If condition is FALSE: execute else-block
- ONE path always executes

## Example:
```java
if (score >= 60) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

**Visual:**
```
    score >= 60?
    /          \
  TRUE        FALSE
   ↓            ↓
 "Pass"       "Fail"
```

---

# SLIDE 6: Conditionals - If-Else If-Else

## Syntax:
```java
if (condition1) {
    // Path 1
} else if (condition2) {
    // Path 2
} else if (condition3) {
    // Path 3
} else {
    // Default path
}
```

## Key Points:
- First TRUE condition wins
- Remaining conditions skipped
- Default else is optional but recommended

## Example (Grade):
```java
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("F");
}
```

---

# SLIDE 7: Conditionals - Nested If

## What is Nesting?
If statements inside if statements

## Why Use It?
Check multiple conditions together

## Example (Login Validation):
```java
if (username != null) {              // Check 1
    if (password.length() >= 8) {    // Check 2
        if (isAdmin) {               // Check 3
            System.out.println("Admin login OK");
        }
    }
}
```

## Equivalent (Using &&):
```java
if (username != null && password.length() >= 8 && isAdmin) {
    System.out.println("Admin login OK");
}
```

---

# SLIDE 8: Logical Operators

## AND (&&)
Both must be TRUE
```java
if (age >= 18 && hasLicense) {
    // Both TRUE: allowed
}
```

## OR (||)
At least one must be TRUE
```java
if (isStudent || isSenior) {
    System.out.println("Discount!");
}
```

## NOT (!)
Reverses boolean
```java
if (!isExpired) {
    System.out.println("Still valid");
}
```

**Truth Table:**
```
AND (&&):        OR (||):         NOT (!):
T && T = T       T || T = T       !T = F
T && F = F       T || F = T       !F = T
F && T = F       F || T = T
F && F = F       F || F = F
```

---

# SLIDE 9: Ternary Operator (?:)

## Syntax:
```java
condition ? valueIfTrue : valueIfFalse
```

## Purpose:
Shorthand for simple if-else

## Example:
```java
// Traditional if-else
if (age >= 18) {
    status = "Adult";
} else {
    status = "Minor";
}

// Ternary operator
status = (age >= 18) ? "Adult" : "Minor";
```

## When to Use:
- Simple, single assignment
- Don't overuse - can get unreadable

```java
// Good - clear
price = isPremium ? 9.99 : 5.99;

// Bad - confusing
String result = x > 0 ? y > 0 ? "pos" : "zero" : y > 0 ? "zero" : "neg";
```

---

# SLIDE 10: Switch Statement

## When to Use:
Multiple exact value matches (NOT ranges)

## Syntax:
```java
switch (expression) {
    case value1:
        // Code if expression == value1
        break;
    case value2:
        // Code if expression == value2
        break;
    default:
        // Code if no match
}
```

## Key Points:
- ⚠️ MUST have `break;` (or it "falls through")
- Works with: int, String, enum
- Default is optional but recommended

**Example:**
```java
switch (dayNumber) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}
```

---

# SLIDE 11: Switch - Fall-Through (Grouping)

## Intentional Fall-Through:
```java
switch (letter) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        System.out.println("Vowel");
        break;
    case 'y':
        System.out.println("Sometimes a vowel");
        break;
    default:
        System.out.println("Consonant");
}
```

## What Happens:
- If letter is 'a', 'e', 'i', 'o', or 'u', ALL execute the same code
- The empty cases above it "fall through" to the break
- This is valid and efficient

**Visual:**
```
letter = 'e'
    ↓
case 'e': (empty)
    ↓ (fall through)
case 'i': (empty)
    ↓ (fall through)
case 'u': (empty)
    ↓
Print "Vowel" and break
```

---

# SLIDE 12: Introduction to Loops

## Why Loops?
Avoid code duplication

```java
// Without loop - repetitive
System.out.println(1);
System.out.println(2);
System.out.println(3);
// ... 97 more lines ...
System.out.println(100);
```

```java
// With loop - clean
for (int i = 1; i <= 100; i++) {
    System.out.println(i);
}
```

## Three Loop Types:
1. **for** - when you know how many times
2. **while** - when condition determines exit
3. **do-while** - like while, but runs at least once

---

# SLIDE 13: For Loop - Anatomy

## Syntax:
```java
for (initialization; condition; update) {
    // Code runs repeatedly
}
```

## Three Parts:
1. **initialization** - set starting value
2. **condition** - check before each iteration
3. **update** - change value after each iteration

## Example:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
// Prints: 1 2 3 4 5
```

## Execution Order:
```
Initialize i=1
    ↓
Check i<=5? YES
    ↓
Print 1
    ↓
Update i++ (i becomes 2)
    ↓
Check i<=5? YES
    ↓
Print 2
    ↓
Update i++
    ...continues...
Check i<=5? NO → Exit loop
```

---

# SLIDE 14: For Loop - Common Patterns

## Pattern 1: Counting Forward
```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);  // 1, 2, 3, ..., 10
}
```

## Pattern 2: Counting Backward
```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);  // 10, 9, 8, ..., 1
}
```

## Pattern 3: Skip By N
```java
for (int i = 0; i < 20; i += 2) {
    System.out.println(i);  // 0, 2, 4, 6, ..., 18
}
```

## Pattern 4: Iterating Arrays
```java
int[] array = {10, 20, 30, 40};
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}
```

---

# SLIDE 15: Nested Loops

## What is Nesting?
Loop inside a loop

## Why?
Multi-dimensional iteration (tables, grids, patterns)

## Example: Multiplication Table
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(i * j + "\t");
    }
    System.out.println();
}
```

## Output:
```
1   2   3
2   4   6
3   6   9
```

## Execution:
```
i=1: j=1 (1×1=1), j=2 (1×2=2), j=3 (1×3=3), newline
i=2: j=1 (2×1=2), j=2 (2×2=4), j=3 (2×3=6), newline
i=3: j=1 (3×1=3), j=2 (3×2=6), j=3 (3×3=9), newline
```

**Complexity:**
- Outer loop: N iterations
- Inner loop: M iterations per outer
- Total: N × M iterations

---

# SLIDE 16: While Loop

## Syntax:
```java
while (condition) {
    // Code runs while condition is TRUE
    // Must update condition or infinite loop!
}
```

## Key Difference from for:
- for: know how many iterations
- while: unknown iterations (depends on condition)

## Example 1: Simple Counter
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

## Example 2: Input Validation (Real-World)
```java
int attempts = 0;
while (attempts < 3) {
    // Get user input
    // Check if valid
    if (valid) break;
    attempts++;
}
```

---

# SLIDE 17: Do-While Loop

## Syntax:
```java
do {
    // Code runs at least once
} while (condition);
```

## Key Difference:
- while: checks condition BEFORE each iteration
- do-while: checks condition AFTER each iteration
- do-while ALWAYS runs at least once

## Example: Menu System
```java
int choice;
do {
    System.out.println("1. Start  2. Exit");
    // Get user input → choice
    if (choice == 1) {
        // Run game
    }
} while (choice != 2);
```

## Visual Comparison:
```
WHILE:              DO-WHILE:
Check condition     Run code
    ↓                   ↓
Run code            Check condition
    ↓                   ↓
Check condition     Run code
    ↓                   ↓
Run code            Check condition
```

---

# SLIDE 18: Enhanced For Loop (For-Each)

## Syntax:
```java
for (dataType element : array) {
    // Use 'element'
}
```

## Purpose:
Simplify array/collection iteration when you don't need index

## Example:
```java
// Traditional for loop
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}

// Enhanced for loop (cleaner)
for (int num : array) {
    System.out.println(num);
}
```

## When to Use:
✅ Iterating all elements
✅ Don't need index
✅ Not modifying elements

❌ Need index
❌ Need to skip elements
❌ Iterate backwards

**Example With Multiple Types:**
```java
String[] names = {"Alice", "Bob", "Charlie"};
for (String name : names) {
    System.out.println(name);
}
```

---

# SLIDE 19: Break Statement

## Purpose:
Exit loop immediately

## Syntax:
```java
for (...) {
    if (condition) {
        break;  // Exit loop, continue after }
    }
}
```

## Example: Search
```java
int[] array = {5, 10, 15, 20, 25};
for (int i = 0; i < array.length; i++) {
    if (array[i] == 15) {
        System.out.println("Found at index " + i);
        break;  // Don't keep searching
    }
}
```

## Nested Loops:
```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (j == 1) {
            break;  // Breaks INNER loop only, not outer
        }
    }
}
```

**Visual:**
```
for i=0: j=0,j=1(break)→continue i
for i=1: j=0,j=1(break)→continue i
for i=2: j=0,j=1(break)→continue i
```

---

# SLIDE 20: Continue Statement

## Purpose:
Skip to next iteration (continue the loop)

## Syntax:
```java
for (...) {
    if (condition) {
        continue;  // Jump to next iteration
    }
}
```

## Example: Skip Even Numbers
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;  // Skip even, go to next i
    }
    System.out.println(i);  // Only prints odd: 1,3,5,7,9
}
```

## Contrast: Break vs Continue
```java
// BREAK - exit loop
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
}
System.out.println(i);  // Prints: 1, 2

// CONTINUE - skip iteration
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
System.out.println("");  // Prints: 1, 2, 4, 5
```

---

# SLIDE 21: Loop Control Summary

## Comparing All Loops

| Feature | for | while | do-while | for-each |
|---------|-----|-------|----------|----------|
| Know iterations? | YES | NO | NO | YES |
| At least once? | NO | NO | YES | N/A |
| Need index? | YES | Often | Often | NO |
| When to use | Most common | Unknown count | Menus | Simple iteration |

## When to Use What:
```
Need index?
  YES → use for loop (traditional)
  NO → for-each (if iterating all)
       while (if conditional)
       do-while (if menu/at least once)
```

**Examples:**
```java
// Printing 1-100 → for loop
for (int i = 1; i <= 100; i++) { }

// Processing until valid → while loop
while (!valid) { }

// Menu system → do-while loop
do { } while (choice != 2);

// All array elements → for-each
for (int num : array) { }
```

---

# SLIDE 22: Control Flow Best Practices

## ✅ DO:
- Use meaningful variable names (not just i, j, k)
- Keep nesting shallow (max 2-3 levels)
- Use for-each when you don't need index
- Add comments for complex conditions
- Initialize variables before loops
- Test boundary conditions (first, last, empty)

## ❌ DON'T:
- Use break/continue excessively
- Modify loop variable inside loop (confusing)
- Nest loops deeply (usually means algorithm issue)
- Use while(true) without clear break
- Ignore infinite loop warnings

## Common Mistakes:
```java
// WRONG - off-by-one error
for (int i = 0; i <= array.length; i++) { }

// RIGHT
for (int i = 0; i < array.length; i++) { }

// WRONG - infinite loop
while (i < 10) {
    System.out.println(i);  // Never increments i
}

// RIGHT
while (i < 10) {
    System.out.println(i);
    i++;
}
```

---

## End of Part 1 Slides

**Key Takeaways:**
1. Conditionals make decisions (if/else/switch)
2. Loops repeat code (for/while/do-while)
3. Choose the right structure for each situation
4. Nested loops and conditionals solve complex problems
5. Break/continue provide loop control
6. Practice identifying off-by-one errors

**Next Session:** Arrays and Patterns (Part 2)
