package com.java.javaproject2_1.codeup;

import java.util.Scanner;

public class _1020_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.next();
        System.out.println(data.substring(0,6) + data.substring(7,14));
    }
}
