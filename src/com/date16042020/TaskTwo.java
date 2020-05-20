package com.date16042020;

public class TaskTwo implements Runnable {

	public void run() {
		while(true) {
			System.out.println("executing task two");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
