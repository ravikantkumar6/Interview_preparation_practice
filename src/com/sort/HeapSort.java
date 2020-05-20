package com.sort;

public class HeapSort {

    public static int[] heapSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            insertHeap(arr[i]);
        for (int i = 0; i < arr.length; i++)
            arr[i] = extractHeadOfHeap();
        return arr;
    }

    private static int extractHeadOfHeap() {
        // TODO Auto-generated method stub
        return 0;
    }

    private static void insertHeap(int i) {
        // TODO Auto-generated method stub

    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
