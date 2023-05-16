package com.java.javaproject2_1.Week5.day2;

import java.util.Arrays;

public class InsertionSort02 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        for (int i = 0; i < arr.length; i++) {
            // 교환이 안될때 break
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
