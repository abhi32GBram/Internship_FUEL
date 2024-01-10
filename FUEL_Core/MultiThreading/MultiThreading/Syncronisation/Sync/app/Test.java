package com.multiThreading5Jan.Jan9.sync.app;

public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Client client1 = new Client(demo);
        Client client2 = new Client(demo);

        System.out.println("This is for Client & Demo");
        client1.start();
        client2.start();


        Demo demo1 = new Demo();
        Client client11 = new Client(demo);
        Client client21 = new Client(demo);

        System.out.println("This is for Client1 & Demo1");
        client11.start();
        client21.start();


    }

}

