package com.DS.studentApp;

public class Student {
    private int id; // Unique identifier for the student
    private String name; // Name of the student
    private String city; // City where the student lives
    private int gradeLevel; // Grade level of the student
    private String major; // Major of the student

    // Default constructor
    public Student() {
        super();
    }

    // Parameterized constructor
    public Student(int id, String name, String city, int gradeLevel, String major) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.gradeLevel = gradeLevel;
        this.major = major;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public String getMajor() {
        return major;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Overriding the toString method to provide a meaningful string representation of the Student object
    @Override
    public String toString() {
        return "Student [ID : " + id + ", Name : " + name + ", City : " + city + ", Grade Level : " + gradeLevel + ", Major : " + major + "]";
    }
}
