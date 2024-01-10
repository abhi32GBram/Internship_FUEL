package com.multiThreading5Jan.Jan9;

public class Dyemo extends Thread {

    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("DEMO 1 : "+i);
        }
    }
}
