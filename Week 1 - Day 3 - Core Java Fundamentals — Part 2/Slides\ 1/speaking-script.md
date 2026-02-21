# Week 1 Day 3 - Part 1: Control Flow
## Speaking Script (22 slides)

---

# SLIDE 1: Title Slide - Control Flow

**Speaker Notes:**
Good morning! Today we're exploring one of the most fundamental concepts in programming: Control Flow. This is what separates a rigid program that always does the same thing from a flexible program that can make decisions and repeat actions.

By the end of this session, you'll understand how to write programs that can respond to different inputs, make intelligent decisions, and automate repetitive tasks. We'll be covering two main categories: conditionals (if/else/switch) for making decisions, and loops (for/while/do-while) for repeating actions.

This is crucial knowledge - probably 80% of all bugs and logic errors come from misunderstanding control flow, so pay close attention.

---

# SLIDE 2: What is Control Flow?

**Speaker Notes:**
Let's define what we mean by "control flow." It's simply the order in which statements execute in your program.

Think about it: without control flow, every program would run the exact same way, every single time. It would start at the top, execute each line in order, reach the bottom, and end. There's no flexibility, no branching, no repetition.

But real programs need to be smart. A program needs to check: "Is the user's password correct?" - if yes, log them in; if no, show an error. Or it needs to process: "For each item in this list, calculate its tax." 

That's where control flow comes in. It lets us build logic into our programs. We can say "IF this condition is true, do this. OTHERWISE, do that." Or "REPEAT this action five times."

Without control flow, programming is pointless. With it, programs become dynamic and useful.

---

# SLIDE 3: Two Categories of Control Flow

**Speaker Notes:**
All control flow in programming falls into two categories: conditionals and loops.

Conditionals are about decision-making. You ask a yes/no question, and based on the answer, your program takes one path or another. Examples: "Is the user over 18?" "Is the balance greater than zero?" "Does the username match?"

Loops are about repetition. You want to do something multiple times without writing the same code over and over. Examples: "Print each number from 1 to 100." "Process every item in a list." "Keep asking the user for input until they give a valid answer."

In this part, we'll cover both. We'll start with conditionals (if/else, switch), then move into loops (for, while, do-while, enhanced for). Each serves a different purpose, and you'll learn when to use each one.

---

# SLIDE 4: Conditionals - If Statement

**Speaker Notes:**
Let's start with the most basic conditional: the if statement.

The syntax is simple: "if" followed by a condition in parentheses, then a code block in curly braces. The key word here is "condition" - it MUST evaluate to a boolean: true or false.

Here's how it works: Java evaluates the condition. If it's true, the code inside the braces executes. If it's false, the code is skipped entirely, and execution continues after the closing brace.

Look at the example: "if (score >= 60)" - this condition checks whether score is greater than or equal to 60. If it is, we print "You passed!" If not, nothing happens (well, technically we'd continue to the next statement).

One important note: the condition must be boolean. You can't do "if (5)" or "if (name)" - those aren't true/false. You need "if (count == 5)" or "if (name != null)". This prevents a lot of bugs.

---

# SLIDE 5: Conditionals - If-Else

**Speaker Notes:**
Now let's add the else clause. If statement by itself is useful, but often you want to handle BOTH cases - what to do if true, and what to do if false.

That's what if-else does. It guarantees that exactly ONE of the two paths executes. One path always runs. This is different from two separate if statements, where neither might run (or both could run if you're not careful).

Look at the example: if the score is >= 60, we print "Pass". Otherwise (else), we print "Fail". There are no other possibilities - every execution follows one of these two paths.

This is what we call "branching logic." Your program evaluates the condition and branches down one path or the other. It's like a fork in the road: once you choose a direction, you follow that path to completion before moving on.

You'll use if-else constantly. It's one of the most common structures in programming.

---

# SLIDE 6: Conditionals - If-Else If-Else

**Speaker Notes:**
What if you have more than two options? That's where if-else if-else comes in. You can chain multiple conditions together.

The logic works like this: evaluate the first condition. If it's true, execute that block and skip all the rest. If it's false, move to the next else if condition. Evaluate it. If true, execute that block and skip the rest. Keep going until you find a true condition, or reach the final else.

The important word is "first." As soon as Java finds a true condition, it executes that block and then skips to the end of the entire if-else if-else structure. The remaining conditions aren't even checked.

Look at the grading example: if score is 90 or higher, print "A" - DONE. We don't check the 80s or 70s. If it wasn't 90 or higher, and it's 80 or higher, print "B" - DONE. And so on.

The final else is optional but I recommend always including it. It's your "catch-all" for cases that don't match any condition. This catches bugs where you expected a value but got something unexpected.

---

# SLIDE 7: Conditionals - Nested If

**Speaker Notes:**
Sometimes you need to check multiple conditions together, and nesting is one way to do it. Nesting means putting an if statement inside another if statement.

The logic is: first check if username exists. ONLY if that's true do we check the password length. ONLY if both are true do we check if they're an admin. It's like multiple gates - you have to pass each one to proceed.

In the example, we check username first. If it's null, we don't even bother checking the password. Why waste time? We know we can't proceed anyway.

Now, look at the equivalent code using the AND operator (&&). This is much cleaner and more readable. Instead of nested braces, we just chain conditions together with &&. All must be true for the block to execute.

In practice, you should use the second form - it's clearer. Use nesting only when you have complex logic or when different branches need different code.

---

# SLIDE 8: Logical Operators

**Speaker Notes:**
The logical operators are AND (&&), OR (||), and NOT (!). These let you combine multiple boolean conditions.

AND (&&) means both must be true. If either is false, the whole thing is false. Example: "if the user is at least 18 years old AND has a valid driver's license, they can rent a car." Both conditions must be true.

OR (||) means at least one must be true. If both are false, the whole thing is false. Example: "if you're a student OR a senior, you get a discount." If you're either one, you get it.

NOT (!) reverses a boolean. If something is true, NOT makes it false, and vice versa. Example: "if the token is NOT expired, the session is still valid."

Here's a practical example: "if you're at least 13 years old AND you have parental permission, OR you're at least 18 years old, then you can use this service." That's complex, but the operators let us express it clearly.

One thing to watch out for - operator precedence. AND binds tighter than OR, so "A || B && C" means "A || (B && C)", not "(A || B) && C". Use parentheses to be clear about what you mean.

---

# SLIDE 9: Ternary Operator (?:)

**Speaker Notes:**
The ternary operator is a shorthand for if-else when you're assigning a value. It reads like: "condition ? value if true : value if false"

It's called "ternary" because it takes three operands (the condition, the true value, and the false value).

Look at the example: instead of four lines of if-else, you can write one line. It's more concise. But here's the important part: use it only for simple cases. When you start nesting ternary operators, it becomes hard to read, and code that's hard to read is code that has bugs.

I show that "bad" example because I want you to avoid it. Multiple nested ternary operators look like line noise. If you're doing something complex, go back to if-else. It's clearer, and clarity is more important than being concise.

Think of the ternary operator as a micro-optimization for readability. It should make code clearer, not obscure it. If it's making code harder to understand, don't use it.

---

# SLIDE 10: Switch Statement

**Speaker Notes:**
The switch statement is for checking a single value against multiple exact matches. It's different from if-else: if-else is for ranges and complex conditions, switch is for "does this equal 1? Does it equal 2? Does it equal 3?"

The syntax might look foreign if you haven't seen it before, but it's straightforward. You have a switch keyword with an expression (usually a variable), then multiple cases. Each case is a potential value. If the expression matches that value, the code for that case runs.

Here's the critical part - the break statement. It exits the switch. Without it, you get fall-through, where execution continues to the next case. This is usually a bug, so make it a habit to always include break.

Switch works with integers, Strings, and enums. It doesn't work with floating point numbers or complex conditions. That's what if-else is for.

The default case is like else - it's your catch-all. It's optional, but recommended. It handles cases that don't match any of the cases above.

---

# SLIDE 11: Switch - Fall-Through (Grouping)

**Speaker Notes:**
Now, sometimes fall-through is actually useful. When you have multiple cases that should execute the same code, you can group them by omitting the break for intermediate cases.

Look at the vowel example. If the letter is 'a', we fall through to 'e', then to 'i', then to 'o', then to 'u', and finally to the code block. All those letters execute the same code.

This is much cleaner than writing the same code five times. It's also efficient - one code block for multiple conditions.

Be careful though - make your intent clear with comments. Don't leave blank cases without a comment, because it looks like you forgot the break statement. A reader might not realize it's intentional.

This is a valid and common pattern, so learn it. You'll see fall-through in real code all the time.

---

# SLIDE 12: Introduction to Loops

**Speaker Notes:**
Let's talk about why loops exist. Imagine you need to print the numbers 1 through 100. Without loops, you'd write 100 print statements. That's repetitive and error-prone. With loops, you write the logic once and repeat it automatically.

Loops are one of the most powerful features in programming. They let you write three lines of code to do the work of 1000 lines.

There are three main types of loops in Java: for, while, and do-while. Each has a purpose. The for loop is most common - you use it when you know how many times you want to repeat. The while loop is for when you don't know how many times - you repeat until some condition is false. The do-while is like while but runs at least once.

We'll learn when to use each one, but first, let's understand how they work mechanically.

---

# SLIDE 13: For Loop - Anatomy

**Speaker Notes:**
The for loop is the most common loop, and it has three parts in the header: initialization, condition, and update.

Initialization runs once, before the loop starts. You usually set your counter variable here. In our example, we initialize i to 1.

Condition is checked before each iteration. If it's true, the loop body runs. If it's false, the loop exits. In our example, we check "is i less than or equal to 5?" If yes, continue. If no, we're done.

Update runs after each iteration. You typically increment your counter here. In our example, i++ means i increases by 1.

So the flow is: initialize i to 1, check if 1 <= 5 (yes), print 1, increment i to 2, check if 2 <= 5 (yes), print 2, and so on, until we check if 6 <= 5 (no), and exit.

This is the most important loop to master. Most of your loops will be for loops.

---

# SLIDE 14: For Loop - Common Patterns

**Speaker Notes:**
There are several patterns you'll see over and over with for loops.

Pattern 1 is forward counting: start at 1, go up to 10. Simple.

Pattern 2 is backward counting: start at 10, go down to 1. Notice the condition is >= and the update is -- instead of ++.

Pattern 3 is skip by N: start at 0, increment by 2 each time, so you get 0, 2, 4, 6, etc. You might use this to process every other element, or to process every nth item.

Pattern 4 is iterating through an array. You start at 0 (first index) and go up to array.length - 1 (last index). Notice the condition is less than, not less than or equal to. This is important - array indices start at 0 and go up to length - 1.

These patterns are so common that you should memorize them. When you sit down to write a loop, one of these patterns will almost certainly work with just minor tweaks.

---

# SLIDE 15: Nested Loops

**Speaker Notes:**
A nested loop is a loop inside a loop. This is commonly used when you need to process multi-dimensional data, like a table or grid.

In the example, the outer loop iterates rows 1 to 3. For each row, the inner loop iterates columns 1 to 3. So we get a 3×3 grid.

When you have nested loops, execution goes like this: outer loop runs once, then the inner loop completes all its iterations, then the outer loop advances and the inner loop goes through all its iterations again. It's like nested Russian dolls.

The key thing to understand is iteration count. With the outer loop running N times and the inner loop running M times, the total number of iterations is N times M. In this example, that's 3 × 3 = 9 iterations total.

Nested loops can get expensive computationally. If both loops run 1000 times, that's a million iterations. If you nest three deep, it's a billion. Be mindful of performance, especially with large datasets.

---

# SLIDE 16: While Loop

**Speaker Notes:**
The while loop is simpler than the for loop in structure but more flexible in what you can do with it.

The syntax is: while, condition in parentheses, then the loop body. As long as the condition is true, the loop keeps running. When the condition becomes false, the loop exits.

The key difference between while and for is: use for when you know how many iterations you need, use while when you don't.

In the first example, we have a counter like in a for loop, but the initialization and update are outside the loop structure. This is a bit messier than a for loop for simple counting, which is why for is preferred.

But look at the second example - input validation. We don't know in advance how many times the user will enter invalid data. We keep asking until they enter something valid. This is perfect for while.

One danger with while loops: infinite loops. If your condition never becomes false, the loop never exits. You must have code inside the loop that modifies the condition. In the counting example, we increment i. In the validation example, we might set valid = true when the input is good.

---

# SLIDE 17: Do-While Loop

**Speaker Notes:**
Do-while is like while, but with one crucial difference: it runs at least once. The condition is checked at the END of the loop, not the beginning.

So even if the condition is false from the start, the loop body still executes once.

This is useful for menu systems and interactive programs. You want to show the menu at least once, then keep showing it until the user chooses to exit. If you used a while loop, you'd have to show the menu before the loop too.

Look at the typical pattern: show the menu, get user input, check if they chose exit, if not, loop back and show the menu again. With do-while, this is natural. With while, you'd have to duplicate the menu display.

So here's when to use each: while loop when you might not want to execute the body at all (like checking if a file exists before reading it), do-while when you always want to execute at least once (like a menu).

---

# SLIDE 18: Enhanced For Loop (For-Each)

**Speaker Notes:**
The enhanced for loop, also called for-each, is a cleaner way to iterate through arrays and collections when you don't need the index.

The syntax is: for, then a variable declaration, then a colon, then the array or collection. You're saying "for each element in the array, assign it to this variable and run the loop body."

It's much cleaner than a traditional for loop when you don't need the index. You don't have to worry about off-by-one errors or getting the length right.

But there are limitations. You can't use for-each if you need the index - like if you want to modify an element at a specific position. You also can't use it to iterate backwards or skip elements. For those cases, you need a traditional for loop.

The rule of thumb: use for-each when you're processing all elements in order and don't need the index. Use traditional for when you need more control.

---

# SLIDE 19: Break Statement

**Speaker Notes:**
The break statement exits a loop immediately, skipping to the code after the closing brace.

This is useful when you're searching for something. Once you find it, you don't need to keep looking, so you break out of the loop.

In the example, we're searching for the value 15 in an array. Once we find it, we print the index and break. If we didn't break, we'd continue checking the rest of the array even though we already found what we were looking for.

One important thing about break in nested loops: it only breaks the innermost loop. If you break inside the inner loop, you exit the inner loop but continue the outer loop. Look at the nested example - when j equals 1, we break. This breaks the inner loop, but the outer loop continues for the next value of i.

If you needed to break out of the outer loop, you'd need to use a different technique, like a flag variable or breaking outside the loop structure.

---

# SLIDE 20: Continue Statement

**Speaker Notes:**
Continue is like break, but instead of exiting the loop, it skips to the next iteration.

So when you encounter continue, execution immediately jumps to the update part of the loop (for i++) or back to the condition check (while/do-while).

In the example, we're printing only odd numbers. For even numbers, we skip the print statement with continue. So we get 1, 3, 5, 7, 9 - the even numbers are skipped.

Compare the two examples. Break exits the loop entirely when i equals 3, so we only print 1 and 2. Continue skips the print when i equals 3, but the loop continues, so we print 1, 2, 4, 5.

Use continue to skip iterations you don't want to process. But don't overuse it - if your code becomes hard to follow with lots of continues, maybe restructure the logic to be clearer.

---

# SLIDE 21: Loop Control Summary

**Speaker Notes:**
Let's summarize the loops and when to use each one.

The for loop is your go-to for known iterations. If you know you want to repeat 10 times or iterate through an array, use for. It's the most common loop in programming.

While is for unknown iterations. You keep going until some condition is met - like reading lines from a file until you reach the end, or asking for input until it's valid.

Do-while is like while, but when you need at least one execution. Classic use case: menus and interactive programs.

For-each is for simple iteration through arrays or collections when you don't need the index. It's the cleanest syntax for that specific purpose.

Look at the examples. Printing 1 to 100 - that's clearly a for loop. Processing until valid - that's while. Menu system - that's do-while. Processing all array elements - that's for-each.

---

# SLIDE 22: Control Flow Best Practices

**Speaker Notes:**
Let me give you some guidelines that will make your code better and more readable.

DO use meaningful variable names. Don't just use i, j, k unless it's an obvious counter. Use iterator, count, index, whatever makes sense.

DO keep nesting shallow. If you find yourself three or four levels deep with nested loops or conditionals, stop and think if there's a better way. Deep nesting is hard to understand and easy to get wrong.

DO use for-each when you can. It's cleaner and safer than traditional for loops for simple iteration.

DO add comments for complex conditions. If a boolean expression takes you more than 10 seconds to parse, it needs a comment explaining what it does.

DO initialize variables before loops. This prevents accidental infinite loops or logic errors.

DON'T use while(true) unless you have a very clear break condition. It's a code smell that often indicates unclear logic.

DON'T modify the loop variable inside the loop body. This is confusing and error-prone. If you need complex logic, use a different variable or restructure.

And watch out for off-by-one errors. This is the most common loop bug. Remember: if you have 10 elements with indices 0-9, you iterate while i < 10, not i <= 10.

---

## End of Speaking Script

**Key Reminders for Students:**
- Conditionals are about making decisions (if/else/switch)
- Loops are about repetition (for/while/do-while/for-each)
- Off-by-one errors are the most common loop bug
- Break exits loops, continue skips iterations
- Match the loop type to the problem (known vs unknown iterations)

**Next Session:** We'll move to Part 2 - Arrays and Programming Patterns
