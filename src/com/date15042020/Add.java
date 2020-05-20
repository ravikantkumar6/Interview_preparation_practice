package com.date15042020;

public class Add {
	
	public static int add(int a,int b) {
		long result = ((long) a)+b;
		if(result > Integer.MAX_VALUE) {
			throw new RuntimeException("Overflow occured");
		}else if(result < Integer.MIN_VALUE) {
			throw new RuntimeException("Underflow occured");
		}
		return (int)result;
	}

}
