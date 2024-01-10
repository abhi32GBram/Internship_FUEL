package com.multiThreading5Jan.Jan9.sync.app;

public class Demo {
    private int count = 0;

    public synchronized void incrementCount() {
        count++;
        System.out.println("Count is now " + count);
    }
}
