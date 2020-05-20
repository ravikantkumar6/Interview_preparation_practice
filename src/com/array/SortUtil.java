package com.array;

public class SortUtil {
	
	public static void main(String ...s) {
		//int a[]= {5,4,3,2,1};
		int a[]= {1,2,3,4,5};
		System.out.println(isSorted(a));
	}

	private static boolean isSorted(int[] a) {
		if(a == null || a.length <= 1) {
			return true;
		}
		boolean isAscending = a[0] < a[1];
		for(int i=0;i<a.length-1;i++) {
			if(isAscending) {
				if(a[i]>a[i+1]) return false;
			}else {
				if(a[i]<a[i+1]) return false;
			}
		}
		return true;
	}

}
