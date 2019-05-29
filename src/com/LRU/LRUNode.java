package com.LRU;

public class LRUNode {

    String key;
    String value;
    LRUNode prev;
    LRUNode next;

   public LRUNode(String key, String value) {
        this.key = key;
        this.value=value;
    }
}
