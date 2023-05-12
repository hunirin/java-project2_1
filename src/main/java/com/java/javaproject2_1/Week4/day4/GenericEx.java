package com.java.javaproject2_1.Week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        // 문자형 - 숫자 안들어감
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("bye");
        strList.add("1"); // 문자열로 들어감

        // 숫자형
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);

        // 제네릭 장점: 무슨 타입이 나올지 예측할 수 있음
    }
}
