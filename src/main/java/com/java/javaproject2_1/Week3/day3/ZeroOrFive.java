package com.java.javaproject2_1.Week3.day3;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num){
        while (num > 0) {
            int remainder = num % 10;
            if(remainder % 5 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 252;
        // 10으로 나눈 나머지가 5로 나누었을 때 0또는 5인지 check
        // num % 10 == 5 || num % 10 == 0

        boolean r = isZeroOrFive(num);
        System.out.println(r);

    }
}
