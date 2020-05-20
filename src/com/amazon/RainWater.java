package com.amazon;

public class RainWater {

    public static void main(String... s) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int length = arr.length;
        System.out.println(maxWater(arr, length));
    }

    private static int maxWater(int[] arr, int length) {
        int size = length - 1;
        int prev = arr[0];
        int temp = 0;
        int prev_index = 0;
        int water = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] >= prev) {
                prev = arr[i];
                prev_index = i;
                temp = 0;
            } else {
                water += prev - arr[i];
                temp += prev - arr[i];
            }
        }

        if (prev_index < size) {
            water -= temp;
            prev = arr[size];
            for (int i = size; i >= prev_index; i--) {
                if (arr[i] >= prev) {
                    prev = arr[i];
                } else {
                    water += prev - arr[i];
                }
            }
        }
        return water;
    }

}
