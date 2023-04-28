package com.java.javaproject2_1.babylion._230426;

import java.util.Scanner;

public class JavaTest_1 {
    public static void main(String[] args) {
        // 변수 없이 스캐너로 입력받아 평균내기
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.1f", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat()) / 3);
    }
}
