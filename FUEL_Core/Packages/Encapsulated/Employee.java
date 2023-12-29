
// Package declaration
package com.fliplkart.registration;

// Class declaration
public class Employee {
   // Private integer variable 'id'
   private int id;
   // Private string variable 'name'
   private String name;
   // Private double variable 'sal'
   private double sal;
   // Private string variable 'design'
   private String design;
   // Private string variable 'city'
   private String city;

   // Public static string variable 'staticVar'
   public static String staticVar = "EMPLOYEE STATIC VARIABLE.";

   // Default constructor
   public Employee() {
       // Call to superclass constructor
       super();
       // Print statement
       System.out.println("EMPLOYEE CONSTRUCTOR");
   }

   // Static block
   static {
       // Print statement
       System.out.println("EMPLOYEE STATIC BLOCK");
   }

   // Non-static block
   {
       // Print statement
       System.out.println("EMPLOYEE NON STATIC BLOCK");
   }

   // Getter method for 'id'
   public int getId() {
       return id;
   }

   // Setter method for 'id'
   public void setId(int id) {
       this.id = id;
   }

   // Getter method for 'name'
   public String getName() {
       return name;
   }

   // Setter method for 'name'
   public void setName(String name) {
       this.name = name;
   }

   // Getter method for 'sal'
   public double getSal() {
       return sal;
   }

   // Setter method for 'sal'
   public void setSal(double sal) {
       this.sal = sal;
   }

   // Getter method for 'design'
   public String getDesign() {
       return design;
   }

   // Setter method for 'design'
   public void setDesign(String design) {
       this.design = design;
   }

   // Getter method for 'city'
   public String getCity() {
       return city;
   }

   // Setter method for 'city'
   public void setCity(String city) {
       this.city = city;
   }

   // Static method to display static value
   public static void displayStaticValue() {
       // Print statement
       System.out.println("EMPLOYEE STATIC METHOD ");
   }

   // Main method
   public static void main(String[] args) {
       // Print statement
       System.out.println("EMPLOYEE OBJECTS USING GETTER AND SETTER - MAIN FUNCTION ");

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
