package com.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {

	public static void main(String[] args) {
		CyclicBarrier cyclicbarrier = new CyclicBarrier(3, new CyclicBarrierFinishedEvent());
		RunnableTask runnabletask1 = new RunnableTask(cyclicbarrier,1000);
		RunnableTask runnabletask2 = new RunnableTask(cyclicbarrier,2000);
		RunnableTask runnabletask3 = new RunnableTask(cyclicbarrier,3000);
		
		new Thread(runnabletask1,"Thread-1").start();
		new Thread(runnabletask2,"Thread-2").start();
		new Thread(runnabletask3,"Thread-3").start();
		
		RunnableTask runnabletask4 = new RunnableTask(cyclicbarrier,4000);
		RunnableTask runnabletask5 = new RunnableTask(cyclicbarrier,5000);
		RunnableTask runnabletask6 = new RunnableTask(cyclicbarrier,5000);
		
		new Thread(runnabletask4,"Thread-4").start();
		new Thread(runnabletask5,"Thread-5").start();
		new Thread(runnabletask6,"Thread-6").start();
	}

}
