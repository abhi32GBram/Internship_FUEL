package com.DS.employeeApp;

// Importing necessary classes
import java.util.ArrayList;
import java.util.List;

// Defining the main class
public class Demo {

    // Main method
    public static void main(String[] args) {
        // Creating a List of Employee objects
        List<Employee> emp = new ArrayList<Employee>();

        // Creating three Employee objects
        Employee e = new Employee(100, "joe", "pune", 4343434);
        Employee ee = new Employee(101, "jogn", "blore", 6677);
        Employee eee = new Employee(102, "abv", "delhi", 1212);

        // Adding the Employee objects to the List
        emp.add(e);
        emp.add(ee);
        emp.add(eee);

        // Using a for-each loop to iterate over the List and print each Employee object
        for (Employee emps : emp) {
            System.out.println(emps);
        }
    }
}
