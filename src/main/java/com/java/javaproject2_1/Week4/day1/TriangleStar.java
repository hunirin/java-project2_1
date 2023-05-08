package com.java.javaproject2_1.Week4.day1;

public class TriangleStar {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++ ) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
