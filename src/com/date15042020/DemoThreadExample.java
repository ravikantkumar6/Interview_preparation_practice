package com.date15042020;

public class DemoThreadExample {
	
	public static void main(String ...s) {
		Task task = new Task();
		new Thread(task).start();
	}

}
