package com.DS.array;

import java.util.ArrayList;
import java.util.List;

public class collectionsTrainer {

    public static void main(String[] args) {
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

        System.out.println("\n Element at 2nd Index :  " + list1.get(1));

        System.out.println("--------------------------------------------\n");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("printing all the elements using get() : " + list1.get(i));
        }


        System.out.println("--------------------------------------------\n");

    }
}
