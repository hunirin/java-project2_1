package com.java.javaproject2_1.Week5.day1;

import java.util.Arrays;

public class BubbleSort2_03 {
    public int[] sortARond2(int[] arr, int until) {
        for (int j = 0; j < until; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            arr = sortARond2(arr, arr.length - j);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort2_03 bs = new BubbleSort2_03();
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = bs.sort(arr);
        System.out.println(Arrays.toString(arr));
        }
}

