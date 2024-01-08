package com.multiThreading5Jan.multiThread.egEmployee2;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = new Employee();
        Runnable r2 = new Client();
        Runnable r3 = new Test();

        Thread t = new Thread(r1);
        Thread tt = new Thread(r2);
        Thread ttt = new Thread(r3);

        t.start();
        tt.start();
        ttt.start();
    }
}
