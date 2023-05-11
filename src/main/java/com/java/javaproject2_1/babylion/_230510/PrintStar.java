package com.java.javaproject2_1.babylion._230510;

public class PrintStar {
    public void print(int h) {
        for (int i = 0; i < h; i++) {
            System.out.printf("%s%s\n", " ".repeat(i), "*".repeat(5-i));
        }
    }


    public static void main(String[] args) {
//        별찍기 실습
        PrintStar printStar = new PrintStar();
        printStar.print(5);

    }
}
