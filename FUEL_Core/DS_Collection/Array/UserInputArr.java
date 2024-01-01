package com.DS.array;

import java.util.Scanner;

public class UserInputObjectArr {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        Object[] array = new Object[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter data for element " + (i + 1) + ":");
            String data = scanner.next();
            array[i] = data;
        }
        System.out.println("OBJECT for HETERGENOUS DATA INPUT");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

