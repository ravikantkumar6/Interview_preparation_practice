package com.date15042020;

public class Task implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setUncaughtExceptionHandler(new ExceptionHandler());
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("234"));
		System.out.println(Integer.parseInt("345"));
		System.out.println(Integer.parseInt("XYZ"));
		System.out.println(Integer.parseInt("456"));
		System.out.println(Integer.parseInt("567"));
	}

}
