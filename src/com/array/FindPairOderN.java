package com.array;

import java.util.HashMap;
import java.util.Map;

public class FindPairOderN {
	
	public static void main(String...s) {
		int [] a= {8,7,5,3,1,2};
		int sum =10;
		findPair(sum,a);
	}

	private static void findPair(int sum, int[] a) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(sum-a[i])) {
				System.out.println("Pair Found");
				return;
			}
			map.put(a[i], i);
		}
		System.out.println("Pair not found");
	}

}
