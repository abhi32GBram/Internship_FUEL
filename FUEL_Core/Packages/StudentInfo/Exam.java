`Exam.java`

package com.sbi.transaction;

import java.util.*;

public class Exam {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("~ STUDENT INFO EXTRACTION ~ \n\n");

        System.out.println("Enter the Roll No : ");
        s1.rollNo = sc.nextInt();

        System.out.println("Enter the Name : ");
        s1.name = sc.next();

        System.out.println("Enter the Branch : ");
        s1.branch = sc.next();

        System.out.println("Enter the Id : ");
        s1.Id = sc.next();

        // Print out the student information
        System.out.println("\nStudent Information:");
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Name: " + s1.name);
        System.out.println("Branch: " + s1.branch);
        System.out.println("Id: " + s1.Id);
    }
}