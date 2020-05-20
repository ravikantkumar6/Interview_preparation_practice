package com.designpattern.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {
		
	}
	
	/*
	 * public static synchronized ThreadSafeSingleton getInstance() { if(instance ==
	 * null) { instance = new ThreadSafeSingleton(); } return instance; }
	 */
	
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if(instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}
}
