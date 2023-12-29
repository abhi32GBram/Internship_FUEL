`FullTimeEmployee.java`
package com.inheritance.app;

public class FullTimeEmployee extends BaseEmployee {
    private double annualSalary;

    public FullTimeEmployee(String name, String city, String designation, double annualSalary) {
        super(name, city, designation);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getSalary() {
        return annualSalary;
    }
}