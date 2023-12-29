`Employee.java`
package com.fliplkart.registration;

public class Employee {
    private int id;
    private String name;
    private double sal;
    private String design;
    private String city;

    // Static variable
    public static String staticVar = "EMPLOYEE STATIC VARIABLE.";

    public Employee() {
        super();
        System.out.println("EMPLOYEE CONSTRUCTOR");
    }

    static {
        System.out.println("EMPLOYEE STATIC BLOCK");
    }

    {
        System.out.println("EMPLOYEE NON STATIC BLOCK");
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Static method
    public static void displayStaticValue() {
        System.out.println("EMPLOYEE STATIC METHOD ");
    }

    public static void main(String[] args) {
        System.out.println("EMPLOYEE OBJECTS USING GETTER AND SETTER - MAIN FUNCTION  ");

        // Display the static variable
        System.out.println(Employee.staticVar);

        // Call the static method
        Employee.displayStaticValue();

        // Create an object of Employee
        Employee emp = new Employee();

        // Set values using setters
        emp.setId(69420);
        emp.setName("John Doe");
        emp.setSal(50000.666);
        emp.setDesign("Software Engineer");
        emp.setCity("New York");

        // Print values using getters
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSal());
        System.out.println("Designation: " + emp.getDesign());
        System.out.println("City: " + emp.getCity());
    }
}