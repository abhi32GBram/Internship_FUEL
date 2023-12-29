package com.example.demo;

public abstract class Test {
    public Test() {
        System.out.println("THIS IS A CONSTRUCTOR FROM THE ABSTRACT TEST CHILD");
    }

    public static void main(String[] args) {
        Child ss = new Child();

        System.out.println("this is the test main file of the program - TEST ENTRYPOINT");

        Parent ee= new Child();

    }
}