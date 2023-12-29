package com.example.demo;

public class Child extends Parent {
    void data() {
        System.out.println("this the DATA method impletemenataion ");
    }

    public Child() {
        System.out.println("THIS IS A CONSTRUCTOR FROM THE ABSTRACT CLASS CHILD");
    }
    
    public static void main(String[] args) {
        System.out.println("this the entry point of child class CHILD MAIN ");
        Child cc = new Child();
        cc.data();

    }


}