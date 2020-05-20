package com.date16042020;

public class ResolveDeadLockTest {

    public static void main(String... s) {
        A a = new A();
        B b = new B();
        Runnable block1 = new Runnable() {

            @Override
            public void run() {
                synchronized (a) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                    synchronized (b) {
                        System.out.println("In block1");
                    }
                }
            }

        };

        Runnable block2 = new Runnable() {

            public void run() {
                synchronized (a) {
                    synchronized (b) {
                        System.out.println("In block2");
                    }
                }
            }

        };
        new Thread(block1).start();
        new Thread(block2).start();
    }

}

class A {
    private int i = 10;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}

class B {
    private int i = 20;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}
