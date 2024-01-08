
package com.multiThreading5Jan.multiThread.egEmployee;

    public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = new Employee();
        Runnable r2 = new Client();
        Runnable r3 = new Test();

        Thread t = new Thread(r1);
        Thread tt = new Thread(r2);
        Thread ttt = new Thread(r3);

//        t.start();
//        tt.start();
//        ttt.start();

        System.out.println();
        System.out.println("T Thread Name: " + t.getName());
        System.out.println("T Thread Priority :" + t.getPriority());
        System.out.println("T Thread isAlive  ? :" + t.isAlive());
        System.out.println("T MAX PRIO :" + t.MAX_PRIORITY);
        System.out.println("T MAX PRIO :" + t.MIN_PRIORITY);

        System.out.println("-------------------------------------------------------");

        System.out.println("TT Thread Name :" + tt.getName());
        System.out.println("TT Thread Priority :" + tt.getPriority());
        System.out.println("TT Thread isAlive  ?" + tt.isAlive());
        System.out.println("TT MAX PRIO :" + tt.MAX_PRIORITY);
        System.out.println("TT MAX PRIO :" + tt.MIN_PRIORITY);

        System.out.println("-------------------------------------------------------");

        System.out.println("TTT Thread Name :" + ttt.getName());
        System.out.println("TTT Thread Priority :" + ttt.getPriority());
        System.out.println("TTT Thread isAlive  ? :" + ttt.isAlive());
        System.out.println("TTT MAX PRIO :" + ttt.MAX_PRIORITY);
        System.out.println("TTT MAX PRIO :" + ttt.MIN_PRIORITY);

    }
}
