package com.java;

public class ProductCompany {
    int productId;
    String productName;
    double price;

    // 1. No-argument constructor
    public ProductCompany() {
        this.productId = 0;
        this.productName = "Unknown Product";
        this.price = 0.0;
        System.out.println("-> No-argument constructor called.");
    }

    // 2. Constructor accepting productId and productName
    public ProductCompany(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
        this.price = 0.0; // Default price
        System.out.println("-> 2-argument constructor called.");
    }

    // 3. Constructor accepting productId, productName, and price
    public ProductCompany(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        System.out.println("-> 3-argument constructor called.");
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId + " | Name: " + productName + " | Price: ₹" + price);
        System.out.println("----------------------------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== Task 4: Product Constructor Overloading ===\n");

        // Object 1 using no-argument constructor
        System.out.println("Creating p1 with no arguments:");
        ProductCompany p1 = new ProductCompany();
        p1.displayProductDetails();

        // Object 2 using 2-argument constructor
        System.out.println("Creating p2 with ID and Name:");
        ProductCompany p2 = new ProductCompany(101, "Logitech Keyboard");
        p2.displayProductDetails();

        // Object 3 using 3-argument constructor
        System.out.println("Creating p3 with ID, Name, and Price:");
        ProductCompany p3 = new ProductCompany(102, "Dell Gaming Monitor", 15499.0);
        p3.displayProductDetails();
    }
}