package com.java.javaproject2_1.codeup1001_1050;

import java.util.Scanner;

public class _1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        int hexa = Integer.parseInt(num, 16);
        System.out.printf("%o", hexa);

    }
}
