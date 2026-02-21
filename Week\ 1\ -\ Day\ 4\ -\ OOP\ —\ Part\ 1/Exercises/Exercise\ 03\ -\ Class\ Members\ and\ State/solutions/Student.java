/**
 * Exercise 03: Class Members and State - SOLUTION
 * 
 * This solution demonstrates:
 * - Methods that calculate based on object state
 * - How state changes affect method behavior
 * - Complex methods with conditional logic
 */
public class Student {
    
    String name;
    double mathGrade;
    double englishGrade;
    double scienceGrade;
    
    // Constructor
    public Student(String name, double mathGrade, double englishGrade, double scienceGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }
    
    // Calculate average of the three grades
    double calculateAverage() {
        return (mathGrade + englishGrade + scienceGrade) / 3.0;
    }
    
    // Determine letter grade based on average
    char getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }
    
    // Check if student qualifies for honor roll
    boolean isHonorStudent() {
        return calculateAverage() >= 85;
    }
    
    // Display student information
    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.printf("Math: %.1f, English: %.1f, Science: %.1f%n", mathGrade, englishGrade, scienceGrade);
        System.out.printf("Average: %.2f%n", calculateAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Honor Student: " + (isHonorStudent() ? "Yes" : "No"));
    }
    
    // Improve a specific grade
    void improveGrade(String subject, double newGrade) {
        if (subject.equalsIgnoreCase("math")) {
            mathGrade = newGrade;
        } else if (subject.equalsIgnoreCase("english")) {
            englishGrade = newGrade;
        } else if (subject.equalsIgnoreCase("science")) {
            scienceGrade = newGrade;
        }
    }
    
    public static void main(String[] args) {
        // Create Student 1
        System.out.println("--- Student 1 ---");
        Student student1 = new Student("Alice Johnson", 92, 88, 95);
        student1.displayStudent();
        
        System.out.println();
        
        // Create Student 2
        System.out.println("--- Student 2 ---");
        Student student2 = new Student("Bob Smith", 72, 78, 75);
        student2.displayStudent();
        
        System.out.println();
        
        // Improve Bob's math grade
        System.out.println("Bob improves his math grade to 85.0");
        student2.improveGrade("math", 85.0);
        student2.displayStudent();
    }
}
