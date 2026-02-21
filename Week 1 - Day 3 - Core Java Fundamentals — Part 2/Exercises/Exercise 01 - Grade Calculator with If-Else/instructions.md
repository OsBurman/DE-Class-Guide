# Exercise 01: Grade Calculator with If-Else

## Objective
Practice using if-else statements and understanding conditional logic flow.

## Problem Statement
Write a program that takes a student's numeric score (0-100) and outputs their letter grade using the following grading scale:
- 90-100: A
- 80-89: B
- 70-79: C
- 60-69: D
- Below 60: F

Additionally, if the score is 95 or above, print "Outstanding performance!"

## Requirements
1. **Input**: Accept a score as a command-line argument
2. **Validation**: Check if the score is valid (0-100). If not, print "Invalid score"
3. **Grade Assignment**: Use if-else if-else structure (NOT switch) to assign grades
4. **Bonus Message**: Check for scores 95+ and print bonus message
5. **Output Format**: Print both the grade and the bonus message (if applicable)

## Example Output
```
Enter score: 85
Grade: B

Enter score: 98
Grade: A
Outstanding performance!

Enter score: 150
Invalid score

Enter score: 45
Grade: F
```

## Hints
- Start with an if statement to validate the input range
- Use else if for each grade bracket
- Remember that conditions are checked in order - the first TRUE condition wins
- Use logical operators (&&) if you need to check multiple conditions in one statement

## Constraints
- Don't use switch statements for this exercise
- Don't use Arrays or Loops
- Keep all code in the main method

## Success Criteria
- ✅ All 6 grade levels correctly assigned
- ✅ Invalid input correctly identified
- ✅ Bonus message displays for scores >= 95
- ✅ Program exits gracefully with no errors
- ✅ Code is readable with consistent indentation
