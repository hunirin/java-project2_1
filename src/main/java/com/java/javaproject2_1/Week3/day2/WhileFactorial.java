package com.java.javaproject2_1.Week3.day2;

public class WhileFactorial {
    public static void main(String[] args) {
        // 5! = 120
        int num = 5;
        int answer = 1;
        while (num > 0) {
            answer = answer * num;
            num--;
            // 위 두줄을 하나로 합치면 answer *= num--;
        }
        System.out.println(answer);
    }
}
