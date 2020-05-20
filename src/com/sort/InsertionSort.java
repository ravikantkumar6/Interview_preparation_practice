package com.sort;

public class InsertionSort {
	
	private static int[] insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i],j=i;
			while(j>0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		return arr;
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {

		int arr[] = { 10, 5, 30, 15, 50, 6 };
		System.out.println("Array to be sorted...");
		printArray(arr);

		insertionSort(arr);

		System.out.println("Sorted Array...");
		printArray(arr);

	}

}
