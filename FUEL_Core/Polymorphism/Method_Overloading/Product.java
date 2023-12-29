// This package contains classes related to polymorphism and overloading
package com.polymorphism.overloading;

// The Product class demonstrates the concept of constructor overloading in Java
public class Product {

    // Default constructor for the Product class
    public Product() {
        // Prints a message indicating that the default constructor has been called
        System.out.println("default Constructor");
    }

    // Overloaded constructor that takes an integer as a parameter
    public Product(int a) {
        // Prints a message indicating that the integer constructor has been called
        System.out.println("int construc");
    }

    // Overloaded constructor that takes an integer and a string as parameters
    public Product(int a, String b) {
        // Prints a message indicating that the string and integer constructor has been called
        System.out.println("String and int construc");
    }


}