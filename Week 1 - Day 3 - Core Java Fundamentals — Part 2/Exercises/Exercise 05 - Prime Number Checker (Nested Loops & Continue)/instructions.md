# Exercise 05: Prime Number Checker (Nested Loops & Continue)

## Objective
Practice nested loops, continue statement, and understanding algorithm efficiency.

## Problem Statement
Write a program that checks if numbers are prime. A prime number is only divisible by 1 and itself.

Requirements:
1. Accept a number as command-line argument
2. Check if the number is prime (or not prime)
3. If prime, print "X is prime"
4. If not prime, print "X is not prime" and the smallest divisor

## Algorithm
To check if N is prime:
- If N < 2, not prime
- Loop from 2 to N-1
- If any number divides N evenly, it's not prime
- If no divisors found, it's prime

Optimization: Only check up to √N

## Requirements
1. **Input**: Single number via command-line
2. **Output**: Prime status and divisor (if not prime)
3. **Algorithm**: Use nested loop concept (loop to find divisors)
4. **Efficiency**: Use √N optimization

## Example Output
```
Enter number: 17
17 is prime

Enter number: 12
12 is not prime
Smallest divisor: 2

Enter number: 15
15 is not prime
Smallest divisor: 3

Enter number: 1
1 is not prime

Enter number: 2
2 is prime
```

## Hints
- To check divisibility, use modulo: `n % i == 0`
- Square root: `Math.sqrt(n)`
- Only check divisors up to √n
- The first divisor you find is the smallest

## Constraints
- Accept any positive integer
- Handle edge cases: 1, 2, negative numbers
- Keep code in main method

## Success Criteria
- ✅ Correctly identifies prime numbers
- ✅ Correctly identifies composite numbers
- ✅ Finds smallest divisor for composite numbers
- ✅ Handles edge cases (1, 2, negative)
- ✅ Efficient algorithm (uses √N optimization)
