package com.custom.collection;

public class CustomStack<T> {
	
	int size;
	T arr[];
	int top;
	
	public CustomStack(int size) {
		this.size = size;
		this.arr = (T [])new Object[size];
		this.top = -1;
	}
	
	public void push(T element) {
		if(!isFull()) {
			arr[++top] = element;
		}else {
			System.out.println("Stack is Full !");
		}
	}
	
	public T pop() {
		if(!isEmpty()) {
			return arr[top--];
		}else{
			System.out.println("Stack is empty !");
			return null;
		}
	}
	
	public T peek() {
		if(!isEmpty()) {
			return arr[top];
		}else {
			System.out.println("Stack is empty !");
			return null;
		}
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}

	private boolean isFull() {
		return (size-1==top);
	}

}
