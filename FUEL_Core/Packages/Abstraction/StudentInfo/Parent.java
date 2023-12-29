`Parent.java`

package com.fliplkart.registration;

public class Parent {
    public static void main(String[] args) {
        Student ss = new Student();

        ss.setId(9933);
        ss.setName("teri mammi");
        ss.setMajor("cs");
        ss.setUniversity("S AP PPU");
        ss.setGpa(9.9f);

        System.out.println("ID: " + ss.getId());
        System.out.println("Name: " + ss.getName());
        System.out.println("GPA: " + ss.getGpa());
        System.out.println("Major: " + ss.getMajor());
        System.out.println("University: " + ss.getUniversity());
    }
}