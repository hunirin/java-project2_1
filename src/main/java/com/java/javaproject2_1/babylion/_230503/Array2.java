package com.java.javaproject2_1.babylion._230503;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
//        2차원 배열? 수학에서 행렬을 생각
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));
//      5 1행 1열
        array[1][1] = 100;
        System.out.println(array[1][1]);
        System.out.println(Arrays.deepToString(array));



    }
}
