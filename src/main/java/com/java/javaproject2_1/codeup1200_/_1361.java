package com.java.javaproject2_1.codeup1200_;

import java.util.Scanner;

public class _1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++ ) {

            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            System.out.printf("**");
            System.out.println("");
        }
    }
}
