// Package declaration
package com.DS.sets.random;

// Class declaration
public class Apple {
    // Instance variables
    private int id = 10;
    private String nameString = "hello";
    private String cityString = "pune";
    // Static variable shared among all instances of the class
    static String countryString = "indid";
    // Static variable for lazy initialization
    static Apple appie;
    // Static variable for eager initialization
    static Apple fizz = new Apple();
    // Another static variable for lazy initialization
    static Apple thirdChild;

    // Private constructor for singleton pattern
    private Apple() {
        super();
        System.out.println("this is a private constructor ");
    }

    // Static method to print properties of an Apple object
    static void PrintThis() {
        // Create a new Apple object
        Apple app = new Apple();
        // Initialize the static variables
        appie = new Apple();
        thirdChild = new Apple();

        // Set properties of the Apple object
        app.setCityString("BLORE");
        app.setId(34);
        app.setNameString("huii");
        app.setCountryString("PAKISTANNN");

        // Print properties of the Apple object
        System.out.println(app.getId());
        System.out.println(app.getNameString());
        System.out.println(app.getCityString());
        System.out.println(app.getCountryString());
    }

    // Getter for the static variable countryString
    public static String getCountryString() {
        return countryString;
    }

    // Setter for the static variable countryString
    public static void setCountryString(String countryString) {
        Apple.countryString = countryString;
    }

    // Getter for the instance variable id
    public int getId() {
        return id;
    }

    // Setter for the instance variable id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for the instance variable nameString
    public String getNameString() {
        return nameString;
    }

    // Setter for the instance variable nameString
    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    // Getter for the instance variable cityString
    public String getCityString() {
        return cityString;
    }

    // Setter for the instance variable cityString
    public void setCityString(String cityString) {
        this.cityString = cityString;
    }
}
