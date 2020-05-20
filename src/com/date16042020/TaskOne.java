package com.date16042020;

public class TaskOne implements Runnable{

	public void run() {
		while(true) {
			System.out.println("executing task one");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
