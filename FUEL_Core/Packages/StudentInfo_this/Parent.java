package com.fliplkart.registration;

public class Parent {
  public static void main(String[] args) {
      // Create an instance of the Student class
      Student student = new Student();

      // Call the data method on the student instance
      student.data(1, "John Doe", "New York");

      // Display the student's data
      student.display();
  }
}