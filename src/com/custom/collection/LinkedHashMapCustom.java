package com.custom.collection;

public class LinkedHashMapCustom<K, V> {

    private final Entry<K, V>[] table;
    private final int capacity = 4;
    private Entry<K, V> header;
    private Entry<K, V> last;

    public LinkedHashMapCustom() {
        table = new Entry[capacity];
    }

    public int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K newKey, V value) {
        if (newKey == null) return;
        int hash = hash(newKey);
        Entry<K, V> newEntry = new Entry<K, V>(newKey, value, null);
        maintainOrderAfterInsert(newEntry);
        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];
            while (current != null) {
                if (current.key.equals(newKey)) {
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
            Entry<K, V> temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
            return null;
        }
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
                    maintainOrderAfterDeletion(current);
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

    private void maintainOrderAfterDeletion(Entry<K, V> deleteEntry) {
        if (header.key.equals(deleteEntry.key)) {
            deleteFirst();
            return;
        }
        if (last.key.equals(deleteEntry.key)) {
            deleteLast();
            return;
        }
        deleteSpecificEntry(deleteEntry);
    }

    private void maintainOrderAfterInsert(Entry<K, V> newEntry) {
        if (header == null) {
            header = newEntry;
            last = newEntry;
            return;
        }

        if (header.key.equals(newEntry.key)) {
            deleteFirst();
            insertFirst(newEntry);
            return;
        }

        if (last.key.equals(newEntry.key)) {
            deleteLast();
            insertLast(newEntry);
            return;
        }

        Entry<K, V> beforeDeleteEntry = deleteSpecificEntry(newEntry);
        if (beforeDeleteEntry == null) {
            insertLast(newEntry);
        } else {
            insertAfter(beforeDeleteEntry, newEntry);
        }
    }

    private void insertAfter(Entry<K, V> beforeDeleteEntry, Entry<K, V> newEntry) {
        Entry<K, V> current = header;
        while (current != beforeDeleteEntry)
            current = current.next;
        newEntry.after = beforeDeleteEntry.after;
        beforeDeleteEntry.after.before = newEntry;
        newEntry.before = beforeDeleteEntry;
        beforeDeleteEntry.after = newEntry;
    }

    private Entry<K, V> deleteSpecificEntry(Entry<K, V> newEntry) {
        Entry<K, V> current = header;
        while (!current.key.equals(newEntry.key)) {
            if (current.after == null) return null;
            current = current.after;
        }
        Entry<K, V> beforeDeleteEntry = current.before;
        current.before.after = current.after;
        current.after.before = current.before;
        return beforeDeleteEntry;
    }

    private void insertLast(Entry<K, V> newEntry) {
        if (header == null) {
            header = newEntry;
            last = newEntry;
            return;
        }
        last.after = newEntry;
        newEntry.before = last;
        last = newEntry;
    }

    private void deleteLast() {
        if (header == last) {
            header = last = null;
            return;
        }
        last = last.before;
        last.after = null;
    }

    private void deleteFirst() {
        if (header == last) {
            header = last = null;
            return;
        }
        header = header.after;
        header.before = null;
    }

    private void insertFirst(Entry<K, V> newEntry) {
        if (header == null) {
            header = newEntry;
            last = newEntry;
            return;
        }
        header.before = newEntry;
        newEntry.after = header;
        header = newEntry;
    }

    public void display() {
        Entry<K, V> currentEntry = header;
        while (currentEntry != null) {
            System.out.print("{" + currentEntry.key + "=" + currentEntry.value + "}" + " ");
            currentEntry = currentEntry.after;
        }
    }

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        Entry<K, V> before, after;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

}
