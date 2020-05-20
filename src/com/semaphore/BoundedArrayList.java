package com.semaphore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;

public class BoundedArrayList<T> {
	
	private final Semaphore semaphore;
	private List<T> arrayList;
	
	BoundedArrayList(int limit){
		this.arrayList = Collections.synchronizedList(new ArrayList<T>());
		this.semaphore = new Semaphore(limit);
	}
	
	public boolean add (T t)throws InterruptedException{
		boolean added = false;
		semaphore.acquire();
		try {
			added = arrayList.add(t);
			return added;
		}finally {
			if(!added) {
				semaphore.release();
			}
		}
	}
	
	public boolean remove(T t) {
		boolean wasRemoved = arrayList.remove(t);
		if(wasRemoved) semaphore.release();
		return wasRemoved;
	}
	
	public void remove(int index) {
		arrayList.remove(index);
		semaphore.release();
	}
	
	public List<T> getArrayList() {
		return arrayList;
	}
	
	public Semaphore getSemaphore() {
		return semaphore;
	}

}
