package com.java.javaproject2_1.babylion._230503;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//      배열 -> 한번 크기가 정해지면 나중에 바꿀수 없음
//      크기 고려하지 않는 건 없나? > 나중에 연결 리스트 라고 나옴
        // int[] arr = new int[5]; // [ ] 안에 크기를 정해줘야함
        // int[] arr2 = new int[]{1, 2, 3, 4, 5};
//        int[] arr = {1, 2, 3, 4, 5}; // 규쌤은 보통 이거씀


        // System.out.println(Arrays.toString(arr3));
//      index 인덱스? 배열에서의 위치를 가리키는 숫자
//        arr[0] = 100;
//        System.out.println(arr[0]);
//      0부터 쓰는 이유 -> 0의 자리가 낭비되는게 싫어서 0부터 시작

//      참조 타입은 기본적으로 null로 초기화 됨
//      why null? 참조 변수가 객체를 가리키지 않을 때를 명시하려고 씀
//        String[] strArr = new String[5];
//        System.out.println(Arrays.toString(strArr));

        Student[] students = new Student[3];
        Student st1 = new Student();
        st1.age = 10;
        st1.name = "학생1";
        students[0] = st1;
        students[1] = new Student();
        students[1].name = "학생2";
        System.out.println(Arrays.toString(students));
    }
}
