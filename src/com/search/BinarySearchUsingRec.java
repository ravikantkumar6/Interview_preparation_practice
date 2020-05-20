package com.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingRec {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Java Program to perform binary search on int array");
		System.out.println("Enter total no of elements:");
		int length = scanner.nextInt();
		int input[] = new int[length];
		System.out.printf("Enter %d integer %n", length);
		for(int i = 0;i<length;i++) {
			input[i] = scanner.nextInt();
		}
		Arrays.parallelSort(input);
		System.out.println("Please enter number to be searched in array");
		int key = scanner.nextInt();
		//int index = recBinarySearch(input,key);
		int index= 0;
		if( index == -1) {
			System.out.printf("Sorry, %d is not found in the array %n", key);
		}else{
			System.out.printf("%d is found in the array at index %d %n", key,index);
		}
		scanner.close();
	}

}
