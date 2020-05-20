package com.sort;

public class BubbleSortMain {

    public static void main(String... s) {
        int[] arr = {100, 25, 15, 30, 5, 75, 40};
        bubbleSort(arr);
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
