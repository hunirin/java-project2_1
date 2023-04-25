package com.java.javaproject2_1.codeup;

import java.util.Scanner;

public class _1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num[] = sc.nextLine().split(" ");

        long iVal1 = Integer.parseInt(num[0]);
        long iVal2 = Integer.parseInt(num[1]);

        System.out.printf("%d", iVal1 + iVal2);

    }
}
