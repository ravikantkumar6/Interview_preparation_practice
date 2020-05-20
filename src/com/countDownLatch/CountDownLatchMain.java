package com.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMain {

    public static void main(String[] args) {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(3);
            UIInitialization uiInitialization = new UIInitialization(countDownLatch);
            DatabaseInitialization databaseInitialization = new DatabaseInitialization(countDownLatch);
            LoggingInitilization loggingInitilization = new LoggingInitilization(countDownLatch);

            new Thread(uiInitialization).start();
            new Thread(databaseInitialization).start();
            new Thread(loggingInitilization).start();

            countDownLatch.await();
            System.out.println("Initialization has been completed,main thread can proceed now");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
