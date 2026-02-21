public class GradeCalculator {
    public static void main(String[] args) {
        // Get the score from command line argument
        int score = Integer.parseInt(args[0]);

        // Validate that score is between 0 and 100
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }

        // Use if-else if-else structure to assign grade
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Print the grade
        System.out.println("Grade: " + grade);

        // Check if score >= 95
        if (score >= 95) {
            System.out.println("Outstanding performance!");
        }
    }
}
