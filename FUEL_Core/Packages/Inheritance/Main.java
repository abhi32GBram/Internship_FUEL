`Main.java`

package com.fliplkart.registration;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee ff = new FullTimeEmployee();
        Details dd = new Details();

        System.out.println("Details Object (dd):");
        System.out.println("ID: " + dd.e_id);
        System.out.println("City: " + dd.e_city);
        System.out.println("Annual Salary: " + dd.e_annualSal);
        System.out.println("Name: " + dd.e_name);
        System.out.println("Designation: " + dd.designation);

        System.out.println("\n---------------------------------------------------------------\n");

        System.out.println("FullTimeEmployee Object (ff):");
        System.out.println("ID: " + ff.e_id);
        System.out.println("City: " + ff.e_city);
        System.out.println("Hourly Salary: " + ff.e_hrlySal);
        System.out.println("Name: " + ff.e_name);
        System.out.println("Designation: " + ff.designation);
    }
}