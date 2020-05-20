package com.custom.collection;

public class HashSetCustom<E> {
	
	private HashMapCustom1<E,Object> hashMapCustom;
	
	public HashSetCustom() {
		hashMapCustom = new HashMapCustom1<E, Object>();
	}
	
	public void add(E element) {
		hashMapCustom.put(element, null);
	}
	
	public boolean contains(E object) {
		return hashMapCustom.contains(object);
	}
	
	public void display() {
		hashMapCustom.displaySet();
	}
	
	public boolean remove(E object) {
		return hashMapCustom.remove(object);
	}

}
