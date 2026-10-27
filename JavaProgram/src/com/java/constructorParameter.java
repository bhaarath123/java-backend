package com.java;
public class ConstructorParameter {
    String name;
    int age;

    ConstructorParameter() {
        this.name = "Unknown";
        this.age = 0;
    }

   
    ConstructorParameter(String name) {
        this.name = name;
        this.age = 18;
    }

   
    ConstructorParameter(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
   
    void display() {
        System.out.println("Name: " + name + " | Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorParameter obj = new ConstructorParameter();
        ConstructorParameter obj1 = new ConstructorParameter("Bhaarath");
        ConstructorParameter obj2 = new ConstructorParameter("Janani", 21);
        
 
        System.out.println("--- Testing Overloaded Constructors ---");
        obj.display();
        obj1.display();
        obj2.display();
    }
}
