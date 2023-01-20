package Hashmap;

import java.util.LinkedList;
import java.util.Set;

public class HashSetImplement {

    private class Entry{
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        int index = hash(key);
        if(entries[index] == null)
            entries[index] = new LinkedList<>();

        for (Entry entry :
                entries[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        Entry entry = new Entry(key,value);
        entries[index].addLast(entry);
    }

    public String get(int key) {
        int index = hash(key);

        var bucket = entries[index];
        if(bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key)
                    return entry.value;
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);

        var bucket = entries[index];
        if(bucket == null)
            throw new IllegalStateException();
        for (var entry :
                bucket) {
            if (entry.key == key)
                bucket.remove(entry);
            return;
        }
        throw new IllegalStateException();
    }

    private int hash(int key){
        return key % entries.length;
    }
}
