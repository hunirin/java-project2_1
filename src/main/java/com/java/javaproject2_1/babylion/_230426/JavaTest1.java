package com.java.javaproject2_1.babylion._230426;

import java.util.Scanner;

public class JavaTest1 {
    public static void main(String[] args) {
        //스캐너 사용해서 숫자 3개 받아서 평균을 구하시오. (단, 소수점 둘째자리에서 반올림)
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        float average = (num1 + num2 + num3) / 3;

        System.out.printf("%.1f", average);
    }
}
