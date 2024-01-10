package com.multiThreading5Jan.Jan9.sync;

public class client  extends  Thread{
    demo d1 = new demo();

    public void run(){
        synchronized (d1){
            d1.demo();
        }
    }
}
