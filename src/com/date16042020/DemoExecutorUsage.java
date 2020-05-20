package com.date16042020;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorUsage {

    private static ExecutorService executor = null;
    private static volatile Future taskOneResults = null;
    private static volatile Future taskTwoResults = null;

    public static void main(String... s) {
        executor = Executors.newFixedThreadPool(2);
        while (true) {
            try {
                checkTask();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println("Caught exception: " + e.getMessage());
            }
        }
    }

    private static void checkTask() {
        if (taskOneResults == null || taskOneResults.isDone() || taskOneResults.isCancelled())
            taskOneResults = executor.submit(new TestOne());
        if (taskTwoResults == null || taskTwoResults.isDone() || taskTwoResults.isCancelled())
            taskTwoResults = executor.submit(new TestTwo());
    }

}
