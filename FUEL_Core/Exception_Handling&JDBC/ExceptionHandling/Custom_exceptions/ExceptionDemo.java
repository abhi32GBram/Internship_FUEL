package com.exceptionss.customExcep;

public class exceptDemo {
    public static void main(String[] args) {

        int x = 1;

        try {
            if (x % 2 != 0) {
                throw new except("my_Exception has been thrown &  X mod 2 is NOT EQUAL to 0 bud");
            }
        } catch (except e) {
            System.out.println("HELLO FROM THE CUSTOM EXCEPTION ");
            System.out.println(e.getMessage());
        }
    }
}