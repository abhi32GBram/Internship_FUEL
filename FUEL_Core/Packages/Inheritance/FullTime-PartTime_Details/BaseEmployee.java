`BaseEmployee.java`
package com.inheritance.app;
public class BaseEmployee {
    private String name;
    private String city;
    private String designation;

    public BaseEmployee(String name, String city, String designation) {
        this.name = name;
        this.city = city;
        this.designation = designation;
    }

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

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Designation: " + designation);
    }
}