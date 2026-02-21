# Exercise 02: Day of Week Identifier using Switch

## Objective
Practice using switch statements and understand fall-through behavior.

## Problem Statement
Write a program that takes a number (1-7) and prints the corresponding day of the week. Also indicate whether it's a weekday or weekend.

Days:
- 1 = Monday (weekday)
- 2 = Tuesday (weekday)
- 3 = Wednesday (weekday)
- 4 = Thursday (weekday)
- 5 = Friday (weekday)
- 6 = Saturday (weekend)
- 7 = Sunday (weekend)

## Requirements
1. **Input**: Accept a day number as command-line argument
2. **Use Switch**: Implement using a switch statement (not if-else)
3. **Day Output**: Print the day name for valid inputs
4. **Weekday/Weekend**: Print whether it's a "weekday" or "weekend"
5. **Invalid Input**: For numbers outside 1-7, print "Invalid day"

## Example Output
```
Enter day (1-7): 3
Wednesday is a weekday

Enter day (1-7): 6
Saturday is a weekend

Enter day (1-7): 0
Invalid day

Enter day (1-7): 8
Invalid day
```

## Hints
- Use a switch statement on the day number
- Use fall-through behavior to group cases
- Remember to include `break;` statements
- The default case should handle invalid input

## Constraints
- Must use switch statement (not if-else)
- Don't use Arrays or Loops
- Keep all code in main method

## Success Criteria
- ✅ All 7 days correctly identified
- ✅ Weekday/weekend classification correct
- ✅ Invalid input (0, 8, negative, >100) handled properly
- ✅ No fall-through bugs (each case has break)
- ✅ Proper output formatting
