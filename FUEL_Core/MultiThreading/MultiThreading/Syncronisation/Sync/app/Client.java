package com.multiThreading5Jan.Jan9.sync.app;

public class Client extends Thread {
    private Demo demo;

    public Client(Demo demo) {
        this.demo = demo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            demo.incrementCount();
        }
    }
}
