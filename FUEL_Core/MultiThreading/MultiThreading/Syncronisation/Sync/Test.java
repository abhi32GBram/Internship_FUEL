package com.multiThreading5Jan.Jan9.sync;

public class Test {
    public static void main(String[] args) {

        client c = new client();
        client2 cc = new client2();
        client3 ccc = new client3();
        client4 cccc = new client4();
        client5 ccccc = new client5();

        System.out.println("\n**************************\n");
        System.out.println("Threading executing using `rund()`");
        c.run();
        cc.run();
        ccc.run();
        cccc.run();
        ccccc.run();

        System.out.println("\n**************************\n");
        System.out.println("Threading executing using `start()`");
        c.start();
        cc.start();
        ccc.start();
        cccc.start();
        ccccc.start();
    }
}
