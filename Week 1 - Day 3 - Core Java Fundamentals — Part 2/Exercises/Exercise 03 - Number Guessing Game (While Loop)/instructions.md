# Exercise 03: Number Guessing Game (While Loop)

## Objective
Practice using while loops and understand loop control with break statements.

## Problem Statement
Create a simple number guessing game where:
1. The program picks a random number between 1 and 100
2. The user guesses the number (simulated as command-line arguments)
3. After each guess, tell them if they're too high, too low, or correct
4. Count how many guesses it took
5. Exit when they guess correctly

## Requirements
1. **Random Number**: Generate a random number between 1 and 100
   - Use: `int randomNumber = (int)(Math.random() * 100) + 1;`
2. **Loop**: Use a while loop to keep asking for guesses
3. **Feedback**: After each guess, print "Too high", "Too low", or "Correct!"
4. **Counter**: Track and print the number of guesses
5. **Exit**: Break out of loop when guess is correct

## Example Output (simulated with multiple arguments)
```
Arguments: 50 75 88 92 95 97 99 (and the secret number is 99)

Guess 1: 50 - Too low
Guess 2: 75 - Too low
Guess 3: 88 - Too low
Guess 4: 92 - Too low
Guess 5: 95 - Too low
Guess 6: 97 - Too low
Guess 7: 99 - Correct!
You guessed it in 7 tries!
```

## Hints
- Generate random number: `int randomNumber = (int)(Math.random() * 100) + 1;`
- Use a for loop to iterate through command-line arguments
- Inside, use another variable to track guess count
- Use break to exit the while loop when guess is correct

## Constraints
- Use while loop for guessing logic
- Don't use arrays (well, you get args[] but don't create your own)
- Each command-line argument is one guess

## Success Criteria
- ✅ Random number generated in correct range
- ✅ Loop continues until correct guess
- ✅ Correct feedback for each guess (too high/too low/correct)
- ✅ Guess counter is accurate
- ✅ Program exits cleanly after correct guess
