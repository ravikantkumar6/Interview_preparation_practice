package com.date16042020;

public class TaskThree implements Runnable {

    public void run() {
        while (true) {
            System.out.println("executing task three");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

}
