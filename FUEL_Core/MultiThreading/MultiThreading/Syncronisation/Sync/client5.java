package com.multiThreading5Jan.Jan9.sync;

public class client5 extends Thread {
    demo5 d5 = new demo5();

    public void run() {
        synchronized (d5) {
            d5.demo5();
        }
    }
}
