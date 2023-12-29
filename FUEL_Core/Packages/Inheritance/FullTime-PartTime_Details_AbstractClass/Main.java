`Main.java`
package com.abstractt.app;

import java.util.Scanner;

// Declaring the Main class
public class Main {
    // The main method where execution begins
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Printing a message to the user
        System.out.println("~~ ENTER DETAILS OF FULL TIME EMPLOYEES ~~ ");

        // Prompting the user to enter the name of the full time employee
        System.out.print("Name: ");
        // Reading the name entered by the user
        String fName = scanner.nextLine();

        // Prompting the user to enter the city of the full time employee
        System.out.print("City: ");
        // Reading the city entered by the user
        String fCity = scanner.nextLine();

        // Prompting the user to enter the designation of the full time employee
        System.out.print("Designation: ");
        // Reading the designation entered by the user
        String fDesignation = scanner.nextLine();

        // Prompting the user to enter the annual salary of the full time employee
        System.out.print("Annual Salary: ");
        // Reading the annual salary entered by the user
        double fSalary = scanner.nextDouble();

        // Consuming the newline left-over after reading the double value
        scanner.nextLine();

        // Creating a FullTimeEmployee object with the details entered by the user
        FullTimeEmployee ftEmployee = new FullTimeEmployee(fName, fCity, fDesignation, fSalary);

        // Printing the calculated salary of the full time employee
        // THIS IS A VALID STATEMENT BUT A PERSONAL CHOICE TO NOT SHOW IT
        // // System.out.println("Salary: " + ftEmployee.calculateSalary());

        // Printing a separator line
        System.out.println("\n------------------------------------------------------------------\n");
        // Prompting the user to enter the details of part time employees
        System.out.println("ENTER DETAILS OF PART TIME EMPLOYEES :");
        System.out.print("Name: ");
        // Reading the name entered by the user
        String pName = scanner.nextLine();
        System.out.print("City: ");
        // Reading the city entered by the user
        String pCity = scanner.nextLine();
        System.out.print("Designation: ");
        // Reading the designation entered by the user
        String pDesignation = scanner.nextLine();
        System.out.print("Hourly Rate: ");
        // Reading the hourly rate entered by the user
        double pRate = scanner.nextDouble();
        // Consuming the newline left-over after reading the double value
        scanner.nextLine();
        System.out.print("Hours Per Week: ");
        // Reading the hours per week entered by the user
        int pHours = scanner.nextInt();
        // Consuming the newline left-over after reading the integer value
        scanner.nextLine();

        // Creating a PartTimeEmployee object with the details entered by the user
        PartTimeEmployee ptEmployee = new PartTimeEmployee(pName, pCity, pDesignation, pRate, pHours);

        // Printing the calculated salary of the part time employee
        // THIS IS A VALID STATEMENT BUT A PERSONAL CHOICE TO NOT SHOW IT
        // // System.out.println("Salary: " + ptEmployee.calculateSalary());

        // Infinite loop to keep the program running until the user chooses to exit
        while (true) {
            // Printing a separator line
            System.out.println("\n------------------------------------------------------------------\n");
            // Prompting the user to choose which type of employee's details they want to see
            System.out.println("Which type of employee's details do you want to see? (1 for Full Time, 2 for Part Time, 3 for Both, 4 to Exit)");
            // Reading the choice entered by the user
            int choice = scanner.nextInt();
            // Consuming the newline left-over after reading the integer value
            scanner.nextLine();

            // Switch statement to handle the user's choice
            switch (choice) {
                // Case 1: Display details of full time employee
                case 1:
                    System.out.println(" Here are the Details for Full Time Employee:");
                    ftEmployee.displayInfo();
                    System.out.println("Salary: " + ftEmployee.calculateSalary());
                    break;
                // Case 2: Display details of part time employee
                case 2:
                    System.out.println("Here are the Details for Part Time Employee:");
                    ptEmployee.displayInfo();
                    System.out.println("Salary: " + ptEmployee.calculateSalary());
                    break;
                // Case 3: Display details of both employees
                case 3:
                    System.out.println("Here are the Details for Both Employees:");
                    ftEmployee.displayInfo();
                    System.out.println("Salary: " + ftEmployee.calculateSalary());

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    ptEmployee.displayInfo();
                    System.out.println("Salary: " + ptEmployee.calculateSalary());
                    break;
                // Case 4: Exit the program
                case 4:
                    System.out.println("Exiting...");
                    // Closing the scanner object
                    scanner.close();
                    // Returning from the main method
                    return;
                // Default case: Invalid choice
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}