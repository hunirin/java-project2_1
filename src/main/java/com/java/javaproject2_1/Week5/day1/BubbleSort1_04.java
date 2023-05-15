package com.java.javaproject2_1.Week5.day1;

import java.util.Arrays;

public class BubbleSort1_04 {
    // OOP 적용 - 반복하는 기능을 sort()로 분리
    public int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < until; i++) { // 1 -> j
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            arr = sortARound(arr, arr.length - j);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort1_04 bubbleSort04 = new BubbleSort1_04();
        int[] arr = {7, 2, 3, 9, 28, 1};
        arr = bubbleSort04.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
