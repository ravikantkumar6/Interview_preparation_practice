package com.date15042020;

import java.util.List;

public class Consumer implements Runnable {

    private final List<Integer> taskQueue;

    public Consumer(List<Integer> sharedQueue) {
        this.taskQueue = sharedQueue;
    }

    public void run() {
        while (true)
            try {
                consume();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
    }

    private void consume() throws InterruptedException {
        synchronized (taskQueue) {
            if (taskQueue.isEmpty()) {
                System.out.println("Queue is empty :" + Thread.currentThread().getName() + " is waiting , size:" + taskQueue.size());
                taskQueue.wait();
            }
            Thread.sleep(1000);
            int i = taskQueue.remove(0);
            System.out.println("consume :" + i);
            taskQueue.notifyAll();
        }
    }

}
