package com.sort;

public class SelectionSort {
	
	private static int[] selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			if(i != minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
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

		selectionSort(arr);

		System.out.println("Sorted Array...");
		printArray(arr);

	}
}
