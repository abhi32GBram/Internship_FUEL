package com.multiThreading5Jan.Jan8_sample;

public class Test {
    public static void main(String[] args) {

        PrintNumbers1 t1 = new PrintNumbers1();
        PrintNumbers2 t2 = new PrintNumbers2();
        PrintNumbers3 t3 = new PrintNumbers3();

        t1.start();
        t1.start();

        t2.start();
        t3.start();
    }
}