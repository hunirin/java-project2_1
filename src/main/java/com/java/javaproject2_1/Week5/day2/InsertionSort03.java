package com.java.javaproject2_1.Week5.day2;

import java.util.Arrays;

public class InsertionSort03 {

    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // 교환이 안될때 break
            for (int j = i; j > 0; j--) {
                if(arr[j - 1] - arr[j] > 0 ) { // 내림차순
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

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        InsertionSort03 is = new InsertionSort03();
        arr = is.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
