package com.java.javaproject2_1.codeup;

import java.util.Scanner;

public class _1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] num = sc.nextLine().split("");

        System.out.println("[" + Integer.parseInt(num[0]) * 10000 + "]");
        System.out.println("[" + Integer.parseInt(num[1]) * 1000 + "]");
        System.out.println("[" + Integer.parseInt(num[2]) * 100 + "]");
        System.out.println("[" + Integer.parseInt(num[3]) * 10 + "]");
        System.out.println("[" + Integer.parseInt(num[4]) * 1 + "]");

    }
}
