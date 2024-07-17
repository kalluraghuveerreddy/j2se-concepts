package com.tech.collectionapi;

public class Demo {
    public static void main(String[] args) {
        String name="Raghuveer Reddy";
        convertUpperCase(name);
        System.out.println(name);
    }

    private static String convertUpperCase(String name) {
        return name.toUpperCase();
    }
}
