# Exercise 11: Operator Precedence

## Learning Objectives
- Understand operator precedence and evaluation order
- Practice predicting expression results
- Use parentheses to control evaluation order
- Debug expressions with unexpected results

## Your Task
Create a program that demonstrates operator precedence with complex expressions.

## What You'll Practice
1. Arithmetic operator precedence (*, /, % before +, -)
2. Comparison before logical operators
3. AND before OR
4. Predicting results before running code
5. Using parentheses to clarify intent

## Requirements
1. Create at least 8 expressions with different operator combinations
2. Predict each result before running the code
3. Show step-by-step evaluation for at least 3 complex expressions
4. Demonstrate how parentheses change the result (show before and after)
5. Include at least one expression with mixed operator types (arithmetic + comparison + logical)

## Hints
- Remember: *, /, % happen before +, -
- Comparisons happen before logical operators
- && happens before ||
- Parentheses override everything

## Reflection Questions
1. Why does 2 + 3 * 4 equal 14 and not 20?
2. What's the difference between `5 > 3 && 10 < 20` and `(5 > 3) && (10 < 20)`?
3. How would you write `age >= 18 && score > 80 || isPremium` more clearly with parentheses?
4. When would you use parentheses even if they're not needed for precedence?

## Extension
- Create a program that takes an expression and shows its evaluation step-by-step
- Explore left-to-right evaluation for operators of the same precedence
