
package com.designPattern.singleton;

public class Apple {
    private static Apple instance = null;
    private int id = 10;
    private String nameString = "hello";
    private String cityString = "pune";
    static String countryString = "india";

    static Apple appie;
    static Apple fizz = new Apple(); // Eager Object Creation

    private Apple() {
        super();
        System.out.println("This is a private constructor");
    }

    public static Apple getInstance() {
        if (instance == null) {
            instance = new Apple();
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getCityString() {
        return cityString;
    }

    public void setCityString(String cityString) {
        this.cityString = cityString;
    }

    public static String getCountryString() {
        return countryString;
    }

    public static void setCountryString(String countryString) {
        Apple.countryString = countryString;
    }
}

