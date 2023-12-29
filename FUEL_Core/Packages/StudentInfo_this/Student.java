package com.fliplkart.registration;

public class Student {
   private int id;
   private String name;
   private String city;

   public void data(int id, String name, String city) {
       this.id = id;
       this.name = name;
       this.city = city;
   }
   public void display() {
       System.out.println("Id of the student : " + this.id);
       System.out.println("Name of the student : " + this.name);
       System.out.println("City of the student : " + this.city);
   }
}
