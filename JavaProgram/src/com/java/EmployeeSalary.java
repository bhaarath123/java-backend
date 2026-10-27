package com.java;

public class EmployeeSalary {
	
	public double calculateSalary(double basicSalary, double allowance) {
		return basicSalary + allowance;
	}
	
	public double calculateNetSalary(double grossSalary,double dedutions) {
		return grossSalary - dedutions;
	}
     
	public void displayDetails(String employeeName, double grossSalary, double netSalary) {
		System.out.println("Empolyee Name: " + employeeName);
		System.out.println("Gross Salary: " + grossSalary);
		System.out.println("Net Salary: " + netSalary);
	}
	
	public static void main(String[] args) {
		EmployeeSalary emp = new EmployeeSalary();
		 String name = "Bhaarath";
		 double basic = 25000.0;
		 double allowance = 5000.0;
		 double dedutions = 2000.0;
		 
		 double gross = emp.calculateSalary(basic, allowance);
		 double  net = emp.calculateNetSalary(gross, dedutions);
		 
		 System.out.println("=== Empolyee Salary ===");
		 emp.displayDetails(name, gross, net);

	}

}
