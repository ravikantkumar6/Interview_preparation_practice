package com.date15042020;

public class MathClass {

    void printNumber(int n) throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < n; i++) {
                System.out.println(Thread.currentThread().getName() + "::" + i);
                Thread.sleep(500);
            }
        }
    }

}
