package com.java.javaproject2_1.codeup;

import java.util.Scanner;

public class _1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num[] = sc.next().split("-");

        int front = Integer.parseInt(num[0]);
        int back = Integer.parseInt(num[1]);

        System.out.printf("%06d%d",front, back);

    }
}
