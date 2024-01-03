// Package declaration
package com.fle.ops;

// Import necessary classes

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Main class declaration
public class deomy {

    // Main method
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Create a File object representing the file at the specified path
        File f1 = new File("C:\\Users\\VC\\Desktop\\RUB=ish\\pusss.txt");

        // Declare a FileInputStream object
        FileInputStream f2 = null;

        // Open the file and assign the FileInputStream to f2
        f2 = new FileInputStream(f1);

        // Print a message indicating that the file was found
        System.out.println("File Found !!! ");

        // Declare a String variable and initialize it to null
        String string = null;

        // Attempt to print the first character of the string
        // This will throw a NullPointerException because string is null
        System.out.println(string.charAt(0));

        // Finally block to ensure resources are cleaned up
        f2.close();

        // Print a message indicating that the file has been closed
        System.out.println("file got closed");
    }
}
