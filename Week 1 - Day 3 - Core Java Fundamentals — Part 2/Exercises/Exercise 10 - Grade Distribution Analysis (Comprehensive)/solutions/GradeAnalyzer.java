public class GradeAnalyzer {
    public static void main(String[] args) {
        // Validate input
        if (args.length == 0) {
            System.out.println("Please provide at least one grade");
            return;
        }

        // Parse grades and validate
        int[] grades = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            grades[i] = Integer.parseInt(args[i]);
            if (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Invalid grade: " + grades[i]);
                return;
            }
        }

        // Calculate statistics
        int sum = 0;
        int min = grades[0];
        int max = grades[0];
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int grade : grades) {
            sum += grade;
            if (grade < min)
                min = grade;
            if (grade > max)
                max = grade;

            // Count by letter grade
            if (grade >= 90)
                countA++;
            else if (grade >= 80)
                countB++;
            else if (grade >= 70)
                countC++;
            else if (grade >= 60)
                countD++;
            else
                countF++;
        }

        double average = (double) sum / grades.length;

        // Print report header
        System.out.println("Grade Analysis Report:");
        System.out.println("======================");
        System.out.println("Total Students: " + grades.length);
        System.out.printf("Average: %.1f\n", average);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
        System.out.println();

        // Print distribution
        System.out.println("Grade Distribution:");
        printDistribution("A (90-100)", countA, grades.length);
        printDistribution("B (80-89)", countB, grades.length);
        printDistribution("C (70-79)", countC, grades.length);
        printDistribution("D (60-69)", countD, grades.length);
        printDistribution("F (<60)", countF, grades.length);
        System.out.println();

        // Print individual grades
        System.out.println("Individual Grades:");
        for (int grade : grades) {
            String letterGrade = getLetterGrade(grade);
            System.out.println(grade + " -> " + letterGrade);
        }
    }

    // Helper method to get letter grade
    private static String getLetterGrade(int grade) {
        if (grade >= 90)
            return "A";
        if (grade >= 80)
            return "B";
        if (grade >= 70)
            return "C";
        if (grade >= 60)
            return "D";
        return "F";
    }

    // Helper method to print distribution with percentage
    private static void printDistribution(String category, int count, int total) {
        double percentage = (double) count / total * 100;
        String student = count == 1 ? "student" : "students";
        System.out.printf("%s: %d %s (%.0f%%)\n", category, count, student, percentage);
    }
}
