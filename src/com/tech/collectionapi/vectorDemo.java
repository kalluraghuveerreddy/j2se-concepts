package com.tech.collectionapi;

import java.util.List;
import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {

        Vector<String> vector=new Vector<>();
        vector.add("Raghu");
        vector.add("Sravya");
        vector.add(null);
        vector.add("Hello");

        for (String string : vector) {
            System.out.println(string);
        }
    }
}
