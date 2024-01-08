package com.multiThreading5Jan;


public class SingleThreadProb  extends  Thread {
    void display() throws InterruptedException {
        for (int i = 0; i <= 100; i++) {
            System.out.println("DISPLAY METHOD : " + i);
            Thread.sleep(200);
        }
    }
    void demo() {
        for (int j = 20; j <= 50; j++) {
            System.out.println("DEMO METHOD : " + j);
        }
    }
}
