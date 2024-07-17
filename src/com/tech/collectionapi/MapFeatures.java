package com.tech.collectionapi;

import java.util.*;

public class MapFeatures {
    public static void main(String[] args) {
//        System.out.println("Map Practice");
        Map<String, Integer> map=new LinkedHashMap<>();
        map.put("FB", 1001);
        map.put("Ea", 1002);
        map.put("aa",1003);

        Set<String> keys = map.keySet();
//        keys.forEach(System.out::println);

        Collection<Integer> values = map.values();
//        values.forEach(System.out::println);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        entries.forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));


//        System.out.println("FB".hashCode());
//        System.out.println("Ea".hashCode());

    }
}
