package com.java;
class Student {
	String name;
	int rollNumber;
	
	public void registerStudent(String StudentName,int StudentRoll) {
		name = StudentName;
		rollNumber = StudentRoll;
	}
	
	public void display() {
		System.out.println("Student Name:" + name +"Roll Number:" + rollNumber);
	}
}


public class StudentRegistration {
	public static void main(String[]args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.registerStudent("Bhaarath",101);
		s2.registerStudent("Janani",102);
		s3.registerStudent("kalai",103);
		
		s1.display();
		s2.display();
		s3.display();
		
	}

}
