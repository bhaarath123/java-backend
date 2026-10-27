package com.java;

public class onlineShopping {

    // Method to calculate discount based on membership type
    public double calculateDiscount(double purchaseAmount, String membershipType) {
        double discountPercentage = 0.0;

        // Apply discount rates based on membership tier
        if (membershipType.equalsIgnoreCase("Premium")) {
            discountPercentage = 15.0; // 15% discount for Premium members
        } else if (membershipType.equalsIgnoreCase("VIP")) {
            discountPercentage = 20.0; // 20% discount for VIP members
        } else if (membershipType.equalsIgnoreCase("Regular")) {
            discountPercentage = 5.0;  // 5% discount for Regular members
        } else {
            discountPercentage = 0.0;  // No discount for others
        }

        return purchaseAmount * (discountPercentage / 100.0);
    }

    // Method to calculate the final bill amount after discount
    public double calculateFinalBill(double purchaseAmount, double discountAmount) {
        return purchaseAmount - discountAmount;
    }

    // Method to display the final shopping receipt details
    public void displayReceipt(String customerName, String membershipType, double purchaseAmount, double discount, double finalBill) {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Original Purchase Amount: ₹" + purchaseAmount);
        System.out.println("Discount Received: ₹" + discount);
        System.out.println("Final Bill Amount to Pay: ₹" + finalBill);
    }

    public static void main(String[] args) {
        // Creating the object without using a constructor as required
    	onlineShopping shoppingApp = new onlineShopping();

        // Sample Input Values
        String customerName = "Bhaarath";
        double purchaseAmount = 5000.0;
        String membershipType = "Premium";

        // Processing calculations via sequential method streams
        double discountAmount = shoppingApp.calculateDiscount(purchaseAmount, membershipType);
        double finalBill = shoppingApp.calculateFinalBill(purchaseAmount, discountAmount);

        // Printing out the final receipt
        System.out.println("=== Scenario 3: Online Shopping Bill ===");
        shoppingApp.displayReceipt(customerName, membershipType, purchaseAmount, discountAmount, finalBill);
    }
}
