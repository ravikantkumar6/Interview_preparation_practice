package com.custom.collection;

import java.util.Arrays;

public class CustomArrayList<E> {

    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object[] elementData = {};

    public CustomArrayList() {
        elementData = new Object[INITIAL_CAPACITY];
    }

    public void add(E e) {
        if (size == elementData.length) ensureCapacity();
        elementData[size++] = e;
    }

    private void ensureCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Index :" + index + " size :" + size);
        return (E) elementData[index];
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Index :" + index + " size :" + size);
        E removeElement = (E) elementData[index];
        for (int i = index; i < size - 1; i++)
            elementData[i] = elementData[i + 1];
        size--;
        return removeElement;
    }

    public int size() {
        return size;
    }

    public void display() {
        System.out.println("Displaying the list:");
        for (int i = 0; i < size; i++) {
            System.out.println(elementData[i] + " ");
        }
    }

}
