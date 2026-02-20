# Exercise 04: Type Conversion and Casting

## Learning Objectives

After completing this exercise, you should be able to:
- Understand implicit type conversion (widening)
- Perform explicit type casting (narrowing)
- Recognize when information might be lost in casting
- Avoid overflow and underflow errors
- Use appropriate casting patterns safely
- Understand the conversion hierarchy

## Your Task

Create a program that demonstrates:
1. Implicit conversions between compatible types
2. Explicit casting with potential data loss
3. Safe casting practices
4. Real-world scenarios requiring type conversion
5. Understanding when each type of conversion applies

## Key Concepts

**Implicit Conversion (Widening)**: Automatic, safe conversions
- Smaller type → Larger type
- byte → short → int → long → float → double
- Example: `long x = 100; // int automatically converts to long`

**Explicit Casting (Narrowing)**: Manual, potentially unsafe conversions  
- Syntax: `(targetType) value`
- Example: `int x = (int) 9.99; // Result: 9 (decimal truncated)`
- Risk: Overflow, underflow, data loss

## Starter Code and Solution

Your starter file will have:
- Examples of implicit conversions
- Examples of explicit casting
- Scenarios where you need to choose the right conversion
- Safe casting practice demonstrations
- Reflection questions about conversion risks

## Expected Skills After Exercise

- Perform implicit conversions correctly
- Use explicit casting with correct syntax
- Understand risks of narrowing conversions
- Check values before casting to avoid overflow
- Choose appropriate conversion patterns
