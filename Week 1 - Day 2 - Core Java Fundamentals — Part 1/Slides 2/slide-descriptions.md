# Week 1 - Day 2 - Core Java Fundamentals (Part 1) - Slides 2
## Slide Descriptions for AI Generation

### Slide 1: Recap & Part 2 Agenda
- Title: "Part 1 Recap & Part 2 Preview"
- Bullet points with icons:
  - Part 1: JVM/JRE/JDK, Primitives, Variables, Type Conversion ✓
  - Part 2: Strings, StringBuilder/StringBuffer, Operators, Comments
- Visual: Two-part progress indicator

### Slide 2: Welcome to Part 2
- Title: "Core Java Fundamentals - Part 2"
- Subtitle: "Working with Strings, Operators, and Best Practices"
- Visual elements: String icon, operator symbols
- Agenda:
  - String Fundamentals and String class methods
  - StringBuilder vs StringBuffer performance
  - Mathematical, logical, and comparison operators
  - Code documentation and comments

### Slide 3: Why Strings Matter
- Title: "Strings: The Most Used Data Type"
- Visual: String representation ("Hello World" in quotes)
- Key points:
  - Strings are everywhere in Java programs
  - Not a primitive type - String is a class (we'll learn about classes in a few days)
  - Immutable: once created, cannot be changed
  - Different from char (single character vs text)
  - Essential for user input, output, and data manipulation

### Slide 4: What is a String?
- Title: "Understanding Strings"
- Visual: String example with character breakdown
- Definition: "A sequence of characters"
- Examples:
  - "Hello, World!"
  - "Java is awesome"
  - "42"
  - "" (empty string)
  - " " (space)
- Important: Strings use DOUBLE quotes ("text"), while char uses SINGLE quotes ('A')

### Slide 5: String Declaration and Creation
- Title: "Creating String Variables"
- Visual: Two ways shown side-by-side
- Method 1 (String literal):
  - `String name = "Alice";`
  - Simple and common
  - String is created in the string pool
- Method 2 (String object):
  - `String name = new String("Alice");`
  - More verbose
  - Creates object in heap memory
- Both create valid String variables, but Method 1 is preferred

### Slide 6: String Operations - Basic
- Title: "String Concatenation"
- Visual: Strings being joined together
- Using the + operator:
  - `String greeting = "Hello, " + "World!";` (result: "Hello, World!")
  - `String message = "Java " + "is " + "fun!";`
  - `String combined = "I am " + 25 + " years old";` (automatic conversion)
- Important: Strings can be concatenated with numbers, and numbers are automatically converted

### Slide 7: String Length
- Title: "Getting String Length"
- Visual: String with length indicator
- Method: `.length()`
- Examples:
  - `"Hello".length()` → 5
  - `"Java".length()` → 4
  - `"".length()` → 0
- Returns an int representing the number of characters

### Slide 8: String Methods - Accessing Characters
- Title: "Accessing Characters in a String"
- Visual: String with index numbers
- Method: `.charAt(index)`
- Important: String indexing starts at 0
- Examples:
  - `"Hello".charAt(0)` → 'H'
  - `"Hello".charAt(1)` → 'e'
  - `"Hello".charAt(4)` → 'o'
  - `"Hello".charAt(5)` → Exception! Out of bounds
- Returns a char (single character)

### Slide 9: String Methods - Substring
- Title: "Extracting Parts of a String"
- Visual: String with highlighted substring portion
- Method: `.substring(startIndex)` or `.substring(startIndex, endIndex)`
- Important: End index is EXCLUSIVE
- Examples:
  - `"Hello".substring(1)` → "ello" (from index 1 to end)
  - `"Hello".substring(0, 2)` → "He" (indices 0-1, not including 2)
  - `"Hello World".substring(6)` → "World"
- Returns a new String

### Slide 10: String Methods - Case Conversion
- Title: "Changing Case"
- Visual: Uppercase and lowercase text examples
- Methods:
  - `.toUpperCase()` - converts all to uppercase
  - `.toLowerCase()` - converts all to lowercase
- Examples:
  - `"Hello".toUpperCase()` → "HELLO"
  - `"Hello".toLowerCase()` → "hello"
  - `"Java".toUpperCase()` → "JAVA"
- Returns a new String (original unchanged)

### Slide 11: String Methods - Searching
- Title: "Finding Text Within Strings"
- Visual: Magnifying glass searching in text
- Methods:
  - `.indexOf(str)` - finds first occurrence, returns index or -1 if not found
  - `.contains(str)` - checks if string contains text, returns true/false
  - `.startsWith(str)` - checks if starts with, returns true/false
  - `.endsWith(str)` - checks if ends with, returns true/false
- Examples:
  - `"Hello World".indexOf("World")` → 6
  - `"Hello World".indexOf("xyz")` → -1
  - `"Hello World".contains("World")` → true
  - `"Hello World".startsWith("Hello")` → true

### Slide 12: String Methods - Trim and Replace
- Title: "Cleaning and Transforming Strings"
- Visual: String with spaces being trimmed, text being replaced
- Methods:
  - `.trim()` - removes leading and trailing whitespace
  - `.replace(oldChar, newChar)` - replaces all occurrences
  - `.replaceAll(regex, replacement)` - replaces with pattern matching
- Examples:
  - `"  Hello  ".trim()` → "Hello"
  - `"Hello".replace('l', 'L')` → "HeLLo"
  - `"apple,banana,cherry".replace(",", ";")` → "apple;banana;cherry"
- All return new Strings

### Slide 13: String Immutability
- Title: "Strings Are Immutable"
- Visual: String being attempted to be changed, but creating new String instead
- Important concept: Once a String is created, it CANNOT be changed
- Example:
  - `String s = "Hello";`
  - `s.toUpperCase();` // This does NOT change s!
  - `System.out.println(s);` // Still "Hello", not "HELLO"
- If you want the result: `s = s.toUpperCase();` // Now s is "HELLO"
- Why immutability? Thread safety, security, optimization

### Slide 14: String Comparison - Equality
- Title: "Comparing Strings: Testing Equality"
- Visual: Two strings being compared
- Methods to compare strings:
  - `.equals(str)` - case-sensitive comparison
  - `.equalsIgnoreCase(str)` - case-insensitive comparison
- Do NOT use `==` for String comparison (== checks object reference, not content)
- Examples:
  - `"Hello".equals("Hello")` → true
  - `"Hello".equals("hello")` → false
  - `"Hello".equalsIgnoreCase("hello")` → true

### Slide 15: StringBuilder Introduction
- Title: "What is StringBuilder?"
- Visual: StringBuilder as a building block vs immutable String
- Problem: String immutability makes concatenation inefficient
- Solution: StringBuilder (and StringBuffer) - MUTABLE strings
- Key difference:
  - String: immutable, each operation creates new String
  - StringBuilder: mutable, can be changed in place
- Use StringBuilder when doing many string concatenations

### Slide 16: StringBuilder vs StringBuffer
- Title: "StringBuilder vs StringBuffer"
- Visual: Comparison table
- Both are mutable, but different in thread safety:
  - StringBuilder: NOT thread-safe, faster
  - StringBuffer: Thread-safe (synchronized), slower
- In most single-threaded applications, use StringBuilder
- StringBuffer is older (Java 1.0), StringBuilder is newer (Java 5)
- If you don't know about threading yet, use StringBuilder

### Slide 17: StringBuilder Usage
- Title: "Using StringBuilder for Efficient String Building"
- Visual: StringBuilder building up a string
- Basic methods:
  - `.append(str)` - adds to end
  - `.insert(index, str)` - inserts at position
  - `.delete(start, end)` - removes characters
  - `.reverse()` - reverses the string
  - `.toString()` - converts to String
- Example:
  - `StringBuilder sb = new StringBuilder();`
  - `sb.append("Hello");`
  - `sb.append(" ");`
  - `sb.append("World");`
  - `String result = sb.toString();` // "Hello World"

### Slide 18: StringBuilder Performance
- Title: "Why StringBuilder Matters: Performance"
- Visual: String concatenation in loop vs StringBuilder in loop
- String concatenation in loop (BAD):
  - `String s = "";`
  - `for(int i = 0; i < 1000; i++) { s = s + i; }` // Creates 1000 new Strings!
  - Very slow
- StringBuilder (GOOD):
  - `StringBuilder sb = new StringBuilder();`
  - `for(int i = 0; i < 1000; i++) { sb.append(i); }` // Reuses same object
  - Much faster
- Key: Use StringBuilder for loops with string building

### Slide 19: Mathematical Operators
- Title: "Math Operators in Java"
- Visual: Basic math operations with symbols
- Operators:
  - `+` Addition
  - `-` Subtraction
  - `*` Multiplication
  - `/` Division (integer division if both operands are int)
  - `%` Modulo (remainder after division)
- Examples:
  - `10 + 5` → 15
  - `10 - 3` → 7
  - `4 * 5` → 20
  - `15 / 3` → 5
  - `17 / 5` → 3 (integer division, loses decimal)
  - `17 % 5` → 2 (remainder)

### Slide 20: Integer vs Decimal Division
- Title: "Integer Division vs Decimal Division"
- Visual: Same division with different results
- If both operands are integers: integer division (no decimal)
  - `10 / 4` → 2 (not 2.5)
- If at least one operand is decimal: decimal division
  - `10 / 4.0` → 2.5
  - `10.0 / 4` → 2.5
  - `10 / (double)4` → 2.5 (casting to force decimal)
- Important for calculations where you need decimal results

### Slide 21: Comparison Operators
- Title: "Comparing Values"
- Visual: Comparison symbols with true/false examples
- Operators that return boolean:
  - `==` Equal to
  - `!=` Not equal to
  - `<` Less than
  - `>` Greater than
  - `<=` Less than or equal
  - `>=` Greater than or equal
- Examples:
  - `5 == 5` → true
  - `5 != 3` → true
  - `5 > 3` → true
  - `5 <= 5` → true
- These are used in if statements and loops

### Slide 22: Logical Operators - AND and OR
- Title: "Logical Operators: AND and OR"
- Visual: Logic gates or Venn diagrams
- Operators:
  - `&&` Logical AND (both must be true)
  - `||` Logical OR (at least one must be true)
  - `!` Logical NOT (inverts true/false)
- Truth tables:
  - `true && true` → true
  - `true && false` → false
  - `true || false` → true
  - `false || false` → false
  - `!true` → false
  - `!false` → true
- Examples:
  - `(age > 18 && age < 65)` → checks working age range
  - `(isWeekend || isHoliday)` → checks if day off
  - `!isRaining` → opposite of isRaining

### Slide 23: Logical Operators - Short-circuit Evaluation
- Title: "Short-circuit Evaluation"
- Visual: AND/OR stopping evaluation early
- With `&&`: If first part is false, second part is not evaluated
  - `false && unknownCondition` → false (doesn't even check unknownCondition)
- With `||`: If first part is true, second part is not evaluated
  - `true || unknownCondition` → true (doesn't even check unknownCondition)
- This is more efficient and can prevent errors
- Example:
  - `if (user != null && user.getAge() > 18)` // Safe: null check first!

### Slide 24: Operator Precedence
- Title: "Operator Precedence: Order of Operations"
- Visual: PEMDAS/BODMAS style precedence pyramid
- Java follows standard math precedence:
  1. Parentheses ()
  2. Multiplication *, Division /, Modulo %
  3. Addition +, Subtraction -
  4. Comparison <, >, <=, >=
  5. Equality ==, !=
  6. Logical AND &&
  7. Logical OR ||
- Example:
  - `5 + 3 * 2` → 11 (not 16, because * comes before +)
  - `(5 + 3) * 2` → 16 (parentheses change order)
- When in doubt, use parentheses!

### Slide 25: Increment and Decrement Operators
- Title: "Shorthand: Increment and Decrement"
- Visual: Counting up and down
- Operators:
  - `++` Increment by 1
  - `--` Decrement by 1
  - Can be prefix (`++x`) or postfix (`x++`)
- Shorthand:
  - `i++` is shorthand for `i = i + 1`
  - `--i` is shorthand for `i = i - 1`
- Example:
  - `int count = 5; count++;` // count is now 6
  - `int x = 5; x--;` // x is now 4
- Prefix vs postfix: usually doesn't matter in simple statements

### Slide 26: Compound Assignment Operators
- Title: "Compound Assignment Operators"
- Visual: Shorthand operator symbols
- Operators:
  - `+=` Add and assign: `x += 5` means `x = x + 5`
  - `-=` Subtract and assign: `x -= 3` means `x = x - 3`
  - `*=` Multiply and assign: `x *= 2` means `x = x * 2`
  - `/=` Divide and assign: `x /= 4` means `x = x / 4`
  - `%=` Modulo and assign: `x %= 3` means `x = x % 3`
- Examples:
  - `score += 10;` // Add 10 to score
  - `balance -= 50;` // Subtract 50 from balance
- Makes code more concise

### Slide 27: Comments - Single Line
- Title: "Single-Line Comments"
- Visual: Comment examples in code
- Syntax: `//` starts a comment to end of line
- Examples:
  - `int age = 25; // Stores the user's age`
  - `// Calculate the total price`
  - `double total = price * quantity; // Don't forget tax!`
- Use for brief explanations
- Good practice: explain WHY, not WHAT

### Slide 28: Comments - Multi-Line
- Title: "Multi-Line Comments"
- Visual: Block comment examples
- Syntax: `/* ... */` spans multiple lines
- Examples:
  ```
  /*
   * This is a multi-line comment
   * that explains complex logic
   * spanning multiple lines
   */
  ```
- Use for detailed explanations
- Each line can optionally start with `*` for formatting

### Slide 29: Documentation Comments (Javadoc)
- Title: "Javadoc Comments"
- Visual: Javadoc formatted comment example
- Syntax: `/** ... */` for generating documentation
- Format:
  ```
  /**
   * Brief description
   * 
   * @param paramName description of parameter
   * @return description of return value
   */
  ```
- Used to generate API documentation
- We'll use more extensively when we get to methods and classes

### Slide 30: Comments Best Practices
- Title: "Commenting Best Practices"
- Visual: Good vs Bad comment examples
- DO:
  - Explain WHY, not WHAT (code shows WHAT)
  - Explain complex logic
  - Explain non-obvious decisions
  - Keep comments current with code
- DON'T:
  - Comment obvious code
  - Leave outdated comments (source control instead)
  - Over-comment obvious statements
  - Use comments instead of clear code
- Example Good:
  - `// Use HashMap for O(1) lookup performance`
- Example Bad:
  - `age = 25; // Set age to 25` (obvious!)

### Slide 31: Putting It All Together
- Title: "Integrating All Concepts"
- Visual: Small program example using strings, operators, comments
- Show a practical example combining:
  - String operations
  - Mathematical operators
  - Logical operators
  - Comments
- Example theme: Simple user greeting program

### Slide 32: Part 2 Summary
- Title: "Part 2 Summary: What We've Covered"
- Visual: Checklist of topics
- Strings:
  - Declaration, concatenation, methods, immutability
  - StringBuilder for efficiency
- Operators:
  - Math, comparison, logical
  - Precedence and short-circuit evaluation
- Code Quality:
  - Comments for documentation
  - Best practices for maintainability
- All building blocks for real Java programs

### Slide 33: Q&A / Pause
- Title: "Questions?"
- Visual: Question marks
- Before exercises:
  - String questions?
  - Operator questions?
  - Comments or code style questions?

### Slide 34: Exercise Time
- Title: "Exercise Time"
- Subtitle: "Apply What You've Learned"
- Visual: Exercises icon
- What you'll do:
  - Work with String methods (Exercise covered in Part 2)
  - Practice operators in calculations
  - Use StringBuilder for efficiency
  - Write well-commented code
