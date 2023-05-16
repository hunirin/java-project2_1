package com.java.javaproject2_1.Week5.day2;

import java.util.Arrays;

public class InsertionSort04 {
    // desc -> 내림차순
    // asc -> 오름차순
    public int[] sort(int[] arr, boolean isAscending){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((isAscending ? arr[j - 1] - arr[j] : arr[j] - arr[j - 1]) > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        return sort(arr, true);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        InsertionSort04 is = new InsertionSort04();
        arr = is.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
