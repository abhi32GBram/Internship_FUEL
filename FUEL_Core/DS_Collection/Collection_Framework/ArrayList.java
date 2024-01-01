package com.DS.array;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Define the main class
public class collectionFrame {

    public static void main(String[] args) {
        // Create a Collection object
        Collection cc = new ArrayList();
        // Create a List object
        List ll = new ArrayList();
        // Create an AbstractList object
        AbstractList al = new ArrayList();
        // Create another ArrayList object
        ArrayList Al = new ArrayList();

        // Add elements to the Collection
        cc.add("John Doe");
        cc.add(25);
        cc.add(80000.00);
        cc.add(true);
        // Print the contents of the Collection
        System.out.println("---------------------------");
        System.out.println("This array list contains : " + cc);
        System.out.println("---------------------------");

        // Create a new List object
        List lll = new ArrayList();
        // Add elements to the List
        lll.add("Jane Smith");
        lll.add(30);
        lll.add(90000.00);
        lll.add(false);
        // Print the contents of the List
        System.out.println("This Array List made from the List Interface : " + lll);

        // Use a for-each loop to print each element in the List
        System.out.println("this is a forEach loop");
        for (Object obj : lll) {
            System.out.println(obj);
        }


        // Create a new AbstractList object
        AbstractList aall = new ArrayList();
        // Add elements to the AbstractList
        aall.add("Robert Johnson");
        aall.add(35);
        aall.add(100000.00);
        aall.add(true);

        System.out.println("---------------------------");
        // Print a message indicating that addAll has been used
        System.out.println("added addAll : ");
        aall.addAll(lll);

        System.out.println("---------------------------");

        // Print a message indicating that an AbstractList method has been used
        System.out.println("this is a abstract list method array list : ");

        // Use a for-each loop to print each element in the AbstractList
        for (Object oj : aall) {
            System.out.println(oj);
        }
        System.out.println("---------------------------");
    }
}
