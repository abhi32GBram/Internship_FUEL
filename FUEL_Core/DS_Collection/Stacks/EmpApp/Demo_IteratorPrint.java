package com.DS.stack.empApp;

// Importing necessary classes

import java.util.Iterator;
import java.util.Stack;

// Defining the main class
public class DemoIterator {

    // Main method
    public static void main(String[] args) {
        // Creating a Stack of Employee objects
        Stack<Employee> emp = new Stack<>();

        // Creating three Employee objects
        Employee e = new Employee(100, "joe", "pune", 4343434);
        Employee ee = new Employee(101, "jogn", "bangalore", 6677);
        Employee eee = new Employee(102, "abv", "delhi", 1212);

        // Adding the Employee objects to the Stack
        emp.push(e);
        emp.push(ee);
        emp.push(eee);

        // Printing label for the output
        System.out.println("Employees in the Stack (Printed Using Iterator ):");

        // Creating an Iterator for the Stack
        Iterator<Employee> itr = emp.iterator();

        // Using the Iterator to print each Employee object
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
