package com.innerClass;

public class LocalInner {
	
	private int data = 30;
	void display() {
		int data = 50;
		class Local{
			void msg() {
				System.out.println("data is-->"+data);
				System.out.println("outer data is-->"+LocalInner.this.data);
			}
		}
		Local l1= new Local();
		l1.msg();
	}
	public static void main(String[] args) {
		LocalInner localInner = new LocalInner();
		localInner.display();
	}

}
