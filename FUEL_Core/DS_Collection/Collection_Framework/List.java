package com.DS.array;
// Import necessary packages

import java.util.ArrayList;
import java.util.List;

// Define the main class
public class collections {
    // Main method
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> list1 = new ArrayList<String>();
        // Add some String values to the list
        list1.add("Hello");
        list1.add("World");
        list1.add("Java");
        // Print the contents of the list
        System.out.println("Contents of list1:");
        for (String str : list1) {
            System.out.println(str);
        }

        System.out.println("--------------------------------------------\n");

        // Create a List of Integers
        List<Integer> list2 = new ArrayList<Integer>();
        // Add some Integer values to the list
        list2.add(10);
        list2.add(20);
        list2.add(30);
        // Print the contents of the list
        System.out.println("Contents of list2:");
        for (Integer num : list2) {
            System.out.println(num);
        }
        System.out.println("--------------------------------------------\n");


        List<String> list3 = new ArrayList<String>();
        // Add some String values to the list
        list3.add("Welcome ");
        list3.add("To");
        list3.add("The");
        list3.add("Future");
        // Print the contents of the list
        System.out.println("Contents of list3:");
        for (String str : list3) {
            System.out.println(str);
        }
        System.out.println("--------------------------------------------\n");
        // Use addAll() to append all elements from list2 to list1
        list1.addAll(list3);


        // Print the contents of the combined list
        System.out.println("Combined list:");
        for (String str : list1) {
            System.out.println(str);
        }
        System.out.println("--------------------------------------------\n");
    }
}

