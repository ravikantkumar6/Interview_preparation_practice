package com.sort;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = end;
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11};

        System.out.println("User entered Array: ");
        QuickSort.printArray(array);

        QuickSort.quickSort(array, 0, array.length - 1);

        System.out.println("\n\nAfter sorting: ");
        QuickSort.printArray(array);
    }

}
