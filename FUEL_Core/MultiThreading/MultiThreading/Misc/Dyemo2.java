package com.multiThreading5Jan.Jan9;

public class Dyemo2 extends Thread {

    public void run() {
        for (int i = 11; i < 21; i++) {
            System.out.println(" demo 2 : " + i);
        }
    }
}
