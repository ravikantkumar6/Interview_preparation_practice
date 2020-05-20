package com.sort;

public class BubbleSort {

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 30, 15, 50, 6};
        System.out.println("Array to be sorted...");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array...");
        printArray(arr);

    }

}
