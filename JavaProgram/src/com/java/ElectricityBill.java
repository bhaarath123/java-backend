package com.java;

public class ElectricityBill {
	public static double calculateElectricityBill(int units) {
	 double totalBill = 0.0;
	 
	 if(units <= 100) {
		 totalBill = units*2;
	 }else if(units <= 200) {
		 totalBill =(100*2) +((units - 100) * 3);
	 }else {
		 totalBill = (100*2) + (100*3) + ((units - 200)*5);
	 }
		return totalBill;
	}
	
	public static void main(String[]args) {
		int testunits = 250;
		double fineBill = calculateElectricityBill(testunits);
		
		System.out.println("units consumed:" + testunits);
		System.out.println("Total Bill Amount:" + fineBill);
	}
}
