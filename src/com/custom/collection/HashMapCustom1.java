package com.custom.collection;

public class HashMapCustom1<K, V> {

    private final Entry<K, V>[] table;
    private final int capacity = 4;

    public HashMapCustom1() {
        table = new Entry[capacity];
    }

    public int hash(K key) {
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
                }
                previous = current;
                current = current.next;
            }
            previous.next = newEntry;
        }
    }

    public V get(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return null;
        } else {
            Entry<K, V> current = table[hash];
            while (current != null) {
                if (current.key.equals(key)) return current.value;
                current = current.next;
            }
        }
        return null;
    }

    public boolean remove(K deleteKey) {
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
                Entry<K, V> current = table[i];
                while (current != null) {
                    System.out.println("{" + current.key + "=" + current.value + "}" + " ");
                    current = current.next;
                }
            }
        }
    }

    public boolean contains(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return false;
        } else {
            Entry<K, V> temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public void displaySet() {
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Entry<K, V> temp = table[i];
                while (temp != null) {
                    System.out.print(temp.key);
                    temp = temp.next;
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
