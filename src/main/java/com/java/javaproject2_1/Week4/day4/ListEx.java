package com.java.javaproject2_1.Week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Hello");
        l1.add(1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size()); // 크기
        System.out.println(l1.isEmpty()); // 비었는지 참/거짓
//        l1.remove(0); // 순차적으로 지움
//        l1.remove(0);
//        System.out.println(l1.isEmpty());
        System.out.println("------------");

        // 반복문 활용해 순서대로 나열
        for(var item: l1) { //
            System.out.println(item); // .split() 사용불가: 타입이 서로 다르면 불가능
        }


    }
}
