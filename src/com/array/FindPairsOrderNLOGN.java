package com.array;

import java.util.Arrays;

public class FindPairsOrderNLOGN {
	
	public static void main(String...s) {
		int [] a= {8,7,5,3,1,2};
		int sum =10;
		findPair(sum,a);
	}

	private static void findPair(int sum, int[] a) {
		Arrays.sort(a);
		int low = 0;
		int high = a.length-1;
		while(low<high) {
			if(a[low]+a[high] == sum) {
				 	System.out.println("PairFound");
				 	return;
			}
			if(a[low]+a[high]<sum) {
				low++;
			}else {
				high++;
			}
		}
		System.out.println("Pair Not Found");
	}

}
