package com.multiThreading5Jan.Jan9;

public class Test {
    public static void main(String[] args) {

        Dyemo dd = new Dyemo();
        Dyemo2 ddd = new Dyemo2();

        ddd.setPriority(10);
        int a = dd.getPriority();
        System.out.println("Priority of thread dd : " + a);


        dd.setPriority(9);
        int b = ddd.getPriority();
        System.out.println("Priority of thread ddd : " + b);

        System.out.println("\n**************************\n");
        System.out.println("Threading executing using `run()`");

        dd.run();
        ddd.run();

        System.out.println("\n**************************\n");
        System.out.println("Threading executing using `start()`");

        dd.start();
        ddd.start();

        // this will throw IllegalThreadStateException
//        dd.start();
//        dd.stop();
//        dd.start();


    }
}
