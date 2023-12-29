package com.polymorphism.overriding;

public class Test {
    public static void main(String[] args) {
        Child ccc = new Child();
        ccc.data();
        ccc.data(3434);

        Parent ppp = new Parent();
        ppp.data();


    }
}