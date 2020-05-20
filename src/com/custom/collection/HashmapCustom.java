package com.custom.collection;

public class HashmapCustom<K, V> {

    private final Entry<K, V>[] table;
    private final int capacity = 16;

    public HashmapCustom() {
        table = new Entry[capacity];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        if (key == null) return;

        int hash = hash(key);
        Entry<K, V> newEntry = new Entry<K, V>(key, value, null);
        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];
            while (current != null) {
                if (current.key.equals(key)) {
                    newEntry.next = current.next;
                    if (previous == null) {
                        table[hash] = newEntry;
                    } else {
                        previous.next = newEntry;
                    }
                    return;
                } else {
                    previous = current;
                    current = current.next;
                    return;
                }
            }
            previous.next = newEntry;
        }
    }

    public V get(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return null;
        } else {
            Entry<K, V> temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) return temp.value;
                temp = temp.next;
            }
        }
        return null;
    }

    public boolean removekey(K deleteKey) {
        int hash = hash(deleteKey);
        if (table[hash] == null) {
            return false;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];
            while (current != null) {
                if (current.key.equals(deleteKey)) {
                    if (previous == null) {
                        table[hash] = table[hash].next;
                    } else {
                        previous.next = current.next;
                    }
                    return true;
                }
                previous = current;
                current = current.next;
            }
            return false;
        }
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Entry<K, V> entry = table[i];
                while (entry != null) {
                    System.out.println("{" + entry.key + "=" + entry.value + "}" + " ");
                    entry = entry.next;
                }
            }
        }
    }

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

}
