package com.designPattern.singleton;

public class App {
    public static void main(String[] args) {
        Apple apple = Apple.getInstance();

        System.out.println("This is the Singleton Design Pattern");



        apple.setCityString("BLORE");
        apple.setId(34);
        apple.setNameString("huii");
        apple.setCountryString("PAKISTANNN");

        System.out.println(apple.getId());
        System.out.println(apple.getNameString());
        System.out.println(apple.getCityString());
        System.out.println(apple.getCountryString());
    }
}

