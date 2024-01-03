package com.DS.sets.studentApp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        // Creating a Set of Student objects using HashSet
        Set<Student> stu = new HashSet<Student>();

        // Creating four Student objects
        Student s = new Student(100, "John", "New York", 1, "Computer Science");
        Student ss = new Student(101, "Jane", "Los Angeles", 2, "Mathematics");
        Student sss = new Student(102, "Bob", "Chicago", 3, "Physics");
        Student ssss = new Student(103, "Lincoln", "Detroit", 4, "Medicine");
        Student imp = new Student(103, "Lincoln", "Detroit", 4, "Medicine");

        // Adding the Student objects to the Set
        stu.add(s);
        stu.add(ss);
        stu.add(sss);
        stu.add(ssss);
        stu.add(imp);


//        System.out.println("ELEMENTS FROM THE SET ");
//        // Using a for-each loop to iterate over the Set and print each Student object
//        for (Student studs : stu) {
//            System.out.println(studs);
//        }

        // Using Iterator to print all the elements of the set
        Iterator<Student> iterator = stu.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}



