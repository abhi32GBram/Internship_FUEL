package com.DS.sets.eagerSingleton;

public class Demo {
    Test rr = Test.demo();
    Test rrr = Test.demo();

    public static void main(String[] args) {
        Test rr = Test.demo();
        Test rrr = Test.demo();

        System.out.println("rr hashCode=" + rr.hashCode());
        System.out.println("rrr hashCode=" + rrr.hashCode());
    }

}
