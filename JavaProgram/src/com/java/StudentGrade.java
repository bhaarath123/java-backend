package com.java;
public class StudentGrade {
public static String getGrade(int marks)	
{
	return marks>=90 ? "A":
		marks>=80 ? "B":
			marks>=70 ? "C":
				marks>=60 ? "D":
					"F";
				
}

	public static void main(String[] args) {
		int marks=65;
		String grade=getGrade(marks);
		
		System.out.println("marks :"+marks);
		System.out.println("Grade :"+grade);
		}

}
