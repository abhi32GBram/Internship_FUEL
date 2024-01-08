package com.multiThreading5Jan.multiThread.egEmployee;

public class Employee implements Runnable {
    @Override
    public void run() {

        for (int a = 0; a < 10; a++) {
            System.out.println("Employee Class " + a);
        }

    }
}
