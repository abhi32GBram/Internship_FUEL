`FullTimeEmployee.java`

package com.abstractt.app;

// Class declaration extending the BaseEmployee abstract class
public class FullTimeEmployee extends BaseEmployee {
    // Private variable for annual salary
    private double annualSalary;

    // Constructor for FullTimeEmployee
    public FullTimeEmployee(String name, String city, String designation, double annualSalary) {
        // Calling the constructor of the superclass BaseEmployee
        super(name, city, designation);
        // Initializing instance variable with value passed in the constructor
        this.annualSalary = annualSalary;
    }

    // Overriding the calculateSalary method from the BaseEmployee class
    @Override
    public double calculateSalary() {
        // Returning the annual salary as it is
        return annualSalary;
    }
}