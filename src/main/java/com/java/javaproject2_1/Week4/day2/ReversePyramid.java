package com.java.javaproject2_1.Week4.day2;

import java.util.Scanner;

public class ReversePyramid {
    //생성자 붙이기 -> 켜고 끄기 가능, 변경가능
    private String spaceChar = "0";

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    // 메소드로 핵심기능 분리
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(2 * (h - i) - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int h = sc.nextInt();
        for (int i = 0; i < h; i++) {
            // 기존 로직을 method 호출하게 변경
            System.out.print(reversePyramid.makeALine(h, i));
        }
    }
}
