package com.date15042020;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerExample {

    public static void main(String[] args) {
        List<Integer> taskList = new ArrayList<Integer>();
        int MAX_CAPACITY = 5;
        Thread producerThread = new Thread(new Producer(taskList, MAX_CAPACITY), "Producer");
        Thread consumerThread = new Thread(new Consumer(taskList), "Consumer");
        producerThread.start();
        consumerThread.start();
    }

}
