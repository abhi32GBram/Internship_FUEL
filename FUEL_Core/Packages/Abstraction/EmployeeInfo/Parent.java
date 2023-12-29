`Parent.java`

package com.fliplkart.registration;

public class Parent {
    public static void main(String[] args) {
        Employee ee = new Employee();

        ee.setId(9933);
        ee.setName("teri mammi");
        ee.setDesign("SRE");
        ee.setCity("DHOLAKPUR");
        ee.setSal(8495849458.3438434f);

        System.out.println("ID: " + ee.getId());
        System.out.println("Name: " + ee.getName());
        System.out.println("Salary: " + ee.getSal());
        System.out.println("Designation: " + ee.getDesign());
        System.out.println("City: " + ee.getCity());
    }
}