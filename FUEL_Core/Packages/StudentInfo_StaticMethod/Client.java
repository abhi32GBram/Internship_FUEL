`Client.java`
package com.sbi.company;

// Defining the Client class
public class Client {
    // Main method where execution begins
    public static void main(String[] args) {

        // Calling the getData method of the Employee class
        // This will prompt the user to enter their data
        Employee.getData();

        // Calling the displayData method of the Employee class
        // This will print out the data entered by the user
        Employee.displayData();
    }
}