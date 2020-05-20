package com.java8.interfce1;

public class Main implements Moveable1,Moveable2 {
	
	/*
	 * public void move() { System.out.println("In main"); }
	 */
	
	public static void main(String ...s) {
		/*
		 * Main main = new Main(); main.move();
		 * 
		 * Moveable1 main1 = new Main(); main1.move();
		 * 
		 * Moveable2 main2 = new Main(); main2.move();
		 */
		
		Moveable1.move();
		Moveable2.move();
	}

}
