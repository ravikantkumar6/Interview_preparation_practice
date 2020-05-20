package com.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class LoggingInitilization implements Runnable {

    CountDownLatch countDownLatch;

    public LoggingInitilization(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Logging Initialization start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("done with the logging initialization");
        countDownLatch.countDown();
    }

}
