package com.java.javaproject2_1.babylion._230503;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
//      첫번째 원소와 두번째 원소를 바꿔보셈
//      두 손 위에 물체가 있음. 이거를 바꿔볼거야
//      한 손에 있는 걸 다른 곳에 잠깐 두고 바꿈

        int[] arr = {1, 2, 3, 4, 5};
        int temp; // temp > temporary의 약자 임시로 놔둔다 생각
        temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));

//      복합 연산자, 대입 연산자, 증감 연산자 > 강사님 자료보고 다시

        int x = 10;
        int y = 5;
//        --x : 피연산자 x를 1 감소 시키고 연산을 한다
//        y++ : 연산을 하고 y를 1 증가 시킨다.
        System.out.println(--x + y++);


    }
}
