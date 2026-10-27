package com.java;

public class studentMark {

    // Method to calculate total marks across 5 subjects
    public int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }

    // Method to calculate average marks
    public double calculateAverage(int total) {
        return total / 5.0;
    }

    // Method to calculate grade classification character
    public char calculateGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else {
            return 'F'; // Represents Fail condition bound rules
        }
    }

    // Method to print final report metrics out
    public void displayReport(int total, double average, char grade) {
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
    	studentMark student = new studentMark();

        // Sample Input array parameters
        int m1 = 85, m2 = 78, m3 = 92, m4 = 88, m5 = 77;

        // Method execution sequences
        int totalMarks = student.calculateTotal(m1, m2, m3, m4, m5);
        double averageMarks = student.calculateAverage(totalMarks);
        char finalGrade = student.calculateGrade(averageMarks);

        // Printing results out
        System.out.println("=== Scenario 2: Student Marks ===");
        student.displayReport(totalMarks, averageMarks, finalGrade);
    }
}
