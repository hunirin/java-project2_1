package com.java.javaproject2_1.babylion._230510;

import java.util.Scanner;

public class codeup_1098 {
    public static void main(String[] args) {
        // 1. 첫 줄에 세로 h, 가로 w 입력
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
        // 2. 둘째줄에 막대의 개수 n 입력
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // 3. 셋째줄에 막대의 길이 l, 방향 d, 좌표 x, y 입력
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            // 막대를 놓을건데 가로, 세로 구분 해야함
            for (int j = 0; j < l; j++) {
                if (d == 0) {
                    // 막대 놓는 방향이 가로면
                    arr[x][y + j] = 1;
                } else {
                    // 막대 놓는 방향이 세로면
                    arr[x + j][y] = 1;
                }
            }
        }
        // 결과값 출력

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}