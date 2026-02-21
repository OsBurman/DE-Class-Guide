# Exercise 10: Grade Distribution Analysis (Comprehensive)

## Objective
Comprehensive exercise combining multiple array patterns and control flow concepts.

## Problem Statement
Write a program that analyzes student grades and provides comprehensive statistics:

1. Accept multiple student grades (0-100)
2. Calculate various statistics
3. Show grade distribution
4. Identify students in each grade category

## Requirements

### Input
- Command-line arguments are individual student grades
- Grades are integers 0-100

### Output
1. **Basic Statistics:**
   - Count of students
   - Average grade
   - Highest and lowest grades
   - Median grade

2. **Grade Distribution:**
   - Count of A's (90-100), B's (80-89), C's (70-79), D's (60-69), F's (<60)
   - Percentage of each grade category

3. **Grade List:** Print each grade with its letter grade

## Example Output
```
Command: java GradeAnalyzer 95 87 72 91 66 55 88 78 92 81

Grade Analysis Report:
======================
Total Students: 10
Average: 80.5
Highest: 95
Lowest: 55

Grade Distribution:
A (90-100): 3 students (30%)
B (80-89): 3 students (30%)
C (70-79): 2 students (20%)
D (60-69): 1 student (10%)
F (<60): 1 student (10%)

Individual Grades:
95 -> A
87 -> B
72 -> C
91 -> A
66 -> D
55 -> F
88 -> B
78 -> C
92 -> A
81 -> B
```

## Hints
- Use one loop to find min/max and count grades
- Use helper logic to convert grade to letter
- Use multiple counters for grade categories
- Calculate percentages: (count / total) * 100
- For median: sort array, get middle element (or average of two middle for even count)

## Constraints
- Must use arrays
- Must handle validation (0-100)
- Calculate percentage correctly
- Keep code in main method (or use helper methods)

## Success Criteria
- ✅ All statistics calculated correctly
- ✅ Accurate grade distribution counts
- ✅ Correct percentage calculations (sum to 100%)
- ✅ Proper letter grade assignment
- ✅ Clean, formatted output
- ✅ Handles edge cases (all same grade, single student, etc.)
