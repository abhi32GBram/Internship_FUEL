``

package com.sbi.company;

// Importing the Scanner class which is used to read input

import java.util.Scanner;

// Defining the Employee class
public class Employee {
    // Declaring instance variables
    int e_id;
    String e_FN;
    String e_city;
    String e_nationality;

    // Creating a static instance of Employee
    static Employee ee = new Employee();

    // Static method to get data from the user
    static void getData() {
        // Creating a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Printing a message to the console
        System.out.println("~ EMPLOYEE INFOGRAPHICS ~ \n\n");

        // Prompting the user to enter their employee ID
        System.out.println("Enter employee ID : ");
        // Reading the employee ID from the user
        ee.e_id = sc.nextInt();

        // Prompting the user to enter their first name
        System.out.println("Enter your First Name : ");
        // Reading the first name from the user
        ee.e_FN = sc.next();

        // Prompting the user to enter their city
        System.out.println("Enter your City : ");
        // Reading the city from the user
        ee.e_city = sc.next();

        // Prompting the user to enter their nationality
        System.out.println("Enter your Nationality : ");
        // Reading the nationality from the user
        ee.e_nationality = sc.next();
    }

    // Static method to display the data
    static void displayData() {
        // Printing a message to the console
        System.out.println("\nStudent Information:");

        // Displaying the employee ID
        System.out.println("ID of the Employee: " + ee.e_id);
        // Displaying the first name
        System.out.println("First Name: " + ee.e_FN);
        // Displaying the city
        System.out.println("City: " + ee.e_city);
        // Displaying the nationality
        System.out.println("Nationality: " + ee.e_nationality);
    }
}