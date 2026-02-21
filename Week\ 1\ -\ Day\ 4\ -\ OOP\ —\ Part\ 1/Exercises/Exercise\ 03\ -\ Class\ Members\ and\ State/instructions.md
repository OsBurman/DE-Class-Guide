# Exercise 03: Class Members and State - Methods that Work with Fields

## Learning Objectives

After completing this exercise, you should be able to:
- Understand how methods interact with object state
- Use methods to calculate values based on fields
- Modify object state through methods
- Recognize that state affects method behavior

## Problem Statement

You're designing a **Student** class for a school system. A student has grades for multiple subjects, and you need methods to calculate GPA, determine letter grades, and track academic standing.

## Requirements

### Part 1: Define the Student Class
Create a class called `Student` with:

**Fields**:
- `name`: String - student's name
- `mathGrade`: double - grade in math (0-100)
- `englishGrade`: double - grade in English (0-100)
- `scienceGrade`: double - grade in Science (0-100)

**Constructor**:
- Takes name and three grades

**Methods**:
- `calculateAverage()`: Returns average of the three grades
- `getLetterGrade()`: Returns letter grade based on average (A: 90+, B: 80-89, C: 70-79, D: 60-69, F: <60)
- `isHonorStudent()`: Returns true if average >= 85
- `displayStudent()`: Prints student info with average and letter grade
- `improveGrade(String subject, double newGrade)`: Updates one subject's grade

### Part 2: Test Your Class
In the `main()` method:
1. Create 2 students with different grades
2. Display each student's info
3. Check if they're honor students
4. Improve one student's grade and display again
5. Show how state changes affect methods

## Example Output

```
--- Student 1 ---
Name: Alice Johnson
Math: 92.0, English: 88.0, Science: 95.0
Average: 91.67
Letter Grade: A
Honor Student: Yes

--- Student 2 ---
Name: Bob Smith
Math: 72.0, English: 78.0, Science: 75.0
Average: 75.0
Letter Grade: C
Honor Student: No

Bob improves his math grade to 85.0
Name: Bob Smith
Math: 85.0, English: 78.0, Science: 75.0
Average: 79.33
Letter Grade: C
Honor Student: No
```

## Hints

- Use a formula to calculate average: (grade1 + grade2 + grade3) / 3.0
- Use if-else statements for letter grade determination
- Remember: Methods should use the object's current state
- State changes (through methods) affect future method calls

## Testing Tips

- Test with different grade combinations
- Verify average calculation is accurate
- Check letter grade assignments
- Test improveGrade() by checking how it changes average
- Consider edge cases (perfect 100s, failing grades, borderline grades)

## Complexity Assessment

**Difficulty**: Easy-Medium  
**Concepts**: Methods, Calculations, State-Dependent Behavior, Field Modification  
**Time Estimate**: 25-35 minutes
