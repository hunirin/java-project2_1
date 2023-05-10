package com.java.javaproject2_1.Week4.day3;

public class DrawDiamond {
    public static String getRepeatedSymbol (String symbol, int n) {
        return symbol.repeat(n);
    }

//  피라미드
//  0 출력 : pivot - i * 출력 : 2 * i + 1
//
//  역피라미드
//  0 출력 : i - pivot * 출력 : 2 * (h - i) - 1

    public static void main(String[] args) {
        int h = 5;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
//            System.out.printf("pivot: %d %d\n", pivot, i);
            if ( i <= pivot) {
                // 피라미드 로직
                // 초항이 3 등차가 -2
                System.out.printf("%s%s\n", getRepeatedSymbol("0", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                // 역피라미드 로직
                System.out.printf("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    }
}
