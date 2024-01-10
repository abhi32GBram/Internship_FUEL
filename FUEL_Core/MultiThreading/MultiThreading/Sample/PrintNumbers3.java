package com.multiThreading5Jan.Jan8_sample;

public class PrintNumbers3 extends Thread {
    public void run() {
        for (int i = 11; i <= 15; i++) {
            System.out.println("Class 3: " + i);
        }
    }
}