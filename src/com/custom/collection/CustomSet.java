package com.custom.collection;

import java.util.Arrays;

public class CustomSet<T> {

    private static final int INITIAL_CAPACITY = 10;
    private T[] arrayElement;
    private int size = 0;

    public CustomSet() {
        arrayElement = (T[]) new Object[INITIAL_CAPACITY];
    }

    public void add(T t) {

        if (!contains(t)) {
            if (size == arrayElement.length) {
                incrementArray();
            }
            arrayElement[size++] = t;
        }

    }

    public T remove(int index) {
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();
        T removeElement = arrayElement[index];
        for (int i = index; i < size - 1; i++) {
            arrayElement[i] = arrayElement[i + 1];
        }
        return removeElement;
    }

    private void incrementArray() {
        int newIncreasedCapacity = arrayElement.length * 2;
        arrayElement = Arrays.copyOf(arrayElement, newIncreasedCapacity);
    }

    public boolean contains(T t) {
        if (t == null) {
            for (T element : arrayElement) {
                if (element == null) return true;
            }
        } else {
            for (T element : arrayElement) {
                if (element.equals(t)) return true;
            }
        }
        return false;
    }

}
