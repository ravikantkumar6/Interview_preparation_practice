package com.sort;

public class MergeSort {

	public static void mergeSort(int arr[],int left,int right) {
		if(right > left) {
			int middle = (left + right)/2;
			mergeSort(arr,left,middle);
			mergeSort(arr, middle+1, right);
			merge(arr,left,middle,right);
		}
	}

	private static void merge(int[] arr, int left, int middle, int right) {
		int[] leftTmpArray = new int[middle-left+2];
		int[] rightTmpArray = new int[right-middle+1];
		for(int i=0;i<=middle-left;i++) leftTmpArray[i]=arr[left+i];
		for(int i=0;i<right-middle;i++) rightTmpArray[i] = arr[middle+1+i];
		int i=0,j=0;
		leftTmpArray[middle-left+1]= Integer.MAX_VALUE; //Merge values and insert into Array 'A'
		rightTmpArray[right-middle] = Integer.MAX_VALUE;
		for(int k = left;k<=right;k++) {
			if(leftTmpArray[i] < rightTmpArray[j]) {
				arr[k] = leftTmpArray[i++];
			}else {
				arr[k] = rightTmpArray[j++];
			}
		}
	}
	
	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
	
public static void main(String[] args) {
		
		int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		
		System.out.println("User entered Array: ");
		MergeSort.printArray(array);
		
		long start = System.nanoTime();
		MergeSort.mergeSort(array, 0, array.length-1);
		long end = System.nanoTime();
		System.out.println("\n\nTime to execute this algo: " + (end-start));
		
		System.out.println("\nAfter sorting: ");
		MergeSort.printArray(array);
	}
}
