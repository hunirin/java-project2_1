package com.java.javaproject2_1.Week1.day4;

import java.util.Scanner;

public class ScannerEx2 {
    public void inputTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하세요. 입력 후 엔터");
        System.out.print("첫번째 숫자: ");
        System.out.print("첫번째 숫자는 " + sc.nextInt() + "입니다.\n");
        System.out.print("두번째 숫자는: ");
        System.out.print("두번째 숫자는 " + sc.nextInt() + "입니다.");
    }
}
