package com.overriding;

public class Test {
	
	public void getData(Object o1,Object o2) {
		System.out.println("Object class");
	}
	
	
	  public void getData(String o1,String o2) {
	  System.out.println("String class"); }
	 
	
	
	/*
	 * public void getData(Integer o1,Integer o2) {
	 * System.out.println("Integer class"); }
	 */
	
	public static void main(String...s) {
		new Test().getData(null,null);
	}

}
