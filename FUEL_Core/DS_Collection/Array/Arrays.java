package com.DS.array;

public class array {

    public static void main(String[] args) {

        int a[] = {34, 23, 23, 53, 23, 12, 4, 23};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        String[] strs = new String[5];
        strs[0] = "someting ";
        strs[1] = "anyhthing  ";
        strs[2] = "name  ";
        strs[3] = "spacve  ";
        strs[4] = "person ";

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        System.out.println("STRING  for DATA INPUT");

        Object[] obj = new Object[5];

        obj[0] = "someting ";
        obj[1] = true;
        obj[2] = 43434;
        obj[3] = 444.444;
        obj[4] = 12;

        System.out.println("OBJECT for HETERGENOUS DATA INPUT");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }


    }
}



