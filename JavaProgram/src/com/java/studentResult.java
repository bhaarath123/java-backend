package com.java;
class student {
	String name;
	int id;
	int marks;
	student(String name,int id,int marks){
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	void display() {
		System.out.println("name" + name);
		System.out.println("id" + id);
		System.out.println("marks" + marks);
		}
}

public class studentResult {
	public static void main(String[] args) {
		student s = new student("bhaarath",9872,80);
		s.display();
		}
	}
