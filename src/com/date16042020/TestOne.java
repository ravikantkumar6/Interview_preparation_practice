package com.date16042020;

public class TestOne implements Runnable {

    public void run() {
        while (true) {
            System.out.println("executing task one");
            try {
                Thread.sleep(1000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

}
