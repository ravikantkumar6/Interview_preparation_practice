package com.date15042020;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class CallableExample {
	
	public static void main(String ...strings) {
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
		List<Future<Integer>> resultList = new ArrayList<Future<Integer>>();
		Random random = new Random();
		for(int i=0;i<4;i++) {
			Integer number = random.nextInt(10);
			FactorialCalculator calculator = new FactorialCalculator(number);
			Future<Integer> result = threadPoolExecutor.submit(calculator);
			resultList.add(result);
		}
		for(Future<Integer> result:resultList) {
			try {
				System.out.println("Future result is -"+"-"+result.get()+"; And task done is :"+result.isDone());
			}catch(InterruptedException |ExecutionException ie) {
				ie.printStackTrace();
			}
		}
	}

}
