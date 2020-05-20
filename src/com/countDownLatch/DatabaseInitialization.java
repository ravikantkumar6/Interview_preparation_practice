package com.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class DatabaseInitialization implements Runnable {

    CountDownLatch countDownLatch;

    public DatabaseInitialization(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("database initialization start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("done with the database Initialization");
        countDownLatch.countDown();
    }

}
