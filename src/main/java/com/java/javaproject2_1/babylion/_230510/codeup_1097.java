package com.java.javaproject2_1.babylion._230510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1097 {
    public static void main(String[] args) throws IOException {
//      1. 바둑판 세팅: 19*19
        int[][] arr = new int[19][19];
//      2. 입력값을 받아 바둑판에 돌을 놓음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 19; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 19; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
//      3. 뒤집기 횟수가 입력됨 (단, n은 10이하 자연수)
        int cnt = Integer.parseInt(br.readLine());
//      4. 뒤집기 좌표가 횟수만큼 입력됨
        for (int i = 0; i < cnt; i++) {
            String[] location = br.readLine().split(" ");
            // -1 한 이유: {10, 10} -> {9, 9} why? 배열 인덱스가 0부터 시작하니까
            int x = Integer.parseInt(location[0]) - 1;
            int y = Integer.parseInt(location[1]) - 1;
//      5. 뒤집는다 (한 행, 한 열을 바꿔주기)
            for (int j = 0; j < 19; j++) {
                arr[x][j] = arr[x][j] == 1 ? 0 : 1;
            }
            for (int j = 0; j < 19; j++) {
                arr[j][y] = arr[j][y] == 1 ? 0 : 1;
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
