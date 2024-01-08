// create a demo class file to start() these methods as threads
package com.multiThreading5Jan.multiThread;

public class multiThreads extends Thread {

    @Override
    public void run() {
        try {
            display();
            demo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void display() throws InterruptedException {
        for (int i = 0; i <= 100; i++) {
            System.out.println("DISPLAY METHOD of MULTITHREAD : " + i);
            Thread.sleep(200);
        }
    }

    void demo() throws InterruptedException {
        for (int j = 20; j <= 50; j++) {
            System.out.println("DEMO METHOD of MULTITHREAD: " + j);
        }
    }
}
