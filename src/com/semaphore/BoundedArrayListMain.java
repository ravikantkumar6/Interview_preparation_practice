package com.semaphore;

public class BoundedArrayListMain {

    public static void main(String... s) {
        final BoundedArrayList<String> boundedArrayList = new BoundedArrayList<String>(5);
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Available Permits ->" + boundedArrayList.getSemaphore().availablePermits());
                    boundedArrayList.add("John");
                    System.out.println("Available Permits ->" + boundedArrayList.getSemaphore().availablePermits());
                    boundedArrayList.add("Martin");
                    System.out.println("Available Permits ->" + boundedArrayList.getSemaphore().availablePermits());
                    boundedArrayList.add("Adam");
                    System.out.println("Available Permits ->" + boundedArrayList.getSemaphore().availablePermits());
                    boundedArrayList.add("Prince");
                    System.out.println("Available Permits ->" + boundedArrayList.getSemaphore().availablePermits());
                    boundedArrayList.add("Tod");
                    System.out.println("Available Permits ->" + boundedArrayList.getSemaphore().availablePermits());
                    boundedArrayList.add("Tony");
                    System.out.println("Final arrayList-->" + boundedArrayList.getArrayList());
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

        };

        Runnable runnable2 = new Runnable() {
            public void run() {
                try {
                    System.out.println("Before removing elements :--->" + boundedArrayList.getArrayList());
                    Thread.sleep(5000);
                    boundedArrayList.remove("Martin");
                    boundedArrayList.remove("Adam");
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }

}
