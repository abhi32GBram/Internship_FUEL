package com.DS.studentApp;

import java.util.ArrayList;
import java.util.List;

public class Demo {


    public static void main(String[] args) {
        // Creating a List of Student objects
        List<Student> stu = new ArrayList<Student>();

        // Creating three Student objects
        Student s = new Student(100, "John", "New York", 1, "Computer Science");
        Student ss = new Student(101, "Jane", "Los Angeles", 2, "Mathematics");
        Student sss = new Student(102, "Bob", "Chicago", 3, "Physics");
        Student ssss = new Student(103, "Lincoln", "Detroit", 4, "Medicine");

        // Adding the Student objects to the List
        stu.add(s);
        stu.add(ss);
        stu.add(sss);
        stu.add(ssss);

        // Using a for-each loop to iterate over the List and print each Student object
        for (Student studs : stu) {
            System.out.println(studs);
        }
    }
}
