package com.java.javaproject2_1.codeup1001_1050;

import java.util.Scanner;

public class _1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str[] = sc.next().split("\\.");

        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
