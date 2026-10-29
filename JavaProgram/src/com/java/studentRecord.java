package com.java;

public class studentRecord {
    int rollNumber;
    String studentName;
    double marks;

    // Parameterized constructor to initialize original student details
    public studentRecord(int rollNumber, String studentName, double marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Copy constructor accepting another StudentRecord object as an argument
    public studentRecord(studentRecord otherStudent) {
        this.rollNumber = otherStudent.rollNumber;
        this.studentName = otherStudent.studentName;
        this.marks = otherStudent.marks;
    }

    // Method to display student records
    public void displayRecord() {
        System.out.println("Roll No: " + rollNumber + " | Name: " + studentName + " | Marks: " + marks);
    }

    public static void main(String[] args) {
        System.out.println("=== Task 5: Student Record Copy Constructor ===\n");

        // 1. Create an original student object
        System.out.println("--- Registering Original Student ---");
        studentRecord originalStudent = new studentRecord(45, "Bhaarath", 88.5);
        originalStudent.displayRecord();

        // 2. Create a copied student object using the copy constructor
        System.out.println("\n--- Cloning Record using Copy Constructor ---");
        studentRecord copiedStudent = new studentRecord(originalStudent);
        copiedStudent.displayRecord();
    }
}