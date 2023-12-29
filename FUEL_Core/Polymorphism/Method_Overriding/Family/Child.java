package com.polymorphism.overriding;

public class Child extends Parent {

    void data() {
        System.out.println("data method of CHILD class ");
    }

    void data(int a) {
        System.out.println("int data method");
    }
}