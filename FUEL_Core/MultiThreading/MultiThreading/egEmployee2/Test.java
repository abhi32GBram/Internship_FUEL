package com.multiThreading5Jan.multiThread.egEmployee2;

public class Test implements Runnable {


    @Override
    public void run() {
        for (int b = 20; b < 1; b++) {
            System.out.println("Test Class : " + b);
        }
    }
}
