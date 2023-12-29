`Main.java`
package com.inheritance.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("~~ ENTER DETAILS OF FULL TIME EMPLOYEES ~~ ");
        System.out.print("Name: ");
        String fName = scanner.nextLine();
        System.out.print("City: ");
        String fCity = scanner.nextLine();
        System.out.print("Designation: ");
        String fDesignation = scanner.nextLine();
        System.out.print("Annual Salary: ");
        double fSalary = scanner.nextDouble();
        scanner.nextLine(); // consume newline left-over

        FullTimeEmployee ftEmployee = new FullTimeEmployee(fName, fCity, fDesignation, fSalary);
//        ftEmployee.displayInfo();
        System.out.println("Salary: " + ftEmployee.getSalary());

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("ENTER DETAILS OF PART TIME EMPLOYEES :");
        System.out.print("Name: ");
        String pName = scanner.nextLine();
        System.out.print("City: ");
        String pCity = scanner.nextLine();
        System.out.print("Designation: ");
        String pDesignation = scanner.nextLine();
        System.out.print("Hourly Rate: ");
        double pRate = scanner.nextDouble();
        scanner.nextLine(); // consume newline left-over
        System.out.print("Hours Per Week: ");
        int pHours = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        PartTimeEmployee ptEmployee = new PartTimeEmployee(pName, pCity, pDesignation, pRate, pHours);
//        ptEmployee.displayInfo();
        System.out.println("Salary: " + ptEmployee.getSalary());

        while (true) {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Which type of employee's details do you want to see? (1 for Full Time, 2 for Part Time, 3 for Both, 4 to Exit)");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println(" Here are the Details for Full Time Employee:");
                    ftEmployee.displayInfo();
                    System.out.println("Salary: " + ftEmployee.getSalary());
                    break;
                case 2:
                    System.out.println("Here are the Details for Part Time Employee:");
                    ptEmployee.displayInfo();
                    System.out.println("Salary: " + ptEmployee.getSalary());
                    break;
                case 3:
                    System.out.println("Here are the Details for Both Employees:");
                    ftEmployee.displayInfo();
                    System.out.println("Salary: " + ftEmployee.getSalary());
                    ptEmployee.displayInfo();
                    System.out.println("Salary: " + ptEmployee.getSalary());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}