package com.java.javaproject2_1.Week2.day2;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "10 3 19 28 7 488";
        String[] strArr = str.split(" ");

        System.out.println(strArr[0]); // 10
        System.out.println(strArr[1]); // 3
        System.out.println(strArr[2]); // 19
        System.out.println(strArr[3]); // 28
        System.out.println(strArr[4]); // 7
        System.out.println(strArr[5]); // 488
    }
}
