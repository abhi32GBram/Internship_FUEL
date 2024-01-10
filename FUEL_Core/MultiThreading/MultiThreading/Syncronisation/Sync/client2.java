package com.multiThreading5Jan.Jan9.sync;

public class client2 extends Thread {
    demo d2 = new demo();

    public void run() {
        synchronized (d2) {
            d2.demo();
        }
    }

}
