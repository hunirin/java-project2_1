package com.java.javaproject2_1.Week2.day3;

import java.util.Arrays;

public class ArrayDefineAndAssign {
    public static void main(String[] args) {
        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));

        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
    }
}
