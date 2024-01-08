package com.multiThreading5Jan.multiThread.app;

public class dos implements Runnable {

    public void displayDos(){
        System.out.println("KUKARACHA DOS !!");
    }

    @Override
    public void run() {

        System.out.println("Dos says: " + "MALAYYKAAA");

    }
}
