package com.java.javaproject2_1.Week5.day2;

import java.util.Arrays;

public class SelectionSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        int targetValue = arr[0];
        int targetIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if(targetValue > arr[i]) {
                targetValue = arr[i];
                targetIdx = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[targetIdx];
        arr[targetIdx] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
