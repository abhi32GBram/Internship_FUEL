package com.intraface;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the string : ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            output.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }

        System.out.println(output.toString().trim());
    }
}







