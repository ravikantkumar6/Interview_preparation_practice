package com.innerClass;

public class TestOuter {
	
	static int data = 30;
	static class Inner{
		int data = 40;
		 void msg() {
			System.out.println("data is --->"+data);
			System.out.println("outer data is --->"+TestOuter.data);
		}
	}
	
	public static void main(String[] args) {
		new TestOuter.Inner().msg();
	}

}
