package com.java.javaproject2_1.Week3.day3;

import java.util.Scanner;

public class DoWhileEvenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("짝수를 입력하시오 : ");
            num = sc.nextInt();

        } while(num % 2 != 0);

        System.out.println("올바른 짝수가 입력되었습니다.");
    }
}
