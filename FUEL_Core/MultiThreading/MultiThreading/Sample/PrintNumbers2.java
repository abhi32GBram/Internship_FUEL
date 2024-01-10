package com.multiThreading5Jan.Jan8_sample;


public class PrintNumbers2 extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("Class 2: " + i);
        }
    }
}