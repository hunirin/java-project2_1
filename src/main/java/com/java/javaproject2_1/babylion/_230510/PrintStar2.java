package com.java.javaproject2_1.babylion._230510;

public class PrintStar2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
