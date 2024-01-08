package com.multiThreading5Jan.multiThread.app;

public class Demo {

    public static void main(String[] args) {

        Runnable r = new uno();
        Runnable rr = new dos();

        Thread Unos = new Thread(r);
        Thread Doss = new Thread(rr);

        Unos.start();
        Doss.start();


        System.out.println("The Name of this thread is : " + Unos.currentThread().getName());
        System.out.println("The Id of this thread is : " + Unos.currentThread().getId());
        System.out.println("The Priority Value of this thread is : " + Unos.currentThread().getPriority());
        System.out.println("The Priority Value of this thread is : " + Unos.currentThread());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("The Name of this thread is : " + Doss.currentThread().getName());
        System.out.println("The Id of this thread is : " + Doss.currentThread().getId());
        System.out.println("The Priority Value of this thread is : " + Doss.currentThread().getPriority());

        uno gato = new uno();
        dos kukaracha = new dos();

        System.out.println("Calling Messages form the Regular Objects of Uno and Dos");
        gato.displayUno();
        kukaracha.displayDos();


    }
}


