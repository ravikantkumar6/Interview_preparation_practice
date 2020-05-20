package com.array;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthSubArray {

    public static void main(String... s) {
        int[] a = {5, 6, -5, 5, 3, 5, 3, -2, 0};
        int sum = 8;
        maxLengthSubArray(a, sum);
    }

    private static void maxLengthSubArray(int[] a, int sum) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int arrSum = 0;
        int length = 0;
        int end_index = -1;
        for (int i = 0; i < a.length; i++) {
            arrSum += a[i];
            if (!map.containsKey(arrSum)) map.put(arrSum, i);
            if (map.containsKey(arrSum - sum) && length < i - map.get(arrSum - sum)) {
                length = i - map.get(arrSum - sum);
                end_index = i;
            }
        }
        System.out.println("[" + (end_index - length + 1) + "," + end_index + "]");
    }

}
