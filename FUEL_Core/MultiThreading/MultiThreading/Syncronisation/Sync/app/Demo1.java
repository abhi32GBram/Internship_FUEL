package com.multiThreading5Jan.Jan9.sync.app;

public class Demo1 {
    private int count = 0;

    public void incrementCount() {
        synchronized (this) {
            count++;
            System.out.println("Count is now " + count);
        }
    }
}
