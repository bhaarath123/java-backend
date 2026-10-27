package com.java;

public class employeeConstructor {
	int id;
	String name;
	double salary;
	
	employeeConstructor(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		if(salary>=50000) {
			System.out.println(id+" "+name+" "+salary);
		}
	}

	public static void main(String[] args) {
		employeeConstructor obj = new employeeConstructor(1,"Bhaarath",55000);
		employeeConstructor obj1 = new employeeConstructor(2,"Janani",65000);
		employeeConstructor obj2 = new employeeConstructor(3,"prabhu",25000);
		
         obj.display();
         obj1.display();
         obj2.display();
         }
	}
