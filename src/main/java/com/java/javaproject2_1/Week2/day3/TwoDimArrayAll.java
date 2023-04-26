package com.java.javaproject2_1.Week2.day3;

import java.util.Arrays;

public class TwoDimArrayAll {
    // 입력받은 번호에 해당하는 행 1로 채우는 함수
    public static void fillARow(int[][] arr, int rowNum) {

        for (int i = 0; i < arr.length ; i++) {
            arr[rowNum][i] = 1;
        }
    }

    // 이차원 배열 출력 함수
    public static void printTwoArray(int[][] arr) {
        for (int i=0; i < 5 ; i++) { // 반복문으로 출력
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        int[][] iArr = new int[5][5];

        fillARow(iArr, 0); // 0번 행을 1로 채움
        fillARow(iArr, 1); // 1번 행을 1로 채움

        printTwoArray(iArr);

    }
}

