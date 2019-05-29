package com.corejava;

import java.util.*;

public class SortingHashMap {


    Map<String, Integer> sortByValue(Map<String, Integer> map) {
        LinkedList<Map.Entry<String, Integer>> list = new LinkedList<>();

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }});

        Map<String, Integer> sortedMap = new HashMap<>();

        for (Map.Entry<String, Integer> list1: list) {
            sortedMap.put(list1.getKey(), list1.getValue());
        }
        return sortedMap;
    }


    public static void main(String args[]) {


    }
}
