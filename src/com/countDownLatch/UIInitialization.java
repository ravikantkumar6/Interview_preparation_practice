package com.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class UIInitialization implements Runnable {

    CountDownLatch countDownLatch;

    public UIInitialization(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Initializing Ui Initialization");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("done with UI Initialization");
        countDownLatch.countDown();
    }

}
