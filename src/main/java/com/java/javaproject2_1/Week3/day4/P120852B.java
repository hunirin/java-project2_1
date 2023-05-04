package com.java.javaproject2_1.Week3.day4;

public class P120852B {
    public static void main(String[] args) {
//      소인수 분해
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1]; // 12개나 만들어야하나?
        int idx = 0;

        while (n > 1) {
            if (n % divisor == 0) { // 나누어 떨어지는지?
                arr[idx++] = divisor;
                n /= divisor;
            } else {
                // 12 -> 6 -> 3 인 경우 2로 안나누어떨어짐
                divisor++;
            }
        }

        for (int i = 0; i < arr.length; i++) System.out.printf("%d ", arr[i]);
    }
}
