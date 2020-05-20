package com.custom.collection;

public class CustomQueue<T> {

    int front;
    int rear;
    int currentSize = 0;
    private final int capacity;
    private final T[] array;

    public CustomQueue(int sizeOfQueue) {
        this.capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        array = (T[]) new Object[sizeOfQueue];
    }

    public boolean isFull() {
        return (currentSize == capacity);
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public void add(T element) {
        if (isFull())
            System.out.println("Queue is full ! Cannot add more elements");
        else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            array[rear] = element;
            currentSize++;
        }
    }

    public T remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty ! Cannot remove element");
            return null;
        } else {
            front++;
            if (front == capacity - 1) {
                front = 0;
            }
            T element = array[front - 1];
            array[front - 1] = null;
            return element;
        }
    }
}
