package com.multiThreading5Jan.multiThread.egEmployee;

public class Client implements Runnable {

    @Override
    public void run() {
        for (int k = 100; k < 150; k++) {
            System.out.println("Client OClass :" + k);
        }
    }
}
