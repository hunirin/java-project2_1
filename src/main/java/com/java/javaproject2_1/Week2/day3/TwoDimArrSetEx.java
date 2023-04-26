package com.java.javaproject2_1.Week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrSetEx {
        public static void printArray(int[][] arr) {
            System.out.println(Arrays.toString(arr[0]));
            System.out.println(Arrays.toString(arr[1]));
            System.out.println(Arrays.toString(arr[2]));
            System.out.println(Arrays.toString(arr[3]));
            System.out.println(Arrays.toString(arr[4]));
            System.out.println("----------------");
        }

        //행 번호를 넣으면 그 행을 1로 값을 넣어주는 static method

        public static void main(String[] args) {
            System.out.printf("행 번호를 입력하시오.(0~4)\n");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            int[][] arr = new int[5][5];

            arr[num][0] = 1;
            printArray(arr);

            /*

            arr[0][0] = 1;
            arr[0][2] = 2;
            arr[1][0] = 3;
            printArray(arr);

            arr[1][1] = 5;
            printArray(arr);

             */
        }
}
