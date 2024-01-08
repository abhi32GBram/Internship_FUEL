package com.multiThreading5Jan;

// im using singleThradProb

public class SingleThreadTest {
    public static void main(String[] args) throws InterruptedException {

        SingleThreadProb tt = new SingleThreadProb();

        System.out.println("The Name of this thread is : " + tt.currentThread().getName());
        System.out.println("The Id of this thread is : " + tt.currentThread().getId());
        System.out.println("The Priority Value of this thread is : " + tt.currentThread().getPriority());

        System.out.println("The state of this thread is (isAlive ?) : " + tt.currentThread().isAlive());


        tt.demo();
        tt.display();
    }
}
