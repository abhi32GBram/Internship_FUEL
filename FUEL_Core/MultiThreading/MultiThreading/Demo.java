
package com.multiThreading5Jan.multiThread;

public class Demo {

    public static void main(String[] args) {

        multiThreads mm = new multiThreads();
        multiThreads mmm = new multiThreads();

        System.out.println("The Name of this thread is : " + mm.currentThread().getName());
        System.out.println("The Id of this thread is : " + mm.currentThread().getId());
        System.out.println("The Priority Value of this thread is : " + mm.currentThread().getPriority());
        System.out.println("The Priority Value of this thread is : " + mm.currentThread());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("The Name of this thread is : " + mmm.currentThread().getName());
        System.out.println("The Id of this thread is : " + mmm.currentThread().getId());
        System.out.println("The Priority Value of this thread is : " + mmm.currentThread().getPriority());


        mm.start();
        mmm.start();
    }
}
