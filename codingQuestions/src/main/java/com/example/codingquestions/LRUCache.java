package com.example.codingquestions;

import java.util.*;

class LRUCache {
    Map<Integer, Integer> mp;
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.mp = new LinkedHashMap<>(capacity);
    }

    public int get(int key) {
        if (mp.containsKey(key)){
            int val = mp.get(key);
            mp.remove(key);
            mp.put(key, val);
            return val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (mp.containsKey(key)){
            mp.remove(key);
            mp.put(key, value);
        } else {
            if (mp.size()<capacity){
                mp.put(key, value);
            } else {
                Iterator<Integer> keySetIterator = mp.keySet().iterator();
                mp.remove(keySetIterator.next());
                mp.put(key, value);
            }
        }
    }

}
