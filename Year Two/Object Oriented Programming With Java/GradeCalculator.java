import java.util.HashMap;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> grades = new HashMap<>();
        int totalStudents = 0;
        int sumScores = 0;
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        System.out.println("Welcome to the Grade Calculator!");

        System.out.print("Enter the number of students: ");
        totalStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter the score for student " + i + ": ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Calculate final score
            int finalScore = score * 100 / 70;

            // Assign letter grade
            String grade;
            if (finalScore >= 80) {
                grade = "A";
            } else if (finalScore >= 70) {
                grade = "B";
            } else if (finalScore >= 60) {
                grade = "C";
            } else if (finalScore >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Update frequency of occurrence of each grade
            grades.put(grade, grades.getOrDefault(grade, 0) + 1);

            // Update sum, max, and min scores
            sumScores += finalScore;
            maxScore = Math.max(maxScore, finalScore);
            minScore = Math.min(minScore, finalScore);

            // Display student's index, final score, and grade
            System.out.println("Student " + i + ": Final Score = " + finalScore + ", Grade = " + grade);
        }

        // Calculate average score
        double averageScore = (double) sumScores / totalStudents;

        // Display frequency of occurrence of each grade
        System.out.println("\nFrequency of Grades:");
        for (String grade : grades.keySet()) {
            System.out.println(grade + ": " + grades.get(grade));
        }

        // Display average, max, and min scores
        System.out.println("Average Score: " + averageScore);
        System.out.println("Maximum Score: " + maxScore);
        System.out.println("Minimum Score: " + minScore);

        scanner.close();
    }
}