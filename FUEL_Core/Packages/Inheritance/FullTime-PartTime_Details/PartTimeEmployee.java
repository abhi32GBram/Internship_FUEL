`PartTimeEmployee.java`
package com.inheritance.app;

public class PartTimeEmployee extends BaseEmployee {
    private double hourlyRate;
    private int hoursPerWeek;

    public PartTimeEmployee(String name, String city, String designation, double hourlyRate, int hoursPerWeek) {
        super(name, city, designation);
        this.hourlyRate = hourlyRate;
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getSalary() {
        return hourlyRate * hoursPerWeek;
    }
}