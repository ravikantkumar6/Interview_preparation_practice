package com.date16042020;

public class TestTwo implements Runnable {

    public void run() {
        while (true) {
            System.out.println("Executing task two");
            try {
                Thread.sleep(1000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

}
