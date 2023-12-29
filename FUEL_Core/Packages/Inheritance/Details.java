`Details.java`

package com.fliplkart.registration;

public class Details extends Main {

    int e_id = 12345;
    String e_name = "John Doe";
    String e_city = "New York";
    double e_annualSal = 50000.00;
    String designation = "Software Engineer";

    public static void main(String[] args) {
        Details d = new Details();

        System.out.println("ID: " + d.e_id);
        System.out.println("Name: " + d.e_name);
        System.out.println("City: " + d.e_city);
        System.out.println("Annual Salary: " + d.e_annualSal);
        System.out.println("Designation: " + d.designation);
    }
}