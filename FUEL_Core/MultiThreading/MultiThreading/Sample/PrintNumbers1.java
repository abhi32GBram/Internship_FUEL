package com.multiThreading5Jan.Jan8_sample;
// write a program which involves 3 different classes and 1 test class with the main function . override the run() from thread in those 3 class files and  start (start()) 3 different instances of them. have a for loop printing out some numbers of different ranges in those 3 classes

import java.lang.Thread;

public class PrintNumbers1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Class 1: " + i);
        }
    }
}