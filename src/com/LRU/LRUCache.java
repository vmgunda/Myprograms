package com.LRU;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    private HashMap<String, String> cache;
    private LinkedList<LRUNode> lruNodes;

    private String get(String key) {
        if (!cache.containsKey(key)) {
            return null;
        }
        String str = cache.get(key);
        lruNodes.remove(0);
        return str;
    }



}
