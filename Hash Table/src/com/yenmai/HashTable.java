package com.yenmai;


import java.util.LinkedList;


public class HashTable {
    public class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value){
       Entry entry = getEntry(key);
       //Update entry
       if(entry != null) {
           entry.value = value;
           return;
       }

       //Create new entry
       LinkedList<Entry> bucket = getOrCreateBucket(key);
       bucket.addLast(new Entry(key, value));

    }

    public String get(int key) {
        Entry entry = getEntry(key);
        return entry != null ? entry.value : null;

    }

    private LinkedList<Entry> getOrCreateBucket(int key){
        int index = hash(key);
        var bucket = entries[index];
        if(bucket == null){
            bucket = entries[index] = new LinkedList<>();

        }
        return bucket;
    }

    private LinkedList<Entry> getBucket(int key){
        return entries[hash(key)];
    }

    private Entry getEntry(int key){
        LinkedList<Entry> bucket = getBucket(key);
        if(bucket != null){
            for (Entry entry : bucket){
                if(entry.key == key)
                    return entry;
            }

        }
        return null;
    }

    private int hash(int key){
        return key % entries.length;
    }
}
