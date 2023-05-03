package com.java.javaproject2_1.babylion._230503;

public class For {
    public static void main(String[] args) {
//        for(초기화식; 조건식; 증감식) { }

        int[] array = {1, 2, 3, 4, 5};
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//      개발자는 항상 최악의 경우를 염두하고 개발 해야함
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                System.out.printf("arr[%d][%d] = %d ", i, j, arr2[i][j]);
                if (j == arr2[i].length - 1) {
                    System.out.println();
                }
            }
        }
    }
}
