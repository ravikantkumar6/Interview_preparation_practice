package com.date16042020;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiTaskExecutor {
	
	public static void main(String ...strings) {
		BlockingQueue<Runnable> worksQueue = new ArrayBlockingQueue<Runnable>(10);
		RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandlerImpl();
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, worksQueue, rejectedExecutionHandler);
		threadPoolExecutor.prestartAllCoreThreads();
		
		List<Runnable> taskGroup = new ArrayList<Runnable>();
		taskGroup.add(new TaskOne());
		taskGroup.add(new TaskTwo());
		taskGroup.add(new TaskThree());
		
		worksQueue.add(new MultiRunnable(taskGroup));
	}

}

class RejectedExecutionHandlerImpl implements RejectedExecutionHandler{

	@Override
	public void rejectedExecution(Runnable runnable, ThreadPoolExecutor arg1) {
		System.out.println(runnable.toString() +" : I have been reject !");
	}
	
}
