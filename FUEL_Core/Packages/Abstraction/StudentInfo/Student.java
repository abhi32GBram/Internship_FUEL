`Student.java`
package com.fliplkart.registration;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private String major;
    private String university;

    // Static variable
    public static String staticVar = "STUDENT STATIC VARIABLE.";

    public Student() {
        super();
        System.out.println("STUDENT CONSTRUCTOR");
    }

    static {
        System.out.println("STUDENT STATIC BLOCK");
    }

    {
        System.out.println("STUDENT NON STATIC BLOCK");
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    // Static method
    public static void displayStaticValue() {
        System.out.println("STUDENT STATIC METHOD ");
    }

    public static void main(String[] args) {
        System.out.println("STUDENT OBJECTS USING GETTER AND SETTER - MAIN FUNCTION ");

        // Display the static variable
        System.out.println(Student.staticVar);

        // Call the static method
        Student.displayStaticValue();

        // Create an object of Student
        Student stu = new Student();

        // Set values using setters
        stu.setId(12345);
        stu.setName("Jane Doe");
        stu.setGpa(3.8);
        stu.setMajor("Computer Science");
        stu.setUniversity("Harvard University");

        // Print values using getters
        System.out.println("ID: " + stu.getId());
        System.out.println("Name: " + stu.getName());
        System.out.println("GPA: " + stu.getGpa());
        System.out.println("Major: " + stu.getMajor());
        System.out.println("University: " + stu.getUniversity());
    }
}