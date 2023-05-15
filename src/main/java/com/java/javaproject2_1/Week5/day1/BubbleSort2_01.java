package com.java.javaproject2_1.Week5.day1;

import java.util.Arrays;

public class BubbleSort2_01 {
    // i는 고정,  j가 1번부터 n까지 비교
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        int i = 0;
        for (int j = 1; j < arr.length -1; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
