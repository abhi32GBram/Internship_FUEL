package com.multiThreading5Jan.Jan9.sync;
public class client4 extends Thread {
    demo4 d4 = new demo4();

    public void run() {
        synchronized (d4) {
            d4.demo4();
        }
    }
}
