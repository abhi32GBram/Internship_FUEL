package com.multiThreading5Jan.Jan9.sync;

public class client3 extends Thread {
    demo3 d3 = new demo3();

    public void run() {
        synchronized (d3) {
            d3.demo();
        }
    }


}
