`BaseEmployee.java`
// Package declaration
package com.abstractt.app;

// Abstract class declaration
public abstract class BaseEmployee {
    // Protected variables accessible within the same package and subclasses
    protected String name;
    protected String city;
    protected String designation;

    // Constructor for BaseEmployee
    public BaseEmployee(String name, String city, String designation) {
        // Initializing instance variables with values passed in the constructor
        this.name = name;
        this.city = city;
        this.designation = designation;
    }

    // Getter methods for the instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Method to display the details of the employee
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Designation: " + designation);
    }

    // Abstract method to calculate the salary of the employee
    // This method must be implemented by any class that extends BaseEmployee
    public abstract double calculateSalary();
}