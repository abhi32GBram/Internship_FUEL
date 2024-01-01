package com.DS.employeeApp;

public class Employee {
    private int id; // Unique identifier for the employee
    private String name; // Name of the employee
    private String city; // City where the employee lives
    private double salary; // Salary of the employee

    // Default constructor
    public Employee() {
        super();
    }

    // Parameterized constructor
    public Employee(int id, String name, String city, double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Overriding the toString method to provide a meaningful string representation of the Employee object
    @Override
    public String toString() {
        return "Employee [ID : " + id + ", Name : " + name + ", City : " + city + ", Salary : " + salary + "]";
    }
}
