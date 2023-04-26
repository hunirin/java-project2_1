package com.java.javaproject2_1.Week2.day3;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;
        int first = num % 10;
        num = num / 10;
        int second = num % 10;
        num = num / 10;
        int third = num % 10;

        System.out.println(first + second + third);
    }
}
