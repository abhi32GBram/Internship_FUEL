package com.typecasting.prac;

public class Test {

    public static void main(String[] args) {

        // Declare and initialize a float variable
        float f = 10.5f;
        // Perform explicit type casting from float to int
        int i = (int) f;

        // Declare and initialize a double variable
        double d = 65.0;
        // Perform explicit type casting from double to char
        char c = (char) d;

        // Declare and initialize a long variable
        long l = 1000L;
        // Perform explicit type casting from long to short
        short s = (short) l;

        // Declare and initialize another double variable
        double dd = 110.5;
        // Perform explicit type casting from double to int
        // Data loss occurs here because the decimal part is truncated
        int ii = (int) d;

        // Declare and initialize another float variable
        float ff = 1234.5f;
        // Perform explicit type casting from float to byte
        // Data loss occurs here because the value exceeds the limit of byte
        byte bb = (byte) f;

        // Declare and initialize another long variable
        long ll = 327638L;
        // Perform explicit type casting from long to short
        // Data loss occurs here because the value exceeds the limit of short
        short ss = (short) l;

    }
}