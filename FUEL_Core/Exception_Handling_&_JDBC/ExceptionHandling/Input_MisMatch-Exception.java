package com.modifiers.example;
// Import necessary packages

import java.util.InputMismatchException;
import java.util.Scanner;

// Define the Main class
public class Main {
    // Define the main method
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Try block to handle exceptions
        try {
            // Prompt user to enter full time employee details
            System.out.println("~~ ENTER DETAILS OF FULL TIME EMPLOYEES ~~ ");

            // Read full time employee ID
            System.out.print("ID: ");
            int fId = scanner.nextInt();

            // Read full time employee name
            System.out.print("Name: ");
            String fName = scanner.next();

            // Read full time employee city
            System.out.print("City: ");
            String fCity = scanner.next();

            // Read full time employee designation
            System.out.print("Designation: ");
            String fDesignation = scanner.next();

            // Read full time employee annual salary
            System.out.print("Annual Salary: ");
            double fSalary = scanner.nextDouble();

            // Read full time employee years of service
            System.out.print("Years of Service: ");
            int fYearsOfService = scanner.nextInt();

            // Create a FullTimeEmployee object
            FullTimeEmployee ftEmployee = new FullTimeEmployee(fId, fName, fSalary, fCity, fDesignation, fYearsOfService);

            // Print separator line
            System.out.println("\n------------------------------------------------------------------\n");

            // Prompt user to enter part time employee details
            System.out.println("ENTER DETAILS OF PART TIME EMPLOYEES :");

            // Read part time employee ID
            System.out.print("ID: ");
            int pId = scanner.nextInt();

            // Read part time employee name
            System.out.print("Name: ");
            String pName = scanner.next();

            // Read part time employee city
            System.out.print("City: ");
            String pCity = scanner.next();

            // Read part time employee designation
            System.out.print("Designation: ");
            String pDesignation = scanner.next();

            // Read part time employee hourly rate
            System.out.print("Hourly Rate: ");
            double pRate = scanner.nextDouble();

            // Read part time employee hours per week
            System.out.print("Hours Per Week: ");
            int pHours = scanner.nextInt();

            // Create a PartTimeEmployee object
            PartTimeEmployee ptEmployee = new PartTimeEmployee(pId, pName, pRate, pCity, pDesignation, pHours);

            // Loop to continuously prompt user for action
            while (true) {
                // Print separator line
                System.out.println("\n------------------------------------------------------------------\n");

                // Prompt user to choose type of employee details to view
                System.out.println("TYPE OF EMPLOYEE DETAILS YOU WANT TO SEE : \n(1) for FULL TIME \n(2) for PART TIME , \n(3) for BOTH, \n(4) to EXIT)");
                System.out.println("------------------------------------------------------------------");

                // Read user's choice
                int choice = scanner.nextInt();

                // Switch statement to perform action based on user's choice
                switch (choice) {
                    case 1:
                        // Display full time employee details
                        System.out.println(" ~~DETAILS OF FULL TIME EMPLOYEE~~");
                        ftEmployee.displayInfo();
                        break;
                    case 2:
                        // Display part time employee details
                        System.out.println("~~DETAILS OF PART TIME EMPLOYEE~~");
                        ptEmployee.displayInfo();
                        break;
                    case 3:
                        // Display both full time and part time employee details
                        System.out.println("~~DETAILS OF BOTH THE EMPLOYEES~~");
                        ftEmployee.displayInfo();
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        ptEmployee.displayInfo();
                        break;
                    case 4:
                        // Exit the program
                        System.out.println("Bye :) ");
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        // Invalid choice
                        System.out.println("Invalid choice !!!");
                }
            }
        } catch (InputMismatchException e) {
            // Handle invalid input
            System.out.println("Invalid input! Please enter valid data.");
        } finally {
            // Close the scanner
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}