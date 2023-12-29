`PartTimeEmployee.java`

// Package declaration
package com.abstractt.app;

// Class declaration extending the BaseEmployee abstract class
public class PartTimeEmployee extends BaseEmployee {
    // Private variables for hourly rate and hours per week
    private double hourlyRate;
    private int hoursPerWeek;

    // Constructor for PartTimeEmployee
    public PartTimeEmployee(String name, String city, String designation, double hourlyRate, int hoursPerWeek) {
        // Calling the constructor of the superclass BaseEmployee
        super(name, city, designation);
        // Initializing instance variables with values passed in the constructor
        this.hourlyRate = hourlyRate;
        this.hoursPerWeek = hoursPerWeek;
    }

    // Overriding the calculateSalary method from the BaseEmployee class
    @Override
    public double calculateSalary() {
        // Calculating the salary by multiplying the hourly rate with the hours per week
        return hourlyRate * hoursPerWeek;
    }
}