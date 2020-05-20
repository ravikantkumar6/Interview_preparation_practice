package com.cyclicBarrier;

public class CyclicBarrierFinishedEvent implements Runnable {

	@Override
	public void run() {
		System.out.println(" As 3 thread reached common barrier Point"+
							" cyclicbarrierfinishevent has been trigered");
		System.out.println(" You can update share variable if any");
	}

}
