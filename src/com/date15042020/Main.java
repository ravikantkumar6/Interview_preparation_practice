package com.date15042020;

public class Main {

    public static void main(String[] args) {
        final MathClass mathClass = new MathClass();

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    mathClass.printNumber(3);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

        };

        new Thread(runnable, "ONE").start();
        new Thread(runnable, "TWO").start();
    }

}
