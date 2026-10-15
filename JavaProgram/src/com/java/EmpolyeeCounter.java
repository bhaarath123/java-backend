package com.java;
class Empolyee{
	String name;
	
	static int empolyeeCount = 0;
	public void registerEmpolyee(String empName) {
		name = empName;
		empolyeeCount++;
	}
	
	public static int getEmployeeCount() {
		return empolyeeCount;
	}
}
public class EmpolyeeCounter {

	public static void main(String[] args) {
		Empolyee emp1 = new Empolyee();
		Empolyee emp2 = new Empolyee();
		Empolyee emp3 = new Empolyee();
		
		emp1.registerEmpolyee("bhaarath");
		emp2.registerEmpolyee("vikram");
		emp3.registerEmpolyee("rohan");
		
		System.out.println("Total empolyee objects registered:" + Empolyee.getEmployeeCount());

	}

}
