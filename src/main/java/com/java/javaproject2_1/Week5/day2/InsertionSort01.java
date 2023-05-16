package com.java.javaproject2_1.Week5.day2;

public class InsertionSort01 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        // i j j-1
        // 1 1 0
        // 2 2 1
        // 2 1 2
        // 3 3 2
        // 3 2 1
        // 3 1 0
        for (int i = 0; i < arr.length; i++) {
            // j가 0까지 빼줌
            for (int j = i; j > 0; j--) {
                System.out.printf("i: %d j: %d j-1: %d \n", i, j, j-1);
            }
        }
    }
}
