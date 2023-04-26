package com.java.javaproject2_1.Week2.day3;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        // 오름차순으로 정렬하는 알고리즘을 만드시오
        int[] arr = {2, 1, 4, 8, 7, 6};
        int temp = arr[0]; // 0번에 있는 값 저장
        int temp2 = arr[3]; // 3번 값 저장

        arr[0] = arr[1]; // 0번에 1번 값 덮어쓰기
        arr[1] = temp; // 임시로 저장한 값을 1번에 넣기
        arr[3] = arr[5];
        arr[5] = temp2;

        System.out.println(Arrays.toString(arr));

    }
}
