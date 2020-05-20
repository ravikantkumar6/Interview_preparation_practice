package com.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RunnableTask implements Runnable{
	
	CyclicBarrier cyclicBarrier;
	long sleepTime;
	
	RunnableTask(CyclicBarrier cyclicBarrier,long sleepTime){
		this.cyclicBarrier = cyclicBarrier;
		this.sleepTime = sleepTime;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(sleepTime);
			System.out.println(Thread.currentThread().getName()+" is waiting for "
					+(cyclicBarrier.getParties()-cyclicBarrier.getNumberWaiting()-1)+
					" other thread to reach common point");
			cyclicBarrier.await();
		}catch(InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("As "+cyclicBarrier.getParties()+" thread have reached common barrier point"+
					Thread.currentThread().getName()+
					" has been released");
	}
}
