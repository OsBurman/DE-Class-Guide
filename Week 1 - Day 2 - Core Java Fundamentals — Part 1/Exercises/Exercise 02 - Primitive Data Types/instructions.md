# Exercise 02: Primitive Data Types - Understanding the Eight Fundamental Types

## Learning Objectives

After completing this exercise, you should be able to:
- Declare and initialize all eight primitive types
- Understand the range and memory usage of each primitive type
- Use primitive types appropriately for different scenarios
- Recognize when to use each type based on the data you're working with
- Work with default values for primitives
- Use wrapper class constants for min/max values

## What You'll Learn

This exercise teaches you about Java's eight primitive data types:

1. **Integer Types**: byte, short, int, long
   - Different sizes for different ranges of whole numbers
   - When to use each based on memory and range requirements

2. **Floating-Point Types**: float, double
   - Different precision levels for decimal numbers
   - When to use each based on precision requirements

3. **Boolean Type**: boolean
   - Two values: true or false
   - Used for conditional logic

4. **Character Type**: char
   - Single Unicode character
   - Each char has a numeric value

## Your Task

You will complete a Java program that demonstrates:
1. Declaring and initializing all eight primitive types
2. Printing their values, ranges, and sizes
3. Understanding default values
4. Working with different scenarios that require each type
5. Recognizing the appropriate type for different use cases

## Exercise Flow

### Part 1: Review and Setup
1. Open the starter code file: `PrimitiveDemo.java`
2. Review which types are already demonstrated
3. Understand the pattern used for each type

### Part 2: Complete the Program
1. Fill in the missing primitive types
2. For each type, demonstrate:
   - A variable declaration and initialization
   - Printing the value
   - Printing the min and max using wrapper class constants
   - A brief comment explaining when to use this type

### Part 3: Practical Scenarios
1. Create variables for real-world scenarios:
   - Age of a person → which type? (byte or short)
   - Population of a country → which type? (int or long)
   - Price of an item → which type? (float or double)
   - Temperature with decimals → which type? (float or double)
   - Whether a user is logged in → which type? (boolean)

### Part 4: Exploration
1. Find the byte value ranges using Byte.MIN_VALUE and Byte.MAX_VALUE
2. Calculate how many different values each type can hold
3. Determine which type is most appropriate for various data

### Part 5: Analysis
1. Answer the comparison questions about when to use each type

## Reflection Questions

Please write your answers in comments at the end of your program:

1. **Whole Numbers: When to use byte, short, int, long?**
   - When would you use byte instead of int?
   - When would you use long instead of int?
   - What problem might you have if you used byte to store the world population?

2. **Decimal Numbers: float vs double?**
   - What's the difference between float and double?
   - When would you use float?
   - Why is double usually the default?

3. **Real-World Scenarios:**
   - What type would you use for: years since birth?
   - What type would you use for: a temperature reading?
   - What type would you use for: a salary amount?
   - What type would you use for: whether a light is on/off?

4. **Memory Implications:**
   - If you create an array of 1 million bytes vs 1 million ints, how much more memory does the int array use?
   - Why might this matter in a large application?

5. **Default Values:**
   - What is the default value of an int at class level?
   - What is the default value of a boolean at class level?
   - What is the default value of a char at class level? (Hint: it's not 0)

## Expected Output Example

When you complete and run the program, you should see:

```
===== Java Primitive Data Types =====

Byte Type:
  Sample value: 42
  Size: 8 bits (1 byte)
  Range: -128 to 127
  Use when: Memory is critical or working with binary data

Short Type:
  Sample value: 10000
  Size: 16 bits (2 bytes)
  Range: -32768 to 32767
  Use when: Legacy API compatibility or specific need for size

Int Type:
  Sample value: 2000000
  Size: 32 bits (4 bytes)
  Range: -2147483648 to 2147483647
  Use when: Default whole number type - most common

Long Type:
  Sample value: 9000000000
  Size: 64 bits (8 bytes)
  Range: -9223372036854775808 to 9223372036854775807
  Use when: Very large whole numbers (timestamps, IDs, large calculations)

Float Type:
  Sample value: 3.14
  Size: 32 bits (4 bytes)
  Precision: ~7 decimal digits
  Use when: Memory is critical (graphics, large arrays of decimals)

Double Type:
  Sample value: 3.14159265359
  Size: 64 bits (8 bytes)
  Precision: ~15 decimal digits
  Use when: Default decimal type - high precision needed

Boolean Type:
  Sample value 1: true
  Sample value 2: false
  Use when: Conditional logic, flags, true/false values

Char Type:
  Sample value: 'A'
  Unicode value: 65
  Size: 16 bits (2 bytes)
  Use when: Single character values
```

## Key Concepts to Remember

1. **Size and Range**
   - byte: 1 byte, range -128 to 127
   - short: 2 bytes, range -32,768 to 32,767
   - int: 4 bytes, range -2.1 billion to 2.1 billion
   - long: 8 bytes, range -9.2 quintillion to 9.2 quintillion
   - float: 4 bytes, ~7 significant digits
   - double: 8 bytes, ~15 significant digits
   - boolean: 1 bit conceptually (size varies)
   - char: 2 bytes, range 0 to 65,535

2. **Choosing the Right Type**
   - Use int for whole numbers (default)
   - Use double for decimals (default)
   - Use long for very large numbers or timestamps
   - Use byte/short for specific memory constraints
   - Use float for graphics/performance-critical decimal work
   - Use boolean for conditional logic
   - Use char for single characters

3. **Default Values**
   - Class-level primitives have defaults: 0, 0.0, false, '\u0000'
   - Local variables must be initialized before use

4. **Wrapper Classes**
   - Integer, Long, Short, Byte provide constants:
   - `Integer.MIN_VALUE` and `Integer.MAX_VALUE` for ranges
   - `Integer.SIZE` and `Integer.BYTES` for memory info

## Extension Tasks (If You Finish Early)

1. **Create a SalaryCalculator** that uses appropriate types for salary, tax rate, and calculations
2. **Create a PersonData class** that stores age (byte?), height (double), SSN (long?), married status (boolean)
3. **Research and document** which type is used for:
   - Database IDs
   - Timestamps
   - Geographic coordinates
   - Color values (RGB)
4. **Write a program** that calculates how many primitive values of each type could fit in 1 MB of memory

## Common Issues and Solutions

**Issue**: "error: variable ... might not have been initialized"
- Solution: Local variables must be initialized before use. Make sure you assign a value.

**Issue**: "integer number too large"
- Solution: Use the L suffix for long literals: `long x = 100000000000L;`

**Issue**: "incompatible types: possible lossy conversion from double to int"
- Solution: Use explicit casting: `int x = (int) 3.14;` (we'll cover casting next)

**Issue**: "char value is not between 0 and 65535"
- Solution: Use valid characters in single quotes: `char c = 'A';` not invalid Unicode ranges

## Files in This Exercise

- `PrimitiveDemo.java` - Starter code (partially filled)
- `PrimitiveDemo.class` - Compiled bytecode (created by you)
- Solutions folder contains the complete solution with all types demonstrated
